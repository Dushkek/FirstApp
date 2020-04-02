package by.tms.app.homework6.retrofit

import by.tms.app.homework6.entity.Coins
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinAPI {
    @GET("cryptocurrency/listings/latest")
    fun getTopCrypto(
        @Query("limit")
        limit : Int,
        @Query("convert")
        convert : String
    ):Deferred<Response<Coins>>
}