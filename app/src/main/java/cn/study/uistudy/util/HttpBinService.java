package cn.study.uistudy.util;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HttpBinService {
    @GET("wenda/comments/{questionId}/json")
    Call<ResponseBody> getWendaList(@Path("questionId") String questionId);
}



