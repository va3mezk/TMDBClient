package com.droid.tmdbclient.data.repository.movie.datasource

import com.droid.tmdbclient.data.model.movie.Movie


interface MovieCacheDataSource  {
    suspend fun getMoviewsFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)

}