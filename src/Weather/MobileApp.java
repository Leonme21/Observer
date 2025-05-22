/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weather;

/**
 *
 * @author Miguel
 */
public class MobileApp implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("MobileApp: Temperatura actualizada a " + temperature + "°C");
    }
}

