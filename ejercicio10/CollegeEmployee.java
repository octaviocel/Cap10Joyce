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
public class CollegeEmployee extends Person{
    private Integer seguro;
    private Double salario;
    private String depto;


    public Integer getSeguro() {
        return seguro;
    }

    public void setSeguro(Integer seguro) {
        this.seguro = seguro;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Seguro: %d\nSalario: %.2f\nDepartamento: %s", getSeguro(),getSalario(),getDepto()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTodo() {
        System.out.println("COLLEGE");
        super.setTodo(); //To change body of generated methods, choose Tools | Templates.
        Scanner pen= new Scanner(System.in);
        System.out.println("Seguro: ");
        setSeguro(pen.nextInt());
        System.out.println("Salario: ");
        setSalario(pen.nextDouble());
        System.out.println("Departamento: ");
        setDepto(pen.next());
    }
    
    
}
