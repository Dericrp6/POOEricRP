/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Util {
    public static int validarRespuesta(int min, int max) {
        //Leer la respuesta del usuario
        Scanner sc = new Scanner(System.in);
        
        //Validar respuesta int
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.println("No ingresaste una opción válida");
            System.out.println("Intenta otra vez");
        }
        
        int respuesta = sc.nextInt();
        
        //Validar rango de respuesta
        while(respuesta < min || respuesta > max) {
            //Solicitar de nuevo la respuesta
            System.out.println("No ingresaste una opción válida");
            System.out.println("Intenta otra vez");
            
            while(!sc.hasNextInt()) {
                sc.next();
                System.out.println("No ingresaste una opción válida");
                System.out.println("Intenta otra vez");
            }
            respuesta = sc.nextInt();
        }
        System.out.println("Tu respuesta fue: " + respuesta + "\n");
        return respuesta;
    }
}
