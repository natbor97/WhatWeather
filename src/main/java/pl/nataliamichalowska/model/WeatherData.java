package pl.nataliamichalowska.model;

public class WeatherData {
    public String main;
    public double temp;
    public double pressure;
    public String icon;

    public WeatherData(){};
    public WeatherData(String main, double temp, double pressure, String icon) {
        this.main = main;
        this.temp = temp;
        this.pressure = pressure;
        this.icon = icon;
    }
}
