package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.idade = 41;
        estudante.nome = "Carlos André";
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome + " -> Idade: " + estudante.idade + " -> Sexo: " + estudante.sexo);
    }
}
