package cn.study.uistudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import cn.study.uistudy.util.OkhttpHelper;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class TestOkhttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okhttp_activity_main);
        initRequest();
    }

    private void initRequest() {
        String url ="https://wanandroid.com/wenda/comments/14500/json";
        OkhttpHelper.getRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.i("111111","onFailure:"+e.getMessage());
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.i("111111","onResponse:"+response.body().string());
            }
        });
    }

    }

