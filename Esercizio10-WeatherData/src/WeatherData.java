import java.time.LocalDate;
import java.util.Date;

public class WeatherData {
    //attributi
    private String city;
    private LocalDate date;
    private Double temperature;
    private Double precipitation;
    private int humidity;
    //costruttore

    public WeatherData(String city, LocalDate date, double temperature, Double precipitation, int humidity) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", date=" + date +
                ", temperature=" + temperature +
                ", precipitation=" + precipitation +
                ", humidity=" + humidity +
                '}';
    }
}
