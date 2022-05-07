package academy.devdojo.maratonajava.introducao.labs;

import java.util.Scanner;

public class PrestacaoMaxima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor do carro: ");
        double valorCarro = scan.nextDouble();

        for (int prestacao = 1; prestacao < valorCarro; prestacao++) {
            double valorPrestacao = valorCarro / prestacao;
            if (valorPrestacao < 1000) {
                break;
            }
            System.out.println("Prestação " + prestacao + " R$ " + valorPrestacao);
        }
    }
}
