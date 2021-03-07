/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author DELL
 */
public class CollegeList {
    public static void main(String[] args) {
        
        Person perosna= new Person();
        perosna.setTodo();
        System.out.println(perosna.toString());
        
        CollegeEmployee col= new CollegeEmployee();
        col.setTodo();
        System.out.println(col.toString());
        
        Faculty fal= new Faculty();
        fal.setTodo();
        System.out.println(fal.toString());
        
        Student est= new Student();
        est.setTodo();
        System.out.println(est.toString());
    }
}
