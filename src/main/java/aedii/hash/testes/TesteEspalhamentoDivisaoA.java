package aedii.hash.testes;

import aedii.hash.utils.HashTableUtils;
import java.io.IOException;

public class TesteEspalhamentoDivisaoA {

    public static void main(String[] args) throws IOException {

        final int M_A_12 = 12;
        int[] vetor = new int[M_A_12];

        for (int i = 0; i <= 100; i++) {
            int posicao = HashTableUtils.espalhamentoDivisao(i, M_A_12);
            vetor[posicao]++;
            if(posicao == 3) {
                System.out.print(i + " ");
            }
        }
        HashTableUtils.criaCsvContagemColisoes("colisoes_espalhamento_divisao_A.csv", vetor);
    }
}
