package kr.soylatte.arduino;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SunSet on 2017. 11. 2..
 */

public class Data {

    @SerializedName("Temperature") @Expose String temperature;
    @SerializedName("Humidity") @Expose String humidity;

    public Data(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
