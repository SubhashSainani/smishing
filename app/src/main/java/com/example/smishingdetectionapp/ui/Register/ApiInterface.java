package com.example.smishingdetectionapp.ui.Register;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("signup")
    Call<SignupResponse> signupUser(@Body SignupRequest signupRequest);

    @POST("verify-otp")
    Call<VerificationResponse> verifyOTP(@Body VerifyRequest verifyRequest);
}
