package com.example.silibrary

import org.json.JSONArray
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url


interface RetrofitInterface {

    @GET
    fun getAllPhotos(@Url url: String): Call<ListingResponse>

}