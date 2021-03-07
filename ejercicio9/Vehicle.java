/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author DELL
 */
public class Vehicle {
    private Integer llantas;
    private Double millasGalon;

    public Vehicle(Integer llantas, Double millasGalon) {
        this.llantas = llantas;
        this.millasGalon = millasGalon;
    }

    @Override
    public String toString() {
        return String.format("Este vehiculo tiene %d llantas y consume %.2f de gas por milla", llantas,millasGalon);
    }
    
    
}
