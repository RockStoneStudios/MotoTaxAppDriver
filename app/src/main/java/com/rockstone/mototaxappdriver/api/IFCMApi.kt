package com.rockstone.mototaxappdriver.api

import com.rockstone.mototaxappdriver.models.FCMBody
import com.rockstone.mototaxappdriver.models.FCMResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface IFCMApi {

    @Headers(
        "Content-Type:application/json",
        "Authorization:key=AAAAiFiq7lA:APA91bHJ26Xixz57UGJyqKb6LP9RfTk4f6eWfGwECAvEiaAI-8Ei_9Uw1gbNzLu5TJfxPFm6Ea1f5bKP51CfU0-NK_gG9KOpkehXtvnrjaQTuz-fT-AKDPKEH99RT_Q0uSPZNnY9Q4vf"
    )
    @POST("fcm/send")
    fun send(@Body body: FCMBody): Call<FCMResponse>


}