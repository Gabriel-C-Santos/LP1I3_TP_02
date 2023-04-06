//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
//erro, se necessário. Após a digitação, exibir:
//a. O maior valor;
//b. A soma dos valores;
//c. A média aritmética dos valores.

import java.util.Scanner;

public class TP02Ex02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Declarando as variáveis
        int valor, maior = 0, soma = 0;
        double media = 0.0;
        int contador = 0;
        
        //Entrando com os valores
        for(int i = 1; i <= 10; i++) {
            do {
                System.out.print("Digite o " + i + "º valor positivo: ");
                valor = entrada.nextInt();
                if(valor < 0) {
                    System.out.println("Valor inválido. Digite um valor positivo.");
                }
            } while(valor < 0);
            if(valor > maior) {
                maior = valor;
            }
            soma += valor;
            contador++;
        }
        media = (double) soma / contador;
        
        //Exibindo os resultados
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("A soma dos valores digitados foi: " + soma);
        System.out.println("A média aritmética dos valores digitados foi: " + media);
        
        entrada.close();
    }
}