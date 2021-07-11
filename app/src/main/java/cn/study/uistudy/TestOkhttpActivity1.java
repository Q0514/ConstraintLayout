package cn.study.uistudy;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.net.URI;
import java.util.Map;

import cn.study.uistudy.util.HttpBinService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TestOkhttpActivity1 extends AppCompatActivity {

    private Retrofit retrofit;
    private HttpBinService httpBinService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_okhttp1);
        initRequest();
        retrofit = new Retrofit.Builder().baseUrl("https://wanandroid.com/wenda/comments/14500/json").build();
        httpBinService = retrofit.create(HttpBinService.class);
    }

    private void initRequest() {

        retrofit2.Call<ResponseBody> call = httpBinService.get("lance", "123");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                try {
                    Log.i("111111", "onResponse:" + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

    }
}