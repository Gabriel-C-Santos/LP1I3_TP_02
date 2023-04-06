//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
//digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
//valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.

import java.util.Scanner;

public class TP02Ex07 {
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);

		int [][]matriz = new int[3][4]; 
		int mul;
		
		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 4; c++){
				System.out.println("Digite o valor da linha " + (l + 1) + " e coluna " + (c + 1) + ": ");
				 matriz[l][c] = ler.nextInt();
			}
		}

		System.out.println("Digite o valor multiplicativo: ");
		mul = ler.nextInt();

		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 4; c++){
				matriz[l][c] *= mul;
			}
		}

		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 4; c++){
				System.out.print(" " + matriz[l][c] + " -");
			}
			System.out.println();
		}
		
		
		
	}
}