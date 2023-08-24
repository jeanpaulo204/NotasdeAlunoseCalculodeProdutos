package EscolaNotas;

import java.util.Scanner;

public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas deseja digitar? ");
        int quantidadeNotas = scanner.nextInt();

        double somaNotas = 0;
        int notasValidas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                notasValidas++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                i--; 
            }
        }

        scanner.close();

        if (notasValidas > 0) {
            double media = somaNotas / notasValidas;
            System.out.println("Média do aluno: " + media);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
            } else if (media >= 5) {
                System.out.println("Situação: Recuperação");
            } else {
                System.out.println("Situação: Reprovado");
            }
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }
}
