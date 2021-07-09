package cn.study.uistudy.util;

import androidx.core.content.res.FontResourcesParserCompat;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HttpBinService {
    @GET("get")
    @FormUrlEncoded
    Call<ResponseBody> get(@Query("username") String uerName, @Query("password") String pwd);

}
