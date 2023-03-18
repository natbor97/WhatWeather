package pl.nataliamichalowska.model;

public class WeatherData {
    public String myCity;
    public String purposeCity;
    public double temp;
    public double pressure;
    public String icon;

    public WeatherData(){};
    public WeatherData(String myCity, String purposeCity, double temp, double pressure, String icon) {
        this.myCity = myCity;
        this.purposeCity = purposeCity;
        this.temp = temp;
        this.pressure = pressure;
        this.icon = icon;
    }
}
