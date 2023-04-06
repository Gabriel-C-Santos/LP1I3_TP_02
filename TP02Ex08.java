//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
//digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
//valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
//correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
//colunas.

import java.util.Scanner;

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double[][] matriz = new double[3][4];
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento (%d,%d): ", i+1, j+1);
                matriz[i][j] = ler.nextDouble();
            }
        }
        
        System.out.print("Digite a constante multiplicativa: ");
        double constante = ler.nextDouble();
        
        double[][] matrizMultiplicada = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizMultiplicada[i][j] = matriz[i][j] * constante;
            }
        }
        
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        System.out.println("Matriz multiplicada:");
        imprimirMatriz(matrizMultiplicada);
    }
    
    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}