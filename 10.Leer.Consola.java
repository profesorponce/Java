// Como leer datos desde consola en Java
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Este programa muestra como se declaran las variables en
// el elnguaje Java
// 
// Usa librer�as est�ndar y java.util.*

import java.util.*;

public class VariableString {

    public static void main(String[] args){

	// se crea un proceso para leer desde consola
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�Cu�l es tu nombre?");
        
        // se lee el nombre
        String myString = scanner.next();
        
        System.out.println("�Qu� edad tienes, "+myString+"?");
        
        // se lee la edad de la persona
        int myInt = scanner.nextInt();
        
        // se cierra el proceso para leer desde consola
        scanner.close();

        System.out.println("---------------");
        System.out.println("Te llamas: " + myString);
        System.out.println("Tu edad es: " + myInt);
    } //fin del main

} // fin de la clase
