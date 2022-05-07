package academy.devdojo.maratonajava.introducao.labs;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o dia da semana de 1 a 7: ");
        byte diaDaSemana = scan.nextByte();

        switch (diaDaSemana){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Meio de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
