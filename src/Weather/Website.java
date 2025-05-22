/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weather;

/**
 *
 * @author Miguel
 */
public class Website implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Website: Nueva temperatura publicada: " + temperature + "°C");
    }
}

