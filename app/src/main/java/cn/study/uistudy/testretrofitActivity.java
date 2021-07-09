package cn.study.uistudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class testretrofitActivity extends AppCompatActivity {

    private Context mContext = this;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testretrofit);
        initView();
        initRetrofit();
    }
    private void initView(){
        textView = (TextView) findViewById(R.id.tv_alipay);
    }
    private void initRetrofit(){
        //获取Retrofit对象，设置地址
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.URL_BASE)
                .build();
        Log.i("LHD","1");
        RequestServices requestServices = retrofit.create(RequestServices.class);
        Call<ResponseBody> call = requestServices.getString();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()){
                    try {
                        Log.i("LHD",response.body().toString());
                        //返回的结果保存在response.body()中
                        String result = response.body().string();
                        //onResponse方法是运行在主线程也就是UI线程的，所以我们可以在这里
                        //直接更新UI
                        textView.setText(result);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("LHD","访问失败");
            }
        });

    }

    private class RequestServices {
        public Call<ResponseBody> getString() {
            return null;
        }
    }
}