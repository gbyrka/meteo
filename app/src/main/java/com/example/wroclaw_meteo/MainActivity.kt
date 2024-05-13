package com.example.wroclaw_meteo

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : Activity() {

    private lateinit var imageView: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        imageView2 = findViewById(R.id.imageView2)
        imageView3 = findViewById(R.id.imageView3)
        val imageUrl = "https://old.meteo.pl/um/metco/mgram_pict.php?ntype=0u&row=436&col=181&lang=pl"
        Picasso.get().load(imageUrl).into(imageView)
        val imageUrl2 = "https://old.meteo.pl/um/metco/mgram_pict.php?ntype=0u&row=475&col=212&lang=pl"
        Picasso.get().load(imageUrl2).into(imageView2)
        val imageUrl3 = "https://old.meteo.pl/um/metco/mgram_pict.php?ntype=0u&row=457&col=177&lang=pl"
        Picasso.get().load(imageUrl3).into(imageView3)
    }
}

