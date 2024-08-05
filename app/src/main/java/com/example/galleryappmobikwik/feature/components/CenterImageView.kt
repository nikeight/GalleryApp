package com.example.galleryappmobikwik.feature.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.galleryappmobikwik.R

@Composable
fun CenterImageView(
    modifier: Modifier = Modifier,
    imageUrl: String,
) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        placeholder = painterResource(R.drawable.imgae_holder),
        contentDescription = "image_desc",
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxSize()
    )
}