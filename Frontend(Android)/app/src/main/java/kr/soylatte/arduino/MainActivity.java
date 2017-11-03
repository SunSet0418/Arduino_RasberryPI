package kr.soylatte.arduino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SunSet on 2017. 11. 2..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView temperature = (TextView) findViewById(R.id.temperature);
        final TextView humidity = (TextView) findViewById(R.id.humidity);
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(RetrofitJava.Baseurl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                final RetrofitJava apiRequest = retrofit.create(RetrofitJava.class);

                apiRequest.getdata().enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        temperature.setText(response.body().getTemperature()+"℃");
                        humidity.setText(response.body().getHumidity()+"%");
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {

                    }
                });
            }
        };

        Timer timer = new Timer();
        timer.schedule(tt, 0, 1000);
    }

}