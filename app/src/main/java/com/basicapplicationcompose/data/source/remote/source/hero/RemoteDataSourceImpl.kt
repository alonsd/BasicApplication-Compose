package com.basicapplicationcompose.data.source.remote.source.hero

import com.basicapplicationcompose.data.source.remote.api.Api
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val api: Api,
) : RemoteDataSource {


}