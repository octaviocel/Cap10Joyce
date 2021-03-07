/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        DinnerEvent evento= new DinnerEvent(1,1,2,1,"f324",90);
        Event.logo();
        
        evento.getMenu();
        evento.mostrar();
        
        
    }
}
