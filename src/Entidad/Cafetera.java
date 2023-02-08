/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Cafetera {
    
    private double capacidadMaxima = 10 ;
    private double capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
    
    public void llenarTopeCafetera(){
        String rta;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Desea llenar la cafetera: (si/no) ");
        rta = leer.next();
        
        if (rta.equals("si")){
            capacidadActual = capacidadMaxima;
            System.out.println("Capacidad máxima, 10 litros. ");
        }else {
            System.out.println("No se lleno la cafetera");
        }
        
    }
    
    
    
    
    public void servirTaza (){
        
        int cantidad;
        int rta;
        double litrosConsumidos;
        double litrosMaximos = capacidadActual;
        
        
        Scanner leer = new Scanner(System.in);
        
        do {
            
            System.out.println("Seleccione tipo de  taza:");
            System.out.println("Marque 1 - para taza grande");
            System.out.println("Marque 2 - para taza pequeña");
            rta = leer.nextInt();
        
        } while (rta!=1 && rta!=2);
        
        
        System.out.println("Seleccione la cantidad de tazas: ");
        cantidad = leer.nextInt();
        
        if (rta==1){
            litrosConsumidos = cantidad * 0.5;
            if (litrosConsumidos>litrosMaximos){
                litrosConsumidos = litrosMaximos;
                System.out.println("Entregaremos: "+ (litrosConsumidos/0.5)+ " tazas");
                capacidadActual=0;
            }else{
                capacidadActual-=litrosConsumidos;
            }
        }else {
            litrosConsumidos = cantidad * 0.25;
            
            if (litrosConsumidos>litrosMaximos){
                litrosConsumidos = litrosMaximos;
                System.out.println("Entregaremos : "+ (litrosConsumidos/0.25)+ " tazas" );
                capacidadActual= 0;
            }else{
                capacidadActual-=litrosConsumidos;
            }
        }
        
        
        
        
    }
    
    
    public void vaciarCafetera(){
        Scanner leer = new Scanner(System.in);
        String rta;
        
        System.out.println("Desea vaciar la cafetera (si/no): ");
        rta = leer.next();
        
        if (rta.equals("si")){
            capacidadActual = 0;
            
        }
        
        
    }
    
    
    public void llenarCafetera(){
        String rta;
        Scanner leer = new Scanner(System.in);
        int litros;
        
        System.out.println("Desea llenar la cafetera: (si/no) ");
        rta = leer.next();
        
        if (rta.equals("si")){
            System.out.println("Ingres la cantidad de litros: ");
            litros = leer.nextInt();
            if((litros+capacidadActual)>capacidadMaxima){
                
                capacidadActual = capacidadMaxima;
                System.out.println("Capacidad máxima es de 10 litros. ");                    
            }else{
                capacidadActual += litros;
            }
            
            
        }else {
            System.out.println("No se lleno la cafetera");
        }
        
    }

    
    
    public void opcionesCafetera(){
        int opcion;
        Scanner leer = new Scanner(System.in);
       
        
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Selecciones la opcion que deseada:");
            System.out.println("Marque 1 - Para llenar la cafetera al máximo");
            System.out.println("Marque 2 - Para llenar con cierta cantidad");
            System.out.println("Marque 3 - Para vaciiar la cafetera");
            System.out.println("Marque 4 - Para retirar su cafe");
            System.out.println("Marque 5 - Para salir");
            System.out.println("---------------------------------------------");
            System.out.println("Coloque el nro de opcion: ");
            opcion = leer.nextInt();            
            System.out.println("---------------------------------------------");
            
            switch (opcion){
            
            case 1:
                llenarTopeCafetera();                
                System.out.println("Capacidad actual: "+ getCapacidadActual());        
                break;
            case 2:
                llenarCafetera();
                System.out.println("Capacidad actual: "+ getCapacidadActual());        
                break;
            case 3:
                vaciarCafetera();
                System.out.println("Capacidad actual: "+ getCapacidadActual());        
                break;
            case 4:
                servirTaza();
                System.out.println("Capacidad actual: "+ getCapacidadActual());        
                break;
                
                
        }
            
        } while (opcion!=5);
        
        
        
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
    
    
    
    
}
