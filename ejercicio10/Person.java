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
public class Person {
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer cp;
    private Integer teléfono;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String dirección) {
        this.direccion = dirección;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Integer getTelefono() {
        return teléfono;
    }

    public void setTelefono(Integer teléfono) {
        this.teléfono = teléfono;
    }
    
    
    public void setTodo(){
        Scanner pen= new Scanner(System.in);
        System.out.println("Nombre: ");
        setNombre(pen.next());
        System.out.println("Apellido: ");
        setApellido(pen.next());
        System.out.println("Direccion: ");
        setDireccion(pen.next());
        System.out.println("Codigo postal: ");
        setCp(pen.nextInt());
        System.out.println("Telefono: ");
        setTelefono(pen.nextInt());
    }
    
    @Override
    public String toString(){
       return String.format("Nombre: %s %s\nDireccion: %s %d\nTelefono: %d", getNombre(),getApellido(),getDireccion(),getCp(),getTelefono());
    }
}
