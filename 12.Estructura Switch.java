// Estructura SWITCH
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
//  
// Programa que pregunta por el d�a de la semana
// en formato numerico y devuelve el d�a actual

import java.util.*;

public class MiApicacionJava1 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("�Qu� d�a de la semana es? (en n�mero de 1 a 7, por favor...)");
    int day = scanner.nextInt();
    scanner.close();

    System.out.print("Entonces hoy es... ");

    switch (day) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Mi�rcoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("S�bado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println(" �no lo s�!");
            break;
    }
    // Dependiendo del dia imprime una leyenda        

   } // fin del main
} // fin de la clase principal