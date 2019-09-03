package com.example.silibrary

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class RetrofitClient {


    companion object {

        private var retrofit: Retrofit? = null
        private val BASE_URL = "https://www.stumped.app/"

        fun getRetrofitInstance(): Retrofit? {
            if (retrofit == null) {
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }

    }


}