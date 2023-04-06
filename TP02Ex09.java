//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
//sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
//elementos, calcular e exibir a matriz transposta.

import java.util.Scanner;

public class TP02Ex09 {
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);
 
		int m, n;

		do{
			System.out.println("Digite o numero de linhas entre 1 e 10: ");
			m = ler.nextInt();
		}while(m > 10 || m < 1);

		do{
		System.out.println("Digite o numero de colunas entre 1 e 10: ");
		n = ler.nextInt();
		}while(n > 10 || n < 1);

		int [][]matriz = new int[m][n];
		int [][]matrizT = new int[n][m];
		
		for(int l = 0; l < m; l++){
			for(int c = 0; c < n; c++){
				System.out.println("Digite o valor da linha " + (l + 1) + " e coluna " + (c + 1) + ": ");
				 matriz[l][c] = ler.nextInt();
			}
		}

		for(int l = 0; l < m; l++){
			for(int c = 0; c < n; c++){
				 matrizT[c][l] = matriz[l][c];
			}
		}

		for(int l = 0; l < n; l++){
			for(int c = 0; c < m; c++){
				System.out.print(" " + matrizT[l][c] + " -");
			}
			System.out.println();
		}
		
		
		
	}
}