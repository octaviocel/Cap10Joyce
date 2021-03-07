/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Faculty extends CollegeEmployee{
    private Boolean titular;

    public String getTitular() {
        return titular==true ? "Es miembreo titular" : "No es miembro titular";
    }

    public void setTitular(int titular) {
        if(titular==1){
            this.titular=true;
        }else{
            this.titular=false;
        }
    }

    @Override
    public void setTodo() {
        System.out.println("FACULTAD");
        super.setTodo(); //To change body of generated methods, choose Tools | Templates.
        Scanner pen= new Scanner(System.in);
        System.out.println("Es titular de la facultad: [1]SI [2]NO");
        setTitular(pen.nextInt());
    }

    @Override
    public String toString() {
        return super.toString()+getTitular(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
