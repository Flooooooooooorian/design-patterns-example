package Observer;

import java.util.concurrent.SubmissionPublisher;

public class WeatherStation extends SubmissionPublisher<Integer> {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.submit(temperature);
    }
}
