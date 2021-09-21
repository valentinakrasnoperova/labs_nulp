package lab1.task10;

public class Day {
    private Weather weather = new Weather();
    private String nameOfDay;

    public Day(final int temperature, final String chanceOfRain, final String humidity, final String generalDescription, final int uvIndex, final String nameOfDay) {
        this.weather.setTemperature(temperature);
        this.weather.setChanceOfRain(chanceOfRain);
        this.weather.setHumidity(humidity);
        this.weather.setGeneralDescription(generalDescription);
        this.weather.setUvIndex(uvIndex);
        this.nameOfDay = nameOfDay;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Day day = (Day) obj;
        return (this.getNameOfDay() == day.getNameOfDay()
                || (this.getNameOfDay() != null && this.getNameOfDay().equals(day.getNameOfDay())));
    }

    @Override
    public int hashCode() {
        return this.getWeather().hashCode() + 31 * getNameOfDay().hashCode();
    }

    @Override
    public String toString() {
        return "Name of day: " + getNameOfDay() + '\n' +
                getWeather().toString() + '\n';
    }

}
