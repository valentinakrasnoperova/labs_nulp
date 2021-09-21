package lab1.task10;

public class Weather {
    private int temperature;
    private String chanceOfRain;
    private String humidity;
    private String generalDescription;
    private int uvIndex;

    public Weather() {
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(String chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getGeneralDescription() {
        return generalDescription;
    }

    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final Weather weather = (Weather) obj;
        return this.getTemperature() == weather.getTemperature()
                && (this.getChanceOfRain() == weather.getChanceOfRain()
                || (this.getChanceOfRain() != null && this.getChanceOfRain().equals(weather.getChanceOfRain())))
                && (this.getHumidity() == weather.getHumidity()
                || (this.getHumidity() != null && this.getHumidity().equals(weather.getHumidity())))
                && (this.getGeneralDescription() == weather.getGeneralDescription()
                || (this.getGeneralDescription() != null && this.getGeneralDescription().equals(weather.getGeneralDescription())))
                && (this.getUvIndex() == weather.getUvIndex());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                ((chanceOfRain == null) ? 0 : chanceOfRain.hashCode());
        result = prime * result +
                ((humidity == null) ? 0 : humidity.hashCode());
        result = prime * result +
                ((generalDescription == null) ? 0 : generalDescription.hashCode());
        result = prime * result + temperature;
        result = prime * result + uvIndex;

        return result;
    }


    @Override
    public String toString() {
        return "Temperature: " + getTemperature() + '\n' +
                "Chance of rain: " + getChanceOfRain() + '\n' +
                "Humidity %: " + getHumidity() + '\n' +
                "General description: " + getGeneralDescription() + '\n' +
                "UV index: " + getUvIndex();
    }
}
