package cn.study.uistudy.util;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HttpBinService {
    @GET
    Call<ResponseBody> get(@Query("username") String uerName, @Query("password") String pwd);
}
