package kr.ac.kumoh.s20180594.s23w1202retrofit

import retrofit2.http.GET

interface SongApi {
    @GET("song")
    suspend fun getSongs(): List<Song>
}