//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
//sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
//calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
//colunas).

import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz (no máximo 10): ");
        int ordem = ler.nextInt();

        if (ordem > 10 || ordem < 1) {
            System.out.println("A ordem da matriz deve ser entre 1 e 10.");
            return;
        }

        double[][] matriz = new double[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = ler.nextDouble();
            }
        }

        double[][] matrizInversa = calcularMatrizInversa(matriz);

        if (matrizInversa == null) {
            System.out.println("A matriz não tem inversa.");
            return;
        }

        System.out.println("A matriz inversa é:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%.2f\t", matrizInversa[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] calcularMatrizInversa(double[][] matriz) {
        int ordem = matriz.length;

        double[][] matrizIdentidade = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            matrizIdentidade[i][i] = 1;
        }

        for (int i = 0; i < ordem; i++) {
            double pivo = matriz[i][i];

            if (pivo == 0) {
                return null;
            }

            for (int j = i; j < ordem; j++) {
                matriz[i][j] /= pivo;
            }
            for (int j = 0; j < ordem; j++) {
                matrizIdentidade[i][j] /= pivo;
            }

            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double multiplicador = matriz[k][i];

                    for (int j = i; j < ordem; j++) {
                        matriz[k][j] -= multiplicador * matriz[i][j];
                    }
                    for (int j = 0; j < ordem; j++) {
                        matrizIdentidade[k][j] -= multiplicador * matrizIdentidade[i][j];
                    }
                }
            }
        }

        return matrizIdentidade;
    }
}