package academy.devdojo.maratonajava.javacore.classes.labs;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Celta";
        carro1.modelo = "Hatch";
        carro1.ano = 2003;

        Carro carro2 = new Carro();
        carro2.nome = "Fiesta";
        carro2.modelo = "Hatch";
        carro2.ano = 2009;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("-------><-------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
