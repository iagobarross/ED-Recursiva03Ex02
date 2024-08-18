package view;

import java.util.Scanner;

import controller.ControllerSomaDigito;

public class Principal {

	public static void main(String[] args) {
		ControllerSomaDigito contSomaDigito = new ControllerSomaDigito();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int busca = 10;
		
		while(numero < 10 || numero > 999999) {
			numero = sc.nextInt();
		}
		
		while(busca < 0 || busca > 9) {
			busca = sc.nextInt();
		}
		
		int resultado = contSomaDigito.somaDigito(numero, busca);
		System.out.println("No número " + numero + ", o dígito " + busca + " aparece " + resultado + " vezes.");
		sc.close();
	}

}
