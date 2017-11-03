package kr.soylatte.arduino;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SunSet on 2017. 11. 2..
 */

public class Data {

    @SerializedName("Temperature") @Expose String temperature;
    @SerializedName("Humidity") @Expose String humidity;
    @SerializedName("Time") @Expose String time;
    @SerializedName("Sound") @Expose String sound;

    public Data(String temperature, String humidity, String time, String sound) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.time = time;
        this.sound = sound;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
