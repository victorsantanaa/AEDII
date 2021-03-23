package aedii.hash.testes;

import aedii.hash.utils.HashTableUtils;
import java.io.IOException;

public class TesteEspalhamentoMultiplicacaoA {

    public static void main(String[] args) throws IOException {

        final int M_A_200 = 200;
        final float A_062 = 0.62f;
        int[] vetor = new int[M_A_200];

        for (int i = 1; i <= 500000; i++) {
            int posicao = HashTableUtils.espalhamentoMultiplicacao(i, M_A_200, A_062);
            vetor[posicao]++;
        }
        HashTableUtils.criaCsvContagemColisoes("colisao_espalhamento_multiplicacao_A.csv", vetor);
    }
}
