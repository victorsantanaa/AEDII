package aedii.hash.utils;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HashTableUtils {

    public HashTableUtils(){

    }

    public static void criaCsvContagemColisoes(String nome, int[] vetor) throws IOException {
        String[] cabecalho = {"H(Key)", "N de Colisoes em H(Key)"};
        List<String[]> linhas = new ArrayList<>();
        for(int k = 0; k < vetor.length; k++) {
            linhas.add(new String[]{String.valueOf(k), String.valueOf(vetor[k])});
        }
        Writer writer = Files.newBufferedWriter(Paths.get(nome));
        CSVWriter csvWriter = new CSVWriter(writer);

        csvWriter.writeNext(cabecalho);
        csvWriter.writeAll(linhas);

        csvWriter.flush();
        writer.close();
    }

    public static int espalhamentoDivisao(int key, int m) {
        return (key & 0x7FFFFFFF) % m;
    }

    public static int espalhamentoMultiplicacao(int key, int m, float a) {
        float val =  key * a;
        val -= (int) val;
        return (int) (m * val);
    }
}
