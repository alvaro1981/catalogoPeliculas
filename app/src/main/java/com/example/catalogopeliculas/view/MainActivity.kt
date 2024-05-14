package com.example.catalogopeliculas.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.catalogopeliculas.R
import com.example.catalogopeliculas.databinding.ActivityMainBinding
import com.example.catalogopeliculas.model.Movie
import com.example.catalogopeliculas.view.adapters.MovieAdapter

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        var adaptadorPelicula = MovieAdapter()
        mainBinding.rcvPelicula.layoutManager = LinearLayoutManager(this)
        mainBinding.rcvPelicula.adapter = adaptadorPelicula
        adaptadorPelicula.movies = Movie.movieList
    }
}