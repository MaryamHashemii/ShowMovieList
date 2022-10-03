package com.boomino.test.presentation.video

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.boomino.test.data.remote.dto.response.Category
import com.boomino.test.databinding.ItemCategoryBinding
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class CategoryAdapter @Inject constructor(@ActivityContext private val context: Context) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    var onItemClick: ((Category) -> Unit)? = null

    private val diffCallback = object : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean =
            oldItem == newItem
    }

    private val differ = AsyncListDiffer<Category>(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCategoryBinding.inflate(inflater, parent, false)
        return CategoryViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount() = differ.currentList.size

    fun submitList(data: List<Category>) {
        differ.submitList(data)
    }

    class CategoryViewHolder(
        private val binding: ItemCategoryBinding,
        private val onItemClick: ((Category) -> Unit)?
    ) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(data: Category) {
            binding.txtCategoryTitle.text = data.name
            binding.paretCategory.setOnClickListener {
                onItemClick?.let { callback ->
                    callback(data)
                }

            }

        }

    }
}