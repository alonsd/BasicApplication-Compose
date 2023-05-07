package com.basicapplicationcompose.data.repository

import com.basicapplicationcompose.data.source.remote.source.hero.RemoteDataSource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    remoteDataSource: RemoteDataSource
) : Repository {


}

