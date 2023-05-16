package sistemaNumAleatorio;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner ingresoDatos;
		
		String jugador1;
		String jugador2;
		
		int saldoJ1;	int saldoJ2;
		int apuestaJ1;	int apuestaJ2;
		int respuestaJ1; int respuestaJ2;
		int chancesJ1;	int chancesJ2;
		
		int y=1;	int x=100;
		int incognita =(int)(Math.random()*(y-x+1)+x);
		
		saldoJ1 = 1000;	saldoJ2 = 1000;
		chancesJ1 = 0;	chancesJ2 = 0;
		
		ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del jugador 1.");
		jugador1 = ingresoDatos.nextLine();
		System.out.println("Ingrese nombre del jugador 2.");
		jugador2 = ingresoDatos.nextLine();
		
		
		System.out.println("Ingrese apuesta del jugador 1 (Apuesta mínima 50$).");
		apuestaJ1 = ingresoDatos.nextInt();
		
		while(saldoJ1<apuestaJ1 | apuestaJ1<50) {
			
			System.out.println("Saldo insuficiente o no válido del jugador 1, ingrese otro valor.");
			
			System.out.println("Ingrese apuesta del jugador 1 (Apuesta mínima 50$).");
			apuestaJ1 = ingresoDatos.nextInt();
		}
			saldoJ1=saldoJ1-apuestaJ1;
			System.out.println("Ingrese posible número incógnita, el rango es de 1 a 100.");
			respuestaJ1 = ingresoDatos.nextInt();
		
		
		
		System.out.println("Ingrese apuesta del jugador 2 (Apuesta mínima 50$).");
		apuestaJ2 = ingresoDatos.nextInt();
		
		while(saldoJ2<apuestaJ2 | apuestaJ2<50) {
			
			System.out.println("Ingrese apuesta del jugador 2 (Apuesta mínima 50$).");
			apuestaJ2 = ingresoDatos.nextInt();
		}	
			saldoJ2=saldoJ2-apuestaJ2;
			System.out.println("Ingrese posible número incógnita, el rango es de 1 a 100.");
			respuestaJ2 = ingresoDatos.nextInt();
			
			
			
		while (incognita != respuestaJ1 && incognita != respuestaJ2) {
			
			for (int i=0;i>10;i++) {
				
				System.out.println("Ingrese apuesta del jugador 1 (Apuesta mínima 50$).");
				apuestaJ1 =	ingresoDatos.nextInt();
				
				while(apuestaJ1<50) {
					
					System.out.println("Ingrese apuesta del jugador 1 (Apuesta mínima 50$).");
					apuestaJ1 = ingresoDatos.nextInt();
				}
					if (saldoJ1>apuestaJ1) {
						// desarrollar la opción de duplicar la apuesta
						saldoJ1=saldoJ1-apuestaJ1;
						chancesJ1++;
					}else {
						System.out.println("Saldo insuficiente del jugador 1. ¡Gana el jugador 2!");
					}
				
				System.out.println("Ingrese posible número incógnita, el rango es de 1 a 100.");
				respuestaJ1 = ingresoDatos.nextInt();
				
				if(respuestaJ1>incognita) {
					System.out.println("El número ingresado es mayor que la incógnita.");
				}else {
					System.out.println("El número ingresado es menor que la incógnita.");
				}
				
				
				
				System.out.println("Ingrese apuesta del jugador 2 (Apuesta mínima 50$).");
				apuestaJ2 =	ingresoDatos.nextInt();
				
				while(apuestaJ2<50) {
				
					System.out.println("Ingrese apuesta del jugador 2 (Apuesta mínima 50$).");
					apuestaJ2 = ingresoDatos.nextInt();
				}
					if(saldoJ2>apuestaJ2) {	
						// desarrollar la opción de duplicar la apuesta
						saldoJ2=saldoJ2-apuestaJ2;
						chancesJ2++;
					}else {
						System.out.println("Saldo insuficiente del jugador 2. ¡Ganó el jugador 1!");
				}
				
				System.out.println("Ingrese posible número incógnita, el rango es de 1 a 100.");
				respuestaJ2 = ingresoDatos.nextInt();
				
					if(respuestaJ2>incognita) {
						System.out.println("El número ingresado es mayor que la incógnita.");
					}else {
						System.out.println("El número ingresado es menor que la incógnita.");
					}
			}
		
		}

	}

}
