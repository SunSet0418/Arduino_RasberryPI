package kr.soylatte.arduino;

/**
 * Created by SunSet on 2017. 11. 2..
 */

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface RetrofitJava {

    String Baseurl = "http://soylatte.kr:10000";

    @POST("/data")
    Call<Data> getdata();
}
