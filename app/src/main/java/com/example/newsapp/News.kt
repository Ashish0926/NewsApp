package com.example.retrofit

import com.example.newsapp.Articles

data class News(val status: String, val totalResults: Int, val articles: List<Articles>)