package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val country : String = intent.getStringExtra("country").toString()

        val technology : CardView = findViewById(R.id.tech)
        val business : CardView = findViewById(R.id.business)
        val sports : CardView = findViewById(R.id.sports)
        val health : CardView = findViewById(R.id.health)
        val entertainment : CardView = findViewById(R.id.entertainment)
        val politics : CardView = findViewById(R.id.politics)
        val science : CardView = findViewById(R.id.science)

        technology.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "technology")
            intent.putExtras(extras)
            startActivity(intent)
        }

        business.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "business")
            intent.putExtras(extras)
            startActivity(intent)
        }

        sports.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "sports")
            intent.putExtras(extras)
            startActivity(intent)
        }

        health.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "health")
            intent.putExtras(extras)
            startActivity(intent)
        }

        entertainment.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "entertainment")
            intent.putExtras(extras)
            startActivity(intent)
        }

        politics.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "politics")
            intent.putExtras(extras)
            startActivity(intent)
        }

        science.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            val extras = Bundle()
            extras.putString("country", country)
            extras.putString("category", "science")
            intent.putExtras(extras)
            startActivity(intent)
        }
    }
}