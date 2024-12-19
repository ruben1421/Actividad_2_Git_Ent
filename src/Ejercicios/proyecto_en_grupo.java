package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class proyecto_en_grupo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}
