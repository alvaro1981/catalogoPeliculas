package com.example.catalogopeliculas.model

import com.example.catalogopeliculas.R

data class Movie(
    val title:String,
    val year: String,
    val gender:String,
    val direction : String,
    val reparto : String,
    val imageMovieResId: Int
){
    companion object{
        val movieList = mutableListOf<Movie>(
            Movie("Predator","1987","Accion-Terror-Aventura","Jhon Mctiernan",
                "Arnold Schwarzenegger, Carl Weathers, Kevin Peter Hall", R.drawable.deprdador),
            Movie("Atrapado Sin Salida","1975","Comedia Dramatica","Milos Forman",
                "Jack Nicholson,Louise,Fletcher,Christopher Lloyd,Danny deVito", R.drawable.atrapado_sin_salida),
            Movie("American Story X","1998","Drama-Criminal","Tony Kaye",
                "Edward Norton, Edward Furlong", R.drawable.american_history_x),
            Movie("El lobo del WallStreet","2013","Comedia negra Biografica","Martin Scorsese",
                "Leonardo DiCaprio, Margot Robbie", R.drawable.el_lobo_de_wall_street),
            Movie("Alien","1979","Terror, Ciencia Ficcion","Ridley Scott",
                "Sigourney Weaver,Tom Skerritt,John Hurt", R.drawable.alien_uno),
            Movie("Bram Stoker`s Dracula","1992","Terror,Fantasia,Romance","Francis Ford Coppola",
                "Gary Oldman,Winona Ryder,Anthony Hopkins", R.drawable.dracula),
            Movie("El padrino Parte II","1974","Crimen, Drama","Francis Ford Coppola",
                "Al Pacino,Robert De Niro,Robert Duvall", R.drawable.el_padrino_dos),
            Movie("Forrest Gump","1994","Drama, Romance","Robert Zemeckis",
                "Tom Hanks, Robin Wright,Gary Sinise", R.drawable.forrest_gump),
            Movie(" The Thirteenth Floor","1999","Misterio,Ciencia Ficcion","Jose Rusnak",
                "Creig Bierko, Gretchen Mol", R.drawable.nivel13),
            Movie(" Ghost","1990","Drama,Fantasia,Romance","Jerry Zucker",
                "Patrick Swayze, Demi Moore,Whoopi Goldberg", R.drawable.ghost),
            Movie(" El club","2015","Drama","Pablo Larrain",
                "Alfredo Castro, Roberto Farias, Antonia Zegers", R.drawable.el_club),
            Movie(" X Men:First Class","2011","Ciencia Ficcion","Matthew Vaughn",
                "James McAvoy,Michael Fassbender, Jennifer Lawrence", R.drawable.x_men_firstclass),
            Movie(" Naufrago","2001","Aventura, Drama","Robert Zemeckis",
                "Tom Hanks, Helen Hunt, Nick Searcy", R.drawable.naufrago),
            Movie(" Oppenheimer","2023","Biopic,Historico,Suspenso","Christopher Nolan",
                "Cillian Murphy, Emily Blunt, Matt Damon", R.drawable.oppenheimer),
            Movie("Back to the future","1985","Aventura,Comedia,Ciencia Ficcion","Robert Zemeckis",
                "Michael J.Fox,Christopher Lloyd, Lea Thompson", R.drawable.backtofuture),
            Movie("Back to the future","1989","Aventura,Comedia,Ciencia Ficcion","Robert Zemeckis",
                "Michael J.Fox, Christopher Lloyd, Lea Thompson", R.drawable.backtofutureii
            ),
            Movie("Gran Torino","2009","Drama","Clint Eastwood",
                "Clint Eastwood, Bee Vang", R.drawable.gran_torino),
            Movie("Once upon a Time in America","1985","Crimen,Drama","Serio Leone",
                "Robert De Nirom James Woods, Elizabeth McGovern", R.drawable.onceuponatimeamerica),
            Movie("Matrix","1999","Ciencia Ficcion","Lana y Lily Wachowski",
                "Keanu Reeves, Laurence Fishburne", R.drawable.matrix),
            Movie("Rocky III","1982","Accion, Drama","Sylvester Stallone",
                "Sylvester Stallone, Talia Shire, Burt Young", R.drawable.rocky_tres),
            Movie("Super Bad","2007","Comedia","Greg Mottola",
                "Jonah Hill, Michael Cera, Christopher Mintz-Plasse", R.drawable.superbad)






        )
    }
}
