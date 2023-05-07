package com.basicapplicationcompose.di

import com.basicapplicationcompose.data.source.remote.source.hero.RemoteDataSource
import com.basicapplicationcompose.data.source.remote.source.hero.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    @Singleton
    abstract fun bindRemoteHeroDataSource(
        remoteHeroDataSourceImpl: RemoteDataSourceImpl
    ): RemoteDataSource

}