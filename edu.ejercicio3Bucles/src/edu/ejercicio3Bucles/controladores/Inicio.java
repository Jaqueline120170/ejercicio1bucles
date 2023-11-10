package edu.ejercicio3Bucles.controladores;

import java.util.Scanner;
import edu.ejercicio3Bucles.servicios.MenuImplementacion;
import edu.ejercicio3Bucles.servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		Scanner comunicacionTeclado = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
        boolean cerrarMenu = false;
        
        
        do
        {
        	int opcionSeleccionada = mi.mostrarMenuYSeleccion(comunicacionTeclado);
        	

            switch (opcionSeleccionada)
            {
                case 1:
                    System.out.println("¡Hasta pronto!");
                    cerrarMenu = true;
                    break;

                case 2:
                    System.out.println("Ha elegido Igualdad");
                    
                    System.out.println("Introduce una palabra: ");
                    Scanner comunicacionTeclado1 = new Scanner(System.in);
                    String palabra1 = comunicacionTeclado1.next();
                    
                    System.out.println("Introduce una palabra: ");
                    Scanner comunicacionTeclado2 = new Scanner(System.in);
                    String palabra2 = comunicacionTeclado2.next();
                    if (palabra1.equals(palabra2))
                    {
                        System.out.println("El resultado de la igualdad es: True");
                    }
                    else
                    {
                       System.out.println("El resultado de la igualdad es: False");
                    }
                    break;
                case 3:
                    System.out.println("Ha elegido Desigualdad");
                    System.out.println("Introduce una palabra: ");
                    palabra1 = comunicacionTeclado.next();
                    System.out.println("Introduce una palabra: ");
                    palabra2 = comunicacionTeclado.next();
                    if (!palabra1.equals(palabra2))
                    {
                        System.out.println("El resultado de la desigualdad es: True");
                    }
                    else
                    {
                        System.out.println("El resultado de la desigualdad es: False");
                    }
                    break;
            }
        }while (!cerrarMenu);
		}
	}


