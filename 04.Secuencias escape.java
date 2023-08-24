// Secuencias de escape en Java
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Este programa sirve para comprobar las secuencias de escape
// enviadas a la consola de salida
// 
// Usa librer�as est�ndar y no requiere librer�as adicionales

public class SecuenciasEscape {

    public static void main(String[] args){

	// secuencias de escape		significado
        // ----------------------------------------
	// 	\b			borrar hacia atras
	// 	\n			cambia a nueva linea
	// 	\t			salto de tabulador
	// 	\r			salto de linea
	// 	\\			dibujar contrabarra
	// 	\"			dibujar comillas dobles
	// 	\'			dibujar comilla simple

        System.out.println ("Estos son los nombres de mis mascotas:");
        System.out.println (" ");
        System.out.println ("Lola Sim�n Mat�as Rin");
        System.out.println (" ");
        System.out.println ("Lola \nSim�n \nMat�as \nRin");
        System.out.println (" ");
        System.out.println ("\"Lola\" \"Sim�n\" \"Mat�as\" \"Rin\"");
        System.out.println (" ");
        System.out.println ("\'Lola\' \'Sim�n\' \'Mat�as\' \'Rin\'");
        System.out.println (" ");
        System.out.println ("\\Lola\\ \\Sim�n\\ \\Mat�as\\ \\Rin\\");
        System.out.println (" ");
        System.out.println ("\tLola \tSim�n \tMat�as \tRin");

    } //fin del main

} // fin de la clase
