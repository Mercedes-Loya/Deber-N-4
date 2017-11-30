/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA LOYA
 */
public class MayorMenor {
    
     public static void array(){
         
         int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos:  "));
        
         double promedio=0;
         int[]Arreglo=new int[n];
         for(int i=0;i<n;i++){
             Arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
             promedio=promedio+Arreglo[i];
                
         }
         int menor;
         int mayor;
         menor=mayor=Arreglo[0];
         for(int j=1;j<n;j++){
             if(Arreglo[j]>mayor){
                 mayor=Arreglo[j];
             }
             if(Arreglo[j]<menor){
                 menor=Arreglo[j];
             }    
          
         }
         promedio=promedio/n;
         
        
         JOptionPane.showMessageDialog(null,"Elemento mayor: " +mayor+ ""  
             +"\nElemento menor: "+ menor+ ""+ "\nEl promedio es: "+ promedio );
     }
      
}
