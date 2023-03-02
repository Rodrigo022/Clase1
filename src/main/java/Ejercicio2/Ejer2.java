package Ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Gonzalez Rodrigo
 */



public class Ejer2 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Indique sus Ingresos:");
        double ingresos = teclado.nextDouble();
        
        System.out.println("Indique la cantidad de Inmuebles que posee:");
        int inmuebles = teclado.nextInt();
        
        System.out.println("Indique la cantidad de Vehiculos que posee:");
        int vehiculos = teclado.nextInt();
        
        if((ingresos < 163539)&&(inmuebles <= 1)&&(vehiculos <= 1)){
            System.out.println("\nSu segmento es:Bajo(I)");
        }else{
            if((ingresos >= 163539 || ingresos <=572386)&&(inmuebles <= 2)&&(vehiculos <= 1)){
                System.out.println("\nSu segmento es:Medio(II)");
            }else{
                if((ingresos >= 572386)&&(inmuebles >= 3)&&(vehiculos >= 3)){
                    System.out.println("\nSu segmento es:Alto(III)");
                }else{
                     System.out.println("\nSu segmento no esta dentro de la clasificacion actual");
                }
            }
        }
    }
}

//Poseer una embarcación, una aeronave de lujo o ser titular de activos
//societarios que demuestren capacidad económica plena.” ?

