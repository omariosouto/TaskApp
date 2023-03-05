package com.devmasterteam.tasks.service.repository.remote

import com.devmasterteam.tasks.service.model.PersonModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface PersonService {

    // http://devmasterteam.com/CursoAndroidAPI/Authentication/Login
    @POST("Authentication/Login")
    @FormUrlEncoded //Used for body informations
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<PersonModel>

    //http://devmasterteam.com/CursoAndroidAPI/Authentication/Create
    @POST("Authentication/Create")
    @FormUrlEncoded
    fun create(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<PersonModel>

}