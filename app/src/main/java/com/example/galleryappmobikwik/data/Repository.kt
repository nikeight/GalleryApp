package com.example.galleryappmobikwik.data

import com.example.galleryappmobikwik.data.model.ImageResponse
import com.example.galleryappmobikwik.data.source.NetworkDataSourceI
import com.example.galleryappmobikwik.data.util.NetworkResponse
import javax.inject.Inject

interface Repository {
    suspend fun provideImagesList(): ImageResponse?
}

class RepositoryImpl @Inject constructor(
    private val networkDataSourceI: NetworkDataSourceI,
) : Repository {
    // Result Wrapper
    override suspend fun provideImagesList(): ImageResponse? {
        return when (val result = networkDataSourceI.fetchImages()) {
            is NetworkResponse.Success -> {
                return result.data
            }

            is NetworkResponse.Failure -> {
                println("Api Failed Reason ${result.throwable}")
                null
            }

            is NetworkResponse.Unauthorized -> {
                println("Un-Authorized")
                null
            }
        }
    }
}