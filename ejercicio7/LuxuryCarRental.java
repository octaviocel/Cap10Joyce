/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LuxuryCarRental extends CarRental{
    private Boolean chofer;
    
    public LuxuryCarRental(String nombre, Integer cp, Tamano tamano, Integer dia){
        super(nombre,cp,tamano,dia);
        setChofer();
    }
    
    public void setChofer(){
        Scanner pen = new Scanner(System.in);
        System.out.println("Quieres agregar chofer por $200  [1]SI   [2]NO");
        Integer d= pen.nextInt();
        if(d==1){
            this.chofer=true;
        }else{
            this.chofer=false;
        }        
    }

    @Override
    public Double setPrecio() {
        return 79.99; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        Double t=0.0;
        if(chofer){
            t= super.getTarifaTotal()+200.00;
        }else{
            t= super.getTarifaTotal();
        }
        System.out.println(String.format("RENTA\n Nombre: %s\n CP: %d\n Tamaño: %s\n Precio por dia: %.2f\n Dias renta: %d\n Tarifa total: %.2f\n Chofer: %s",
                super.getNombre(),super.getCp(),super.getTamano(),super.getPrecio(),super.getDia(),t, chofer));
    }
    
    
    
}
