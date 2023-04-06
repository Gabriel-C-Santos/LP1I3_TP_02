//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.

import java.util.Scanner;

public class TP02Ex05 {
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);

		int [][]matriz = new int[3][2]; 
		
		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 2; c++){
				System.out.println("Digite o valor da linha " + (l + 1) + " e coluna " + (c + 1) + ": ");
				 matriz[l][c] = ler.nextInt();
			}
		}

		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 2; c++){
				System.out.print(" " + matriz[l][c] + " -");
			}
			System.out.println();
		}
		
		
		
	}
}