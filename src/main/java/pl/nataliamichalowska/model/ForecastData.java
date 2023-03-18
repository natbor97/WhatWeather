package pl.nataliamichalowska.model;

public class ForecastData {
    public long dt;
    public String myCity;
    public String purposeCity;
    public double temp;
    public double pressure;
    public String icon;

    public ForecastData(long dt, String myCity, String purposeCity, double temp, double pressure, String icon) {
        this.dt = dt;
        this.myCity = myCity;
        this.purposeCity = purposeCity;
        this.temp = temp;
        this.pressure = pressure;
        this.icon = icon;
    }
}
