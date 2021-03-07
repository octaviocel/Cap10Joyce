/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author DELL
 */
public class UsePackage {
    public static void main(String[] args) {
        Package paquete= new Package(8,Metodo.AIR);
        InsuredPackage paquete2 =new InsuredPackage(13,Metodo.AIR); 
        paquete.display();
        paquete2.display();
    }
}
