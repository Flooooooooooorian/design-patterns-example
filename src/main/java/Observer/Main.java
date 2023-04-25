package Observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay1 = new PhoneDisplay();
        PhoneDisplay phoneDisplay2 = new PhoneDisplay();

        weatherStation.subscribe(phoneDisplay1);
        weatherStation.subscribe(phoneDisplay2);

        weatherStation.setTemperature(37);
        Thread.sleep(10000);
        weatherStation.close();
    }
}
