//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.

public class TP02Ex04 {

    public static void main(String[] args) {
        
        int[][] valor = new int[2][3];
        
        //Atribuindo valores à matriz
        valor[0][0] = 1;
        valor[0][1] = 2;
        valor[0][2] = 3;
        valor[1][0] = 4;
        valor[1][1] = 5;
        valor[1][2] = 6;
        
        //Imprimindo os valores na tela
        for(int i = 0; i < valor.length; i++) {
            for(int j = 0; j < valor[i].length; j++) {
                System.out.print(valor[i][j] + " ");
            }
            System.out.println();
        }
    }
}