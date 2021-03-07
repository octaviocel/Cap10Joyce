/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author DELL
 */
public class CollegeCourse {

    private String depto;
    private Integer curso;
    private Integer creditos;
    private Double tarifa;

    public CollegeCourse(String depto, Integer curso, Integer creditos) {
        this.depto = depto;
        this.curso = curso;
        this.creditos = creditos;
        setTarifaTotal();
    }

    private void setTarifaTotal() {
        this.tarifa = creditos * setTarifa();
    }

    public Double setTarifa() {
        return 120.00;
    }
    
    public void display(){
        System.out.println(String.format("Departamento: %s\nCurso: %d\nCreditos: %d\nTarifa: %.2f", getDepto(),getCurso(),getCreditos(),getTarifa()));
    }

    public String getDepto() {
        return depto;
    }

    public Integer getCurso() {
        return curso;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public Double getTarifa() {
        return tarifa;
    }
    
}
