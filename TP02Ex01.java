//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
//Caso contrário solicitar novamente apenas o segundo valor.

import java.util.Scanner;

public class TP02Ex01 {
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);

		int v1, v2;
		
		System.out.println("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		v2 = v1 - 1;

		while(v2 < v1){
			System.out.println("Digite um valor maior que o primeiro: ");
			v2 = ler.nextInt();
		}
		
		
	}
}