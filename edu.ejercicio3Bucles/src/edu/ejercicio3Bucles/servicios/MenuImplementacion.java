package edu.ejercicio3Bucles.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTeclado) {

		int opcionSeleccionada;
		System.out.println("1. cerrar aplicacion");
		System.out.println("2. Igualdad");
		System.out.println("3. desigualdad");
		System.out.println("seleccione opcion");

		opcionSeleccionada = comunicacionTeclado.nextInt();

		return opcionSeleccionada;
	}

}