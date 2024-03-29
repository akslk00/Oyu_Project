package com.sunny.oyoapp.api;



import com.sunny.oyoapp.model.Res;
import com.sunny.oyoapp.model.User;
import com.sunny.oyoapp.model.UserRes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserApi {

    // 회원가입 API
    @POST("/user/register")
    Call<UserRes> register(@Body User user);

    // 로그인 API
    @POST("/user/login")
    Call<UserRes> login(@Body User user);

    // 로그아웃 API
    @DELETE("/user/logout")
    Call<Res> logout(@Header("Authorization") String token);
}
