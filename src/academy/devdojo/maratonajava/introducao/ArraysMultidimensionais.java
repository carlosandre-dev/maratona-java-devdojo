package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] inteiros = new int[3][3];

        inteiros[0][0] = 1;
        inteiros[0][1] = 2;
        inteiros[0][2] = 3;

        inteiros[1][0] = 4;
        inteiros[1][1] = 5;
        inteiros[1][2] = 6;

        inteiros[2][0] = 7;
        inteiros[2][1] = 8;
        inteiros[2][2] = 9;

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.println(inteiros[i][j]);
            }
        }

        System.out.println("-:-:-:-:-:-:-:-:-:-:");

        for (int[] arrayBase : inteiros) {
            for (int array : arrayBase) {
                System.out.println(array);
            }
        }
    }
}
