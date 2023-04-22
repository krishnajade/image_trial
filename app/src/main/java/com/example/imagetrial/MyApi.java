package com.example.imagetrial;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface MyApi {

    @Multipart
    @POST("testing/uploadimg/up.php")
    Call<UploadResponse> uploadImage(
            @Part MultipartBody.Part file,
            @Part("name") RequestBody name
    );
}
