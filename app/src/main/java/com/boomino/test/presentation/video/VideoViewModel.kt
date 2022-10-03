package com.boomino.test.presentation.video

import androidx.lifecycle.*
import com.boomino.test.domain.model.ItemVideo
import com.boomino.test.domain.usecase.CategoryUseCase
import com.boomino.test.domain.usecase.GetAllVideosUseCase
import com.boomino.test.domain.usecase.GetFilterVideosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.boomino.test.result.Result
import com.boomino.test.result.data

@HiltViewModel
class VideoViewModel @Inject constructor(
    private val getAllVideosUseCase: GetAllVideosUseCase,
    private val getFilterVideosUseCase: GetFilterVideosUseCase,
    private val categoryUseCase: CategoryUseCase
) : ViewModel() {

    private val _videoLiveData = MutableLiveData<Result<List<ItemVideo>>>()
    val videoLiveData: LiveData<Result<List<ItemVideo>>> = _videoLiveData

    private val _videoFilterLiveData = MutableLiveData<Result<List<ItemVideo>>>()
    val videoFilterLiveData: LiveData<Result<List<ItemVideo>>> = _videoFilterLiveData

    private val _searchVideoLiveData = MutableLiveData<List<ItemVideo>>()
    val searchVideoLiveData: LiveData<List<ItemVideo>> = _searchVideoLiveData

    fun getCategorizedVideo(categoryId: String, page: Int) {
        viewModelScope.launch {
            getAllVideosUseCase(Pair(categoryId, page)).collect {
                _videoLiveData.value = it
            }
        }
    }

    fun getSearchVideoList(word: String, isLocalEnable: Boolean) {
        if (isLocalEnable)
            _searchVideoLiveData.value = _videoLiveData.value?.data?.filter {
                it.name.contains(word)
            }
        else
            _searchVideoLiveData.value = _videoFilterLiveData.value?.data?.filter {
                it.name.contains(word)
            }

    }

    fun getFilterVideos(categoryId: String, page: Int) {
        viewModelScope.launch {
            _videoFilterLiveData.value = getFilterVideosUseCase(Pair(categoryId, page))

        }
    }

    val category = liveData {
        categoryUseCase(Unit).collect {
            emit(it)
        }
    }

}