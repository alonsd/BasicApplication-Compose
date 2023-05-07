package com.basicapplicationcompose.data.source.remote.api

import com.haroldadmin.cnradapter.NetworkResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("{accessToken}/search/{name}")
    suspend fun getModel(
        @Path("accessToken") accessToken : String,
        @Path("name") name : String,
    ): NetworkResponse<String, String>
}