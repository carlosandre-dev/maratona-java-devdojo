package academy.devdojo.maratonajava.introducao.labs;

public class NumerosPares {
    public static void main(String[] args) {
        int cont = 0;

        System.out.println("Usando While");
        while(cont <= 1000){
            System.out.println(cont);
            cont += 2;
        }

        System.out.println("Usando For");
        for (int i = 0; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}
