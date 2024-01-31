package com.sunny.oyoapp.api;

import com.sunny.oyoapp.model.RecipeList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.Query;

public interface RecipeApi {

    // 모든 레시피(간략히) 가져오는 API
    @GET("/recipe")
    Call<RecipeList> getMainRecipe(@Header("Authorization") String token,
                                      @Query("order") String order,
                                      @Query("offset") int offset,
                                      @Query("limit") int limit);


    // 모든 레시피(상세히) 가져오는 API
    @GET("/recipemore")
    Call<RecipeList> getMyPosting(@Header("Authorization") String token,
                                   @Query("offset") int offset,
                                   @Query("limit") int limit);

}
