package EscolaNotas;

import java.util.Scanner;

public class CalculoTotalProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalProdutos = 0;
        double valorTotal = 0;
        int somaQuantidades = 0;

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o valor do produto: ");
            double valorProduto = scanner.nextDouble();

            System.out.print("Digite a quantidade do produto: ");
            int quantidade = scanner.nextInt();

            valorTotal += valorProduto;
            somaQuantidades += quantidade;
            totalProdutos++;

            System.out.print("Deseja inserir outro produto? (S/N): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        scanner.close();

        System.out.println("Produtos digitados: " + totalProdutos);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Soma das quantidades: " + somaQuantidades);
    }
}
