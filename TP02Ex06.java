//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//6.Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

public class TP02Ex06 {

    public static void main(String[] args) {
        
        //Criando uma matriz de ordem 2x3
        String[][] nomes = new String[2][3];
        
        //Atribuindo nomes à matriz
        nomes[0][0] = "Gabriel";
        nomes[0][1] = "Leonardo";
        nomes[0][2] = "Ariel";
        nomes[1][0] = "Tuler";
        nomes[1][1] = "Marco";
        nomes[1][2] = "Nelson";
        
        //Imprimindo os nomes na tela
        for(int i = 0; i < nomes.length; i++) {
            for(int j = 0; j < nomes[i].length; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println();
        }
    }
}