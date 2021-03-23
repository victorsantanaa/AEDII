package aedii.hash.testes;

import aedii.hash.utils.HashTableUtils;
import java.io.IOException;

public class TesteEspalhamentoDivisaoC {

    public static void main(String[] args) throws IOException {

        final int M_A_97 = 97;
        int[] vetor = new int[M_A_97];

        for (int i = 1; i <= 10000; i++) {
            int posicao = HashTableUtils.espalhamentoDivisao(i, M_A_97);
            vetor[posicao]++;
        }
        HashTableUtils.criaCsvContagemColisoes("colisoes_espalhamento_divisao_C.csv", vetor);
    }
}
