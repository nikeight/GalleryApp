package com.example.galleryappmobikwik.feature

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.galleryappmobikwik.data.Repository
import com.example.galleryappmobikwik.data.model.ImageResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GalleryViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _imageList: MutableStateFlow<List<String?>> = MutableStateFlow(emptyList())
    val images : StateFlow<List<String?>> = _imageList

    // State : String URL for the Central View

    init {
        viewModelScope.launch {
            val response = repository.provideImagesList()
            if (response.isNullOrEmpty().not()) {
                val list = response?.map {
                    it.urls?.small
                }
                list?.let { imageList ->
                    _imageList.emit(imageList)
                }
            }
        }
    }

    fun scrollToNewImage(list : List<String>){
        val number = 5
        println(number.addANumberToIt(5))
    }

    fun Int.addANumberToIt(newNumber : Int) : Int {
        return this.plus(newNumber)
    }
}