package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_home_activity.*

class home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_activity)

        val india : CardView = findViewById(R.id.india)
        val usa : CardView = findViewById(R.id.usa)
        val uk : CardView = findViewById(R.id.uk)
        val australia : CardView = findViewById(R.id.australia)
        val southKorea : CardView = findViewById(R.id.south_korea)
        val france : CardView = findViewById(R.id.france)
        val china : CardView = findViewById(R.id.china)
        val canada : CardView = findViewById(R.id.canada)
        val southAfrica : CardView = findViewById(R.id.south_africa)
        val russia : CardView = findViewById(R.id.russia)
        val germany : CardView = findViewById(R.id.germany)
        //val italy : CardView = findViewById(R.id.italy)
        val japan : CardView = findViewById(R.id.japan)
        val israel : CardView = findViewById(R.id.israel)
        //val newZealand : CardView = findViewById(R.id.new_zealand)
        val brazil : CardView = findViewById(R.id.brazil)
        //val ireland : CardView = findViewById(R.id.ireland)
        val netherlands : CardView = findViewById(R.id.netherlands)
        val uae : CardView = findViewById(R.id.uae)
        //val hongkong : CardView = findViewById(R.id.hongkong)

        india.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "in")
            }
            startActivity(intent)
        }

        usa.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "us")
            }
            startActivity(intent)
        }

        uk.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "gb")
            }
            startActivity(intent)
        }

        australia.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "au")
            }
            startActivity(intent)
        }

        southKorea.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "kr")
            }
            startActivity(intent)
        }

        france.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "fr")
            }
            startActivity(intent)
        }

        china.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "cn")
            }
            startActivity(intent)
        }

        canada.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "ca")
            }
            startActivity(intent)
        }

        southAfrica.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "za")
            }
            startActivity(intent)
        }

        russia.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "ru")
            }
            startActivity(intent)
        }

        germany.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "de")
            }
            startActivity(intent)
        }


        japan.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "jp")
            }
            startActivity(intent)
        }

        israel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "il")
            }
            startActivity(intent)
        }

        brazil.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "br")
            }
            startActivity(intent)
        }

        netherlands.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "nl")
            }
            startActivity(intent)
        }

        uae.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("country", "ae")
            }
            startActivity(intent)
        }
    }
}