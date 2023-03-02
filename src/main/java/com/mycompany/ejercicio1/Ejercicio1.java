/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;

/**
 *
 * @author Gonzalez Rodrigo
 */
public class Ejercicio1 {

    //Ejercicio uno que permite el ingreso de numeros mas de una vez 
    //y mostrar si los mismos son pares o impares.
    
    public static void main(String[] args) {
        
        boolean respuesta1 = true;
        boolean respuesta2 = true;
        
        while(respuesta1 == true){
        
           respuesta2 = true;
          int aux;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Dos Numeros:");
        
        System.out.println("Numero Inicial:");
        int a = teclado.nextInt();
        System.out.println("Numero Final:");
        int b = teclado.nextInt();
        
     
        
    
        while(respuesta2 == true){
            
            
            
            System.out.println("\n1:Numeros Pares - 2:Numeros Impares");
            System.out.println("Ingrese la opcion que desea:");
            int opcion = teclado.nextInt();
        
        
         if(opcion == 1){
        
             System.out.println("\nNumeros Pares:");
             
        }else{
            
            System.out.println("\nNumeros Impares:");
        }
        
        
        aux = a;
        
        //Item "a, b y c" While
        while(aux <= b) {
         
         if(opcion == 1){
         
              if((aux % 2) == 0){
       
               System.out.print(aux + " ");
      
              }
         
         } else{
         
              if((aux % 2) != 0){
       
               System.out.print(aux + " ");
      
              }
         
         }
         
       
           aux = aux + 1;
     }
        
        
        //Item "d" For
        System.out.println("");
        
        int i;
        for(i = b; i >= a; i--){
            
            
            if(opcion == 1){
            
                if((i % 2) == 0){
       
                   System.out.print(i + " ");
    
                }
            } else{
                
                  if((i % 2) != 0){
       
                      System.out.print(i + " ");
                   }
            }
            
        }  
        
           System.out.println("\nDesea Ver otros Numeros?\n1)Si - 2)No");
           int respuesta3 = teclado.nextInt();
           
           if(respuesta3 == 2){
            
              respuesta2 = false;
                
           }
        
        }
        
           System.out.println("Desea Cargar otros numeros?\n1)Si - 2)No");
           int respuesta4 = teclado.nextInt();
           
           if(respuesta4 == 2 ){
            
              respuesta1 = false;
               
           }
        }
        
      
      
  
    }
}

