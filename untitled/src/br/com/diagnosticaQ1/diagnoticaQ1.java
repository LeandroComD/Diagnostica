package br.com.diagnosticaQ1;

import java.util.Scanner;
import java.util.Random;

public class diagnoticaQ1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] vet = new int[8];
        Random rand = new Random();

        int soma=0, cont=0, total=0;

        for (int i=0; i < vet.length; i++)
            vet[i] = rand.nextInt(99);

        System.out.println("Vetor: ");
        for(int num: vet) {
            System.out.print(num + ", ");
            if(num>30) {
                cont++;
                soma+= num;

            }

            total+=num;
        }
        System.out.println("Quantidade de maiores que 30: " + cont);
        System.out.println("Soma dos valores maiores que 30: " + soma);
        System.out.println("Soma total: " + total);
    }
}
