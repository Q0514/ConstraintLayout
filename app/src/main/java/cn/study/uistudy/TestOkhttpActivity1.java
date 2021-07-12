package cn.study.uistudy;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import cn.study.uistudy.util.HttpBinService;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TestOkhttpActivity1 extends AppCompatActivity {


    private final URI GsonConverterFactory;

    public TestOkhttpActivity1(URI gsonConverterFactory) {
        GsonConverterFactory = gsonConverterFactory;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_okhttp1);
    }


    public class ApiController {

        private Retrofit mRetrofit;

        public ApiController() {

            // 创建 OKHttpClient
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(1000 * 80, TimeUnit.SECONDS);//连接超时时间
            builder.writeTimeout(1000 * 80, TimeUnit.SECONDS);//写操作 超时时间
            builder.readTimeout(1000 * 80, TimeUnit.SECONDS);//读操作超时时间

            mRetrofit = new Retrofit.Builder()
                    .client(builder.build())
                    .baseUrl("https://wanandroid.com/wenda/comments/14500/json")//base的网络地址  baseUrl不能为空,且强制要求必需以 / 斜杠结尾
                    .callbackExecutor(Executors.newSingleThreadExecutor())//使用单独的线程处理 (这很重要,一般网络请求如果不设置可能不会报错,但是如果是下载文件就会报错)
                    .build();
        }


        private void initRequest() throws IOException {

            ObjectInputStream.GetField httpBinService = null;
            retrofit2.Call<ResponseBody> call = (Call<ResponseBody>) httpBinService.get("lance", "14500");
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
}




