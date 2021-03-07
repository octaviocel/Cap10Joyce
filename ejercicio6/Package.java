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
public class Package {
    private Integer peso;
    private Metodo metodo;
    private Double costo;

    public Package(Integer peso, Metodo metodo) {
        this.peso = peso;
        this.metodo = metodo;
        calculateCost(peso,metodo);
    }
    
    private void calculateCost(Integer peso, Metodo metodo){
        if((peso>=1)&&(peso<=8)){
            if(metodo==Metodo.AIR){
                this.costo=2.00;
            }else if(metodo==Metodo.TRUCK){
                this.costo=1.50;
            }else{
                this.costo=0.50;
            }
        }else if((peso>=9)&&(peso<=16)){
            if(metodo==Metodo.AIR){
                this.costo=3.00;
            }else if(metodo==Metodo.TRUCK){
                this.costo=2.35;
            }else{
                this.costo=1.50;
            }
        }else{
            if(metodo==Metodo.AIR){
                this.costo=4.50;
            }else if(metodo==Metodo.TRUCK){
                this.costo=3.25;
            }else{
                this.costo=2.15;
            }
        }
    }
    
    public void display(){
        System.out.println(String.format("Peso: %d\nMetodo: %s\nCosto: %.2f", peso,metodo,costo));
    }
    
    public Double getCosto(){
        return costo;
    }

    public Integer getPeso() {
        return peso;
    }

    public Metodo getMetodo() {
        return metodo;
    }
    
}
