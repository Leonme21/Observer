/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Weather;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer app = new MobileApp();
        Observer led = new LEDDisplay();
        Observer web = new Website();

        station.addObserver(app);
        station.addObserver(led);
        station.addObserver(web);

        System.out.println("---- Primera actualización ----");
        station.setTemperature(25.5f);

        station.removeObserver(led);

        System.out.println("---- Segunda actualización ----");
        station.setTemperature(30.0f);
    }
}
