package com.example.galleryappmobikwik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.galleryappmobikwik.feature.GalleryScreen
import com.example.galleryappmobikwik.ui.theme.GalleryAppMobiKwikTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Activity A -> Activity B
 *
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // UI Part
        setContent {
            GalleryAppMobiKwikTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GalleryScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()

    }

    // Dialog
    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

