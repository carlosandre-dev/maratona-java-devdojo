package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        // String[] series = new String[5];
        String[] series = {"Chicago PD", "Chicago Fire", "Chicago Med", "Law & Order SVU"};

        System.out.println("Array de Séries com for tradicional");
        for (int i = 0; i < series.length; i++) {
            System.out.println(series[i]);
        }

        System.out.println();
        System.out.println("Array de Séries com foreach");
        for (String serie : series) {
            System.out.println(serie);
        }
    }
}
