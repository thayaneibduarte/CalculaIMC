package calculaimc;

import java.util.Scanner;

public class CalculaIMC {


    public void resultado(Pessoa pessoa) {

        double resultado = pessoa.peso / (pessoa.altura * pessoa.altura);
        System.out.printf("O seu IMC ?:%.2f", resultado);

        System.out.println("\nClassificação do seu IMC:");
        if (resultado < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (resultado < 25) {
            System.out.println("Peso normal");
        } else if (resultado < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}