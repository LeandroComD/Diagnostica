package br.com.pesquisabinaria;

public class PesquisaBinaria {
    public static void main(String[] args) {
        PesquisaBinaria bin = new PesquisaBinaria();

        int[] numeros = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22};

    }

    public void pesquisarNumero(int x, int[] numeros) {
        int inicio = 0;
        int meio = 0;
        int fim = numeros.length - 1;

        while (inicio <= fim) {
            meio = (fim + inicio) /2;
            System.out.println("inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " +
                    numeros[fim]);

            if (numeros[meio] == x) {
                System.out.println("Encontrou o número " + x);
                break;
            }

            if (numeros[meio] < x) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (inicio > fim) {
            System.out.println("Não encontrou o número " + x);
        }
    }
}
