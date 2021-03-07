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
public class Student extends Person{
    private String carrera;
    private Double calificacion;
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Carrera: %s\nCalificacion: %.2f", getCarrera(),getCalificacion()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTodo() {
        System.out.println("ESTUDIANTE");
        super.setTodo(); //To change body of generated methods, choose Tools | Templates.
        Scanner pen= new Scanner(System.in);
        System.out.println("Carrera: ");
        setCarrera(pen.next());
        System.out.println("Calificacion: ");
        setCalificacion(pen.nextDouble());
    }
    
    
}
