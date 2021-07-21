package com.droid.tmdbclient.data.repository.tvshow.datasourceimpl

import com.droid.tmdbclient.data.model.tvshow.TvShow
import com.droid.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource


class TvShowCacheDataSourceImpl :
    TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShows)
    }
}