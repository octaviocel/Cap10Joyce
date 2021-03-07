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
public class LabCourse extends CollegeCourse{
    
    public LabCourse(String depto, Integer curso, Integer creditos){
        super(depto,curso,creditos);
    }

    @Override
    public Double setTarifa() {
        return 170.00; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void display(){
        System.out.println(String.format("Departamento: %s\nCurso: %d\nCreditos: %d\nTarifa: %.2f", super.getDepto(),super.getCurso(),super.getCreditos(),super.getTarifa()));
    }
    
    
}
