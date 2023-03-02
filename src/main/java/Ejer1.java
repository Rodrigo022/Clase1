/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;

/**
 *
 * @author Gonzalez Rodrigo
 */
public class Ejer1 {

    public static void main(String[] args) {
        
        //Ejercicio 1 permite una sola vez el ingreso de numeros 
        //y pedir que muestre los pares o impares.
        
        int aux;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el Numero Inicial:");
        int a = teclado.nextInt();
        System.out.println("Ingrese el Numero Final:");
        int b = teclado.nextInt();
        
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
      
  
    }
}

