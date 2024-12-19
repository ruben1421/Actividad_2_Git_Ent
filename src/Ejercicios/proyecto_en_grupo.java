package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class proyecto_en_grupo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		//Part 1
		int matrix[][] = new int[5][5];

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				int randomNum = r.nextInt(100)+1;
				matrix[i][j] = randomNum;
			}
		}

		//Part 2
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		 
		
		System.out.println("introduce la fila (0 a 4)");
		int fila = s.nextInt();
		s.nextLine();


		while(fila >= matrix.length) {
		if(fila < matrix.length) {
		break;
		}
		System.err.println("ERROR: SOLO UN NUMERO DE 0 A 4");
		System.out.println("introduce la fila (o a 4)");
		fila = s.nextInt();
		s.nextLine();
		}

		System.out.println("introduce la columna (o a 4)");
		int columna = s.nextInt();
		s.nextLine();

		while(columna >= matrix.length) {
		if(columna < matrix.length) {
		break;
		}
		System.err.println("ERROR: SOLO UN NUMERO DE 0 A 4");
		System.out.println("introduce la columna (o a 4)");
		columna = s.nextInt();
		s.nextLine();
		}

		System.out.println();
		System.out.println(matrix[fila][columna]);
		System.out.println();
	}

}
