package com.example.galleryappmobikwik.data.model


import com.google.gson.annotations.SerializedName

data class ArchitectureInterior(
    @SerializedName("approved_on")
    val approvedOn: String?,
    @SerializedName("status")
    val status: String?
)