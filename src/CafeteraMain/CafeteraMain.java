/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraMain;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class CafeteraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cafetera cs = new Cafetera();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println(cs.toString());
        
        
        cs.opcionesCafetera();
        
        System.out.println(cs.toString());
        
        
        
        
        
    }
    
}
