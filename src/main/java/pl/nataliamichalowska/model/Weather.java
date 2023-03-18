package pl.nataliamichalowska.model;

public class Weather {
    private CityData cityData;
    private WeatherData weatherData;

    public Weather(CityData cityData, WeatherData weatherData) {
        this.cityData = cityData;
        this.weatherData = weatherData;
    }

    public CityData getCityData() {
        return cityData;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }
}
