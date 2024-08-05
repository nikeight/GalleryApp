package com.example.galleryappmobikwik.data

import com.example.galleryappmobikwik.data.model.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

// Todo : Save the key to the local.properties
const val CLIENT_ID = "vJKXBk2ks9uUNHLhSRitTTZ8DIOg05ZofrqJCBkEgL8"
const val AUTHORIZATION_CLIENT_ID_PARAM = "client_id"

const val GET_IMAGES_END_POINT = "photos/"

interface UnsplashApi {

    @GET(GET_IMAGES_END_POINT)
    suspend fun provideImageList(
        @Query(AUTHORIZATION_CLIENT_ID_PARAM) clientId: String? = CLIENT_ID,
    ): Response<ImageResponse>
}