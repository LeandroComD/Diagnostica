package br.com.minandmax;
import java.util.Random;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vetor[];
        vetor = new int[50];

        Random numrandomico = new Random();
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<50;i++) {
            vetor[i] = numrandomico.nextInt(999);
        }

        for(int i=0; i<50; i++) {
            if (vetor[i]>maxValue)
                maxValue=vetor[i];
            if (vetor[i]<minValue)
                minValue=vetor[i];
        }

        System.out.println("O maior valor é " +
                "" +
                "" + maxValue);
        System.out.println("O menor valor é " + minValue);

        System.out.println("Vetor randomico: ");

        for(int num:vetor)
            System.out.println(num);
    }
}