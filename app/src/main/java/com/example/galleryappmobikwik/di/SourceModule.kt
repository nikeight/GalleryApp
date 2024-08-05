package com.example.galleryappmobikwik.di

import com.example.galleryappmobikwik.data.source.NetworkDataSource
import com.example.galleryappmobikwik.data.source.NetworkDataSourceI
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SourceModule {

    @Singleton
    @Binds
    abstract fun bindNetworkSource(
        networkDataSource: NetworkDataSource
    ): NetworkDataSourceI
}