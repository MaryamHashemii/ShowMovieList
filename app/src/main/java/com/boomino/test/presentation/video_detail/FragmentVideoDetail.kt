package com.boomino.test.presentation.video_detail

import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import com.boomino.test.base.BaseDataBindingFragment
import com.boomino.test.R
import com.boomino.test.common.imageloading.ImageLoadingService
import com.boomino.test.databinding.FragmentVideoDetailBinding
import javax.inject.Inject

@AndroidEntryPoint
class FragmentVideoDetail :
    BaseDataBindingFragment<FragmentVideoDetailBinding>(R.layout.fragment_video_detail) {
    private val args: FragmentVideoDetailArgs by navArgs()

    @Inject
    lateinit var imageLoadingService: ImageLoadingService

    override fun setupViews() {
        imageLoadingService.loadImage(binding.imgVideo, args.videoInfo.images)
        binding.txtCountOfView.text = " تعداد بازدید: ${args.videoInfo.visit_cnt}"
        binding.txtTitle.text = args.videoInfo.name
        binding.txtUserName.text = args.videoInfo.username

    }


}