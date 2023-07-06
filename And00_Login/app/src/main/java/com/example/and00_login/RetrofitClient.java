package com.example.and00_login;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

//import retrofit2.converter.scalars.
public class RetrofitClient {
    //baseUrl ( http://192.168.0.38/middle/ ) : Spring에서 프로젝트까지의 경로(Home)
    //ScalarsConverterFactory : 단일String(Json)형태로 데이터가 공유될때 사용하는 객체
    public Retrofit getRetrofit(){
         Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.0.38:8080/middle/")
                 .addConverterFactory(ScalarsConverterFactory.create())
            .build();
         return retrofit;
    }


   // Retrofit retrofit;
//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("https://api.github.com/")
//            .build();
//
//    GitHubService service = retrofit.create(GitHubService.class);

}
