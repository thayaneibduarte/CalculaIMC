package calculaimc;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Insira a quantidade de pessoas que utilizarão o programa! Sendo, Limite: 5");
        int resposta = dados.nextInt();

        Pessoa listapessoas[] = new Pessoa[resposta];

        CalculaIMC calculaIMC = new CalculaIMC();

        for (int i = 0; i < listapessoas.length; i++) {
            listapessoas[i] = new Pessoa();

            System.out.println("Seja Bem-Vindo ao programa de cálculo de IMC! Para iniciarmos, insira a seguir os dados necessários:");

            System.out.println("Insira o Nome: ");
            listapessoas[i].nome = dados.next();
            System.out.println("Insira o Telefone: ");
            listapessoas[i].telefone = dados.next();
            System.out.println("Insira a Cidade onde mora:");
            listapessoas[i].cidade = dados.next();
            System.out.println("Insira o Estado onde reside: ");
            listapessoas[i].estado = dados.next();
            System.out.println("Insira o Endereço: ");
            listapessoas[i].endereco = dados.next();
            System.out.println("Insira o CEP de sua residência");
            listapessoas[i].cep = dados.nextInt();
            System.out.println("Insira a sua Idade:");
            listapessoas[i].idade = dados.nextInt();
            System.out.println("Insira o RG:");
            listapessoas[i].rg = dados.nextInt();
            System.out.println("Insira seu CPF:");
            listapessoas[i].cpf = dados.next();
            System.out.println("Por fim, para cálculo de seu IMC, insira a sua altura:");
            listapessoas[i].altura = dados.nextDouble();
            System.out.println("Para finalizar, insira seu peso:");
            listapessoas[i].peso = dados.nextDouble();
        }

        for (int i = 0; i < listapessoas.length; i++) {
            System.out.printf("\n\tDados da %d Pessoa\n", i + 1);
            System.out.println("Nome: " + listapessoas[i].nome);
            System.out.println("Telefone: " + listapessoas[i].telefone);
            System.out.println("Cidade: " + listapessoas[i].cidade);
            System.out.println("Estado: " + listapessoas[i].estado);
            System.out.println("Endereço: " + listapessoas[i].endereco);
            System.out.println("CEP: " + listapessoas[i].cep);
            System.out.println("Idade: " + listapessoas[i].idade);
            System.out.println("RG: " + listapessoas[i].rg);
            System.out.println("CPF: " + listapessoas[i].cpf);
            System.out.println("Altura: " + listapessoas[i].altura);
            System.out.println("Peso: " + listapessoas[i].peso);
        }

        for (Pessoa pessoa : listapessoas) {
            calculaIMC.resultado(pessoa);
        }

    }
}