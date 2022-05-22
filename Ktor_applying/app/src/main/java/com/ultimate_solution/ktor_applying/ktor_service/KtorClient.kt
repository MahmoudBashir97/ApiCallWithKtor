package com.ultimate_solution.ktor_applying.ktor_service

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

object KtorClient  {

    private const val AUTHORIZATION_HEADER = "Authorization"
    private var API_KEY: String = "FweowCIHwOiBHlmrZMQ9p1yIU4aSHbsyE_xyWLyrB0T_eggFyyL7CLZCPAUzUdkPqhxcaiCM9XEYyy4RkwlO__et6EMvTko808VWJ8EJabIJ0e4LBYTjN6dXeduHYnYx"

    private val client = HttpClient(Android) {
        defaultRequest {
            header(AUTHORIZATION_HEADER, "BEARER $API_KEY")
        }
        install(JsonFeature) {
            serializer = KotlinxSerializer(
                kotlinx.serialization.json.Json {
                    isLenient = true
                    ignoreUnknownKeys = true
                    explicitNulls = false
                })
        }
    }

    val getInstance = client
}