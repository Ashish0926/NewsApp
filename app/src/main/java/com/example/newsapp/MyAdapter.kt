package com.example.newsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(private val context: Context, private val articles : List<Articles>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    // function of an Adapter is to convert xml to view so that our viewHolder class can hold it.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // this function is used to create a view holder to hold views (like in item_view)
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = articles[position].title
        holder.Desc.text = articles[position].description
        Glide.with(context).load(articles[position].urlToImage).into(holder.thumbnail)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.newsTitle)
        val Desc : TextView = itemView.findViewById(R.id.newsDescription)
        val thumbnail = itemView.findViewById<ImageView>(R.id.newsThumbnail)
    }

}

