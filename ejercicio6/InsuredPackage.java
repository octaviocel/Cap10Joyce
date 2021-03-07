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
public class InsuredPackage extends Package{
    
    public InsuredPackage(Integer peso, Metodo metodo){
        super(peso,metodo);
    }
    
    @Override
    public void display(){
        System.out.println(String.format("Peso: %d\nMetodo: %s\nCosto: %.2f",super.getPeso(),super.getMetodo(),getCostoAsegurado()));
    }
    
    private Double getCostoAsegurado(){
        if((super.getCosto()>0.0)&&(super.getCosto()<=1.0)){
            return super.getCosto()+2.45;
        }else if((super.getCosto()>1.0)&&(super.getCosto()<=3.0)){
            return super.getCosto()+3.95;
        }else{
            return super.getCosto()+5.55;
        }
    }
}
