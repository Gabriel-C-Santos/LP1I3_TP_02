//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
//números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
//satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
//digitação dos “N” valores, exibir:
//a. O maior valor;
//b. O menor valor;
//c. A soma dos valores;
//d. A média aritmética dos valores;
//e. A porcentagem de valores que são positivos;
//f. A porcentagem de valores negativos;
//Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
//programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
//programa em função dessa resposta.

import java.util.Scanner;

public class TP02Ex03 {
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);

		int N, maior, menor, soma, media, valor;
		double positivos, negativos;
		System.out.println("Digite a quantidade de numeros a serem digitados: ");
		N = ler.nextInt();
		soma = 0;
		positivos = 0;
		negativos = 0;
		maior = 0;
		menor = 0;
		
		
		while(N > 20 || N < 0){
			System.out.println("Erro! Digite um numero positivo menor que vinte: ");
			N = ler.nextInt();
		}
		
		for(int i = 0; i < N; i++){
			
			System.out.println("Digite um numero qualquer: ");
			valor = ler.nextInt();

			if(i==0){
				maior = valor;
				menor = valor;
			}

			if(valor > maior){
				maior = valor;
			}			
			if(valor < menor){
				menor = valor;
			}

			soma += valor;
		
			if(valor >= 0){
				positivos++;
			}
			else{
				negativos++;
			}
			

		}
		
		media = soma/N;
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);
		System.out.println("Porcentagem de valores positivos: " + (positivos/N*100) + "%");
		System.out.println("Porcentagem de valores negativos: " + (negativos/N*100) + "%");		

	}
}