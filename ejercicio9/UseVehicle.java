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
public class UseVehicle {
    public static void main(String[] args) {
         Car carro= new Car(2.1);
         MotorCycle moto= new MotorCycle(0.7);
         
         System.out.println(carro.toString());
         System.out.println(moto.toString());
    }
}
