package com.ultimate_solution.ktor_applying.ktor_service.web_service

import com.ultimate_solution.ktor_applying.ktor_service.KtorClient
import com.ultimate_solution.ktor_applying.response.SearchResponse
import io.ktor.client.request.*

object YelpAppServicesImpl : YelpAppServices{
    private val httpClient by lazy { KtorClient.getInstance }

    override suspend fun search(term: String, location: String, limit: Int): SearchResponse {
        return httpClient.get{
            url("https://api.yelp.com/v3/businesses/search")
            parameter("term", term)
            parameter("location", location)
            parameter("limit", limit)
        }
    }
}