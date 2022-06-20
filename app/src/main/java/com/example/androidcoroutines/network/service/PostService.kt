package com.example.androidcoroutines.network.service

import com.example.androidcoroutines.model.Post
import retrofit2.Call
import retrofit2.http.*

interface PostService {

    @Headers(
        "Content-type:application/json"
    )

    @GET("posts")
    fun listPost(): Call<ArrayList<Post>>

    @GET("posts/{id}")
    fun getPost(@Path("id") id: Int): Call<Post>

    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: Int): Call<Post>

}