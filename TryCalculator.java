import java.util.Scanner;

public class TryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char escolha;

        do {
            System.out.print("Olá, bem vindo ao Try Calculator! Digite o primeiro número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("Opção: ");
            int operacao = sc.nextInt();

            double result = 0;

            switch (operacao) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Resultado: " + result);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("Deseja realizar outra operação? (S/N): ");
            escolha = sc.next().charAt(0);
            System.out.println();

        } while (Character.toUpperCase(escolha) == 'S');

        System.out.println("Programa encerrado.");
    }
}
