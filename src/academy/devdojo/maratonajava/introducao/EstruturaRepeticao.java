package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scan.nextInt();
        int contador = 0;

        while(contador <= numero){
            System.out.println(contador);
            contador++;
        }
    }
}
