package com.boomino.test.presentation.video

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.boomino.test.common.imageloading.ImageLoadingService
import com.boomino.test.databinding.ItemLoadingBinding
import com.boomino.test.databinding.ItemVideoBinding
import com.boomino.test.domain.model.ItemVideo
import javax.inject.Inject

class VideoAdapter @Inject constructor(
    private val imageLoadingService: ImageLoadingService
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var onItemClick: ((ItemVideo) -> Unit)? = null

    private val VIEW_TYPE_ITEM = 0
    private val VIEW_TYPE_LOADING = 1

    private val diffCallback = object : DiffUtil.ItemCallback<ItemVideo>() {
        override fun areItemsTheSame(oldItem: ItemVideo, newItem: ItemVideo): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: ItemVideo, newItem: ItemVideo): Boolean =
            oldItem == newItem


    }

    private val differ = AsyncListDiffer<ItemVideo>(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            VIEW_TYPE_ITEM -> {
                VideoViewHolder(
                    ItemVideoBinding.inflate(inflater, parent, false),
                    imageLoadingService,
                    onItemClick
                )
            }
            VIEW_TYPE_LOADING -> {
                EmptyViewHolder(ItemLoadingBinding.inflate(inflater, parent, false))
            }
            else -> {
                VideoViewHolder(
                    ItemVideoBinding.inflate(inflater, parent, false),
                    imageLoadingService,
                    onItemClick
                )
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is VideoViewHolder)
            holder.bind(differ.currentList[position])
        else if (holder is EmptyViewHolder)
            holder.bind()
    }

    override fun getItemCount() = differ.currentList.size

    fun submitList(data: List<ItemVideo>) {
        differ.submitList(data)
    }



    class VideoViewHolder(
        private val binding: ItemVideoBinding,
        private val imageLoadingService: ImageLoadingService,
        var onItemClick: ((ItemVideo) -> Unit)?

    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: ItemVideo) {
            imageLoadingService.loadImage(binding.ivPic, data.images)
            binding.tvTitle.text = data.name
            binding.parentVideo.setOnClickListener {
                onItemClick?.let { callback ->
                    callback(data)

                }
            }
        }

    }

    class EmptyViewHolder(
        private val binding: ItemLoadingBinding,
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {

        }

    }
}