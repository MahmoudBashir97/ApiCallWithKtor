package com.ultimate_solution.ktor_applying.repositories

import android.util.Log
import com.ultimate_solution.ktor_applying.ktor_service.web_service.YelpAppServicesImpl
import com.ultimate_solution.ktor_applying.response.SearchResponse
import io.ktor.client.features.*
import java.io.IOException

object MainRepository {

    suspend fun search(term: String? = null):
            List<SearchResponse.BusinessResponse> {
        return try {
            val response =
                YelpAppServicesImpl.search(term = term ?: "")
            response.businesses
        } catch (e: ClientRequestException) {
            Log.d("errorMessage: ","client exception" )
            emptyList()
        } catch (e: IOException) {
            Log.d("errorMessage","no internet" )
            emptyList()
        }
    }

}