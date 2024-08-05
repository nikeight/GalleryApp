package com.example.galleryappmobikwik.feature.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.galleryappmobikwik.R

@Composable
fun ImagesRow(
    modifier: Modifier = Modifier,
    imageList: List<String?>,
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(imageList) { newImage ->
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(newImage)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.imgae_holder),
                contentDescription = "image_desc",
                contentScale = ContentScale.Crop,
                modifier = modifier.size(height = 80.dp, width = 60.dp)
            )
        }
    }
}