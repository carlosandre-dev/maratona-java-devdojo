package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar();
        calculadora.subtrair();
        calculadora.multiplicar();
        calculadora.dividir();
    }
}
