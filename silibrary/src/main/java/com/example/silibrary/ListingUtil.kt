package com.example.silibrary

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListingUtil {

    companion object {

        fun getListingResponse(url : String) : ListingResponse?{
            var listingResponse : ListingResponse?= null
            val retrofitInterface = RetrofitClient.getRetrofitInstance()?.create(RetrofitInterface::class.java)
            val call = retrofitInterface?.getAllPhotos(url)
            call?.enqueue(object : Callback<ListingResponse>{

                override fun onFailure(call: Call<ListingResponse>, t: Throwable) {
                    listingResponse = null
                }

                override fun onResponse(call: Call<ListingResponse>, response: Response<ListingResponse>) {
                    if (response.isSuccessful){
                        listingResponse = response.body()
                    }
                }

            })

            return listingResponse
        }
    }
}