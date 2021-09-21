package lab1.task10;

public class Day {
    private Weather weather = new Weather();
    private String nameOfDay;

    public Day(final String nameOfDay, final int temperature, final String chanceOfRain, final String humidity, final String generalDescription, final int uvIndex) {
        this.nameOfDay= nameOfDay;
        this.weather.setTemperature(temperature);
        this.weather.setChanceOfRain(chanceOfRain);
        this.weather.setHumidity(humidity);
        this.weather.setGeneralDescription(generalDescription);
        this.weather.setUvIndex(uvIndex);
    }

    public Weather getWeather() {
        return weather;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Name of day: " + getNameOfDay() + '\n' +
                getWeather().toString() + '\n';
    }

}
