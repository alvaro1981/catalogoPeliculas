package com.example.catalogopeliculas.view.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catalogopeliculas.databinding.PeliculasItemBinding
import com.example.catalogopeliculas.model.Movie

class MovieAdapter:RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

        var movies = mutableListOf<Movie>()
        @SuppressLint("NotifyDataSetChanged")
        set(value){
            field= value
            this.notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
          val binding = PeliculasItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
          return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
         val movie : Movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return  movies.size
    }
    inner class MovieViewHolder(private var binding: PeliculasItemBinding)
        :RecyclerView.ViewHolder(binding.root){
           fun bind(movie: Movie){
               binding.tvTitulo.text = movie.title
               binding.tvAnio.text = movie.year
               binding.tvDirection.text = movie.direction
               binding.tvGenero.text = movie.gender
               binding.tvReparto.text = movie.reparto
               binding.afichePelicula.setImageResource(movie.imageMovieResId)
           }
        }

}