package com.example.galleryappmobikwik.feature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.galleryappmobikwik.feature.components.CenterImageView
import com.example.galleryappmobikwik.feature.components.ImagesRow

@Composable
fun GalleryScreen(
    modifier: Modifier = Modifier,
    viewModel: GalleryViewModel = hiltViewModel(),
) {
    val imageList = viewModel.images.collectAsState()

    Column(
        modifier.fillMaxSize()
    ) {
        CenterImageView(imageUrl = "")
        ImagesRow(imageList = imageList.value)
    }
}