package br.com.diagnosticaQ2;

import java.util.Scanner;

public class diagnosticaQ2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] estoque = new int[4][5];
        boolean parar = false;

        while (!parar) {
            System.out.print("Entre com o número do armario: ");
            int armario = ler.nextInt();

            System.out.print("Emtre com o número da prateleira: ");
            int prateleira = ler.nextInt();

            if (armario < 0 || armario > 4 || prateleira < 0 || prateleira > 3) {
                System.out.println("Armario ou prateleira invalido.");
                continue;
            }

            if (estoque[armario][prateleira] >= 10) {
                System.out.println("Espacos insuficiente");
            } else {
                estoque[armario][prateleira]++;
                System.out.println("A caixa foi adicionada!");
            }

            System.out.print("Deseja prosseguir, (1)sim ou (2)nao ? ");
            int keep = ler.nextInt();

            if (keep == 2) {
                parar = true;
            } else if (keep == 1) {
                parar = false;
            }
        }
        System.out.println("Quantidade de caixas em cada prateleira/armario");
        for (int prateleira = 0; prateleira <= 3; prateleira++) {
            for (int armario = 0; armario <= 4; armario++) {
                System.out.print(estoque[prateleira][armario]);
            }
        }
        ler.close();
    }
}
