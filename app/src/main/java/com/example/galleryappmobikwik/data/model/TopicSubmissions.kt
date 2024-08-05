package com.example.galleryappmobikwik.data.model


import com.google.gson.annotations.SerializedName

data class TopicSubmissions(
    @SerializedName("architecture-interior")
    val architectureInterior: ArchitectureInterior?,
    @SerializedName("3d-renders")
    val dRenders: DRenders?,
    @SerializedName("experimental")
    val experimental: Experimental?,
    @SerializedName("nature")
    val nature: Nature?,
    @SerializedName("pastels")
    val pastels: Pastels?,
    @SerializedName("travel")
    val travel: Travel?,
    @SerializedName("ugc")
    val ugc: Ugc?,
    @SerializedName("wallpapers")
    val wallpapers: Wallpapers?
)