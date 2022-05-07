package academy.devdojo.maratonajava.introducao.labs;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a Tabuada: ");
        int valorTabuada = scan.nextInt();

        System.out.println("Tabuada de " + valorTabuada);
        for (int i = 1; i <= 10; i++) {
            System.out.println(valorTabuada + " X " + i + " = " + valorTabuada *i );
        }
    }
}
