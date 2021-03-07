/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author DELL
 */
public class CarRental {
    private String nombre;
    private Integer cp;
    private Tamano tamano;
    private Double precio;
    private Integer dia;
    private Double tarifaTotal;

    public CarRental(String nombre, Integer cp, Tamano tamano, Integer dia) {
        this.nombre = nombre;
        this.cp = cp;
        this.tamano = tamano;
        this.dia = dia;
        calculaPrecio();
    }
    
    public void calculaPrecio(){
        this.precio=setPrecio();
        this.tarifaTotal=precio*dia;
    }
    
    public Double setPrecio(){
        if( tamano== Tamano.ECONOMY){
            return 29.99;
        }else if( tamano==Tamano.MIDSIZE){
            return 38.99;
        }else{
            return 43.50;
        }
    }
    
    public void display(){
        System.out.println(String.format("RENTA\n Nombre: %s\n CP: %d\n Tamaño: %s\n Precio por dia: %.2f\n Dias renta: %d\n Tarifa total: %.2f", nombre,
                            cp,getTamano(),precio,dia,tarifaTotal));
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCp() {
        return cp;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getDia() {
        return dia;
    }

    public Double getTarifaTotal() {
        return tarifaTotal;
    }
    
    
}
