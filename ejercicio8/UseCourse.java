/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UseCourse {
    public static void main(String[] args) {
        final String[] cursos={"BIO","CHM","CIS","PHY","MAT","ENG","FIS"};
        Scanner pen= new Scanner(System.in);
        System.out.println("Elige el curso:");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("   ["+i+"]"+cursos[i]);
        }
        int d= pen.nextInt();
        if((d>=0)&&(d<=3)){
            LabCourse curso= new LabCourse(cursos[d],102,5);
            curso.display();
        }else{
            CollegeCourse curso= new CollegeCourse(cursos[d],102,5);
            curso.display();
        }
    }
}
