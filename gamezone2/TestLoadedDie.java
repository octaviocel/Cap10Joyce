/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author DELL
 */
public class TestLoadedDie {

    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        LoadedDie d3 = new LoadedDie();
        int juego1=0, juego2=0;
        for (int i = 0; i < 1000; i++) {
            d1.lanzar();
            d2.lanzar();
            if(d1.getCara()>d2.getCara()){
                juego1++;
            }
        }
        for (int i = 0; i < 1000; i++) {
            d2.lanzar();
            d3.lanzar();
            if(d3.getCara()>d2.getCara()){
                juego2++;
            }
        }
        
        System.out.println("Con dos dados regulares el primero gano "+juego1+" veces de 1000");
        System.out.println("Con un dado normar y otro LoadedDie el renovado gano "+juego2+" veces de 1000");
        
    }
}
