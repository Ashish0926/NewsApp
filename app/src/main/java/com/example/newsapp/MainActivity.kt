package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit.News
import com.example.retrofit.NewsService
import com.littlemango.stacklayoutmanager.StackLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var adapter : MyAdapter
    var articles = mutableListOf<Articles>()
    var pageNum = 1
    var totalResults = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MyAdapter(this@MainActivity, articles)
        newsList.adapter = adapter

        val LayoutManager = StackLayoutManager(StackLayoutManager.ScrollOrientation.BOTTOM_TO_TOP, 1) // No of cards visible at a time = 1
        LayoutManager.setItemOffset(100)
        LayoutManager.setPagerMode(true)
        LayoutManager.setPagerFlingVelocity(2000)
        newsList.layoutManager = LayoutManager

        LayoutManager.setItemChangedListener(object : StackLayoutManager.ItemChangedListener{
            override fun onItemChanged(position: Int) {
                Log.d("POS", "CURRENT POS : $position")
                if(position > articles.size-5 && position < totalResults-1) {
                    pageNum++
                    getNews()
                }
            }

        })

        getNews()
    }

    private fun getNews() {
        val newsContainer = NewsService.newsInstance.getHeadlines("in", pageNum)
        newsContainer.enqueue(object : Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {
                Log.d("TAG", "Successful")
                val news = response.body()

                if(news != null) {
                    totalResults = news.totalResults
                    articles.addAll(news.articles)
                    adapter.notifyDataSetChanged()
                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d("TAG", "Something went wrong")
            }

        })
    }
}