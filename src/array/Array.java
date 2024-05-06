/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author obed
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion del arreglo
        
        int [] numeros;
        numeros=new int[5];
        
        //valores
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        
        //imprimir los valores del arreglo
        for (int i = 0; i < numeros.length; i++){
            System.out.println("El elemento del indice " + i + ": " + numeros[i]);
       }
        
        int suma=0;
       for(int i=0; i<numeros.length;i++){
           suma+=numeros[i];
       }
        System.out.println("La suma con ciclo for es : "+ suma);
    }
    
}
