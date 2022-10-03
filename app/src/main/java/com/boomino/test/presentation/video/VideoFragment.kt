package com.boomino.test.presentation.video

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import com.boomino.test.base.ObserverDataBindingFragment
import javax.inject.Inject
import com.boomino.test.result.Result
import com.boomino.test.R
import com.boomino.test.databinding.FragmentVideoBinding
import com.boomino.test.util.extensions.hide
import com.boomino.test.util.extensions.show
import com.boomino.test.util.extensions.toast

@AndroidEntryPoint
class VideoFragment :
    ObserverDataBindingFragment<FragmentVideoBinding>(R.layout.fragment_video) {
    private val videoViewModel: VideoViewModel by viewModels()

    @Inject
    lateinit var videoAdapter: VideoAdapter

    @Inject
    lateinit var categoryAdapter: CategoryAdapter

    private var isLocalEnable = true

    override fun setupViews() {

        videoViewModel.getCategorizedVideo("", 10)

        setUpVideoRecyclerView()
        setUpCategoryRecyclerView()

        binding.btnSearch.setOnClickListener {
            videoViewModel.getSearchVideoList(binding.edtSearch.text.toString(), isLocalEnable)
        }

    }

    private fun setUpVideoRecyclerView() {
        binding.rvVideos.layoutManager = GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)
        binding.rvVideos.adapter = videoAdapter
        videoAdapter.onItemClick = {
            findNavController().navigate(
                VideoFragmentDirections.actionVideoFragmentToVideoDetailFragment(
                    it
                )
            )
        }
    }

    private fun setUpCategoryRecyclerView() {
        binding.rvCategories.adapter = categoryAdapter
        categoryAdapter.onItemClick = { category ->
            isLocalEnable = false
            videoViewModel.getFilterVideos(category.id, 10)
        }
    }

    override fun observe() {
        observeVideoFromLocal()
        observeVideoByCategory()
        observeCategory()
        observeSearch()
    }

    private fun observeVideoFromLocal() {
        videoViewModel.videoLiveData.observe(this) { result ->
            when (result) {
                is Result.Loading -> {
                    binding.progress.show()
                }

                is Result.Success -> {
                    binding.progress.hide()
                    videoAdapter.submitList(result.data)

                }
                is Result.Error -> {
                    context?.toast(result.exception.message.toString())
                }
            }
        }
    }

    private fun observeVideoByCategory() {
        videoViewModel.videoFilterLiveData.observe(this) { result ->
            when (result) {
                is Result.Loading -> {
                    binding.progress.show()
                }
                is Result.Success -> {
                    binding.progress.hide()
                    videoAdapter.submitList(result.data)
//                    videoAdapter.notifyItemRangeChanged(0, videoAdapter.itemCount);

                }
                is Result.Error -> {
                    context?.toast(result.exception.message.toString())
                }
            }

        }
    }

    private fun observeCategory() {
        videoViewModel.category.observe(this) { result ->
            when (result) {
                is Result.Loading -> {
                    binding.progress.show()
                }
                is Result.Success -> {
                    binding.progress.hide()
                    categoryAdapter.submitList(result.data)
                }
                is Result.Error -> {
                    context?.toast(result.exception.message.toString())
                }
            }

        }
    }

    private fun observeSearch() {
        videoViewModel.searchVideoLiveData.observe(this) {
            videoAdapter.submitList(it)
        }
    }
}