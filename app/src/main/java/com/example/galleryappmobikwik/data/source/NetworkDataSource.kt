package com.example.galleryappmobikwik.data.source

import com.example.galleryappmobikwik.data.UnsplashApi
import com.example.galleryappmobikwik.data.model.ImageResponse
import com.example.galleryappmobikwik.data.util.NetworkResponse
import com.example.galleryappmobikwik.data.util.safeApiCallResponse
import javax.inject.Inject

class NetworkDataSource @Inject constructor(
    private val unsplashApi: UnsplashApi
) : NetworkDataSourceI {
    override suspend fun fetchImages(): NetworkResponse<ImageResponse> {
       return safeApiCallResponse {
           unsplashApi.provideImageList()
       }
    }
}


interface NetworkDataSourceI {
    suspend fun fetchImages() : NetworkResponse<ImageResponse>
}