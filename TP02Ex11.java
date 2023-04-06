//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
//sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
//calcular e exibir determinante da matriz.

import java.util.Scanner;

public class TP02Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a ordem da matriz (no máximo 10): ");
        int ordem = sc.nextInt();
        
        int[][] matriz = new int[ordem][ordem];
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        int determinante = calcularDeterminante(matriz);
        
        System.out.printf("Determinante da matriz: %d", determinante);
        
        sc.close();
    }
    
    private static int calcularDeterminante(int[][] matriz) {
        int ordem = matriz.length;
        
        if (ordem == 1) {
            return matriz[0][0];
        } else if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else {
            int determinante = 0;
            
            for (int j = 0; j < ordem; j++) {
                int[][] submatriz = new int[ordem - 1][ordem - 1];
                
                for (int i = 1; i < ordem; i++) {
                    for (int k = 0; k < ordem; k++) {
                        if (k < j) {
                            submatriz[i - 1][k] = matriz[i][k];
                        } else if (k > j) {
                            submatriz[i - 1][k - 1] = matriz[i][k];
                        }
                    }
                }
                
                determinante += Math.pow(-1, j) * matriz[0][j] * calcularDeterminante(submatriz);
            }
            
            return determinante;
        }
    }

}