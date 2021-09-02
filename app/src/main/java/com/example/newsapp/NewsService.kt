package com.example.newsapp

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/everything?q=apple&from=2021-06-21&to=2021-06-21&sortBy=popularity&apiKey=3ed2eab152ab4b2290d6e4ba9dfe4c0d
//https://newsapi.org/v2/top-headlines?country=in&apiKey=3ed2eab152ab4b2290d6e4ba9dfe4c0d

const val BASE_URL = "https://newsapi.org/v2/"
const val API_KEY = "3ed2eab152ab4b2290d6e4ba9dfe4c0d"

interface NewsInterface {

    // it will create a url for us :- https://newsapi.org/v2/top-headlines?apiKey=$API_KEY&country=in&category=science&page=1

    @GET("top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country") country: String, @Query("category") category : String, @Query("page") page: Int) : Call<News>

}

object NewsService {
    val newsInstance : NewsInterface
    init {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        newsInstance = retrofit.create(NewsInterface::class.java)
    }
}