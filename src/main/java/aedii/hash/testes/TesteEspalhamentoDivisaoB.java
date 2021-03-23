package aedii.hash.testes;

import aedii.hash.utils.HashTableUtils;
import java.io.IOException;

public class TesteEspalhamentoDivisaoB {

    public static void main(String[] args) throws IOException {

        final int M_A_11 = 11;
        int[] vetor = new int[M_A_11];

        for (int i = 0; i <= 100; i++) {
            int posicao = HashTableUtils.espalhamentoDivisao(i, M_A_11);
            vetor[posicao]++;
            if(posicao == 3) {
                System.out.print(i + " ");
            }
        }
        HashTableUtils.criaCsvContagemColisoes("colisoes_espalhamento_divisao_B.csv", vetor);
    }
}
