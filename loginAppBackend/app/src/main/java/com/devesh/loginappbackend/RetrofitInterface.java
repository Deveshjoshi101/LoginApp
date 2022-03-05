package com.devesh.loginappbackend;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {

        @POST("/login")
        Call<Login> executeLogin(@Body HashMap<String, String> map);

        @POST("/signup")
        Call<Void> executeSignup (@Body HashMap<String, String> map);

    }
