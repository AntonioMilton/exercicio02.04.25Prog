package antonio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Faça um programa em Java que implemente a seguinte matriz:

        int[][] matriz = {
                {12, 76, 45, 77, 29 },
                {33, 98, 54, 12, 23 },
                {69, 28,  8, 16, 89 },
                {23, 12, 40, 97, 11 }};

/*
        // Crie um vetor e armazene o maior valor de cada coluna da Matriz.

        int[] vetor = new int[5];

        for (int c = 0; c < 5; c++) {
            for (int l = 0; l < 4; l++) {
                if (matriz[l][c] > vetor[c])
                    vetor[c] = matriz[l][c];
            }
        }

        //Exibindo resultado do vetor!

        for (int i = 0; i < 5; i++) {
            System.out.println("Maior valor da coluna " + (i + 1) + ": " + vetor[i]);
        }
    }
*/


/*
//Some os valores dos indices selecionados com X;
             { X , X , X , X , X },
             { 0 , X , X , X , 0 },
             { 0 , 0 , X , 0 , 0 },
             { 0 , 0 , 0 , 0 , 0 } = O valor deve ser igual a {411}.
*/
        int somador = 0;

        for (int l = 0; l < 4; l++) {
            for (int c = l; c < 5 - l; c++)
                somador += matriz[l][c];
        }

        System.out.println(somador);


    }
}