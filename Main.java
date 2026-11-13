
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int continuar = 1;

        while (continuar == 1) {

            Funcionario funcionario = null;

            System.out.println("CALCULADORA DE SALARIO");

            System.out.println("Escolha o tipo de funcionario:");
            System.out.println("1 - CLT");
            System.out.println("2 - PJ");
            System.out.println("3 - Professor");
            System.out.print("Digite a opcao: ");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            try {

                if (opcao == 1) {

                    System.out.println("CADASTRO CLT");

                    System.out.print("Digite o nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Digite o salario mensal: ");
                    double salario = entrada.nextDouble();

                    funcionario = new Funcionario(nome, salario);

                } else if (opcao == 2) {

                    System.out.println("CADASTRO PJ");

                    System.out.print("Digite o nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Digite o valor por hora: ");
                    double valorHora = entrada.nextDouble();

                    System.out.print("Digite as horas trabalhadas: ");
                    double horas = entrada.nextDouble();

                    funcionario = new FuncionarioPJ(nome, valorHora, horas);

                } else if (opcao == 3) {

                    System.out.println("CADASTRO PROFESSOR");

                    System.out.print("Digite o nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Digite o valor da hora aula: ");
                    double valorHora = entrada.nextDouble();

                    System.out.print("Digite as horas semanais: ");
                    double horas = entrada.nextDouble();

                    funcionario = new Professor(nome, valorHora, horas);

                } else {
                    System.out.println("Opcao invalida!");
                }

                if (funcionario != null) {

                    System.out.println("RESULTADO");

                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.printf("Salario bruto: R$ %.2f%n", funcionario.calcularBruto());
                    System.out.printf("INSS: R$ %.2f%n", funcionario.calcularINSS());
                    System.out.printf("IRRF: R$ %.2f%n", funcionario.calcularIRRF());
                    System.out.printf("FGTS: R$ %.2f%n", funcionario.calcularFGTS());
                    System.out.printf("DAS/MEI: R$ %.2f%n", funcionario.calcularMEI());
                    System.out.printf("Salario liquido: R$ %.2f%n", funcionario.calcularLiquido());
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("Deseja cadastrar outro funcionario?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            System.out.print("Opcao: ");

            continuar = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("Programa encerrado!");

        entrada.close();
    }
}
