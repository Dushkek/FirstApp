package by.tms.app.homework6.retrofit

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create


const val BASE_URL ="https://pro-api.coinmarketcap.com/v1/"

object CoinAPIFactory {

    private const val KEY_NAME = "X-CMC_PRO_API_KEY"
    private const val KEY_VALUE = "b6c7fb36-4ba1-4b29-bb2c-9f686d7bcefd"

    private val httpClient = OkHttpClient.Builder()
        .addNetworkInterceptor(object : Interceptor{
            override fun intercept(chain: Interceptor.Chain): Response {
                val request = chain.request().newBuilder().addHeader(KEY_NAME,KEY_VALUE).build()

                return chain.proceed(request)
            }
        })

    fun getRetrofit():CoinAPI{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(httpClient.build())
            .build()

        return retrofit.create()
    }

}