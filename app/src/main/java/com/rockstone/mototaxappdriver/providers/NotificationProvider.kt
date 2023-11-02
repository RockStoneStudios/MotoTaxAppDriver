package com.rockstone.mototaxappdriver.providers

import com.rockstone.mototaxappdriver.api.IFCMApi
import com.rockstone.mototaxappdriver.api.RetrofitClient
import com.rockstone.mototaxappdriver.models.FCMBody
import com.rockstone.mototaxappdriver.models.FCMResponse
import retrofit2.Call

class NotificationProvider {

    private val URL = "https://fcm.googleapis.com"

    fun sendNotification(body: FCMBody): Call<FCMResponse> {
        return RetrofitClient.getClient(URL).create(IFCMApi::class.java).send(body)
    }

}