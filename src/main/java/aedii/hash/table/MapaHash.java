package aedii.hash.table;

public class MapaHash {
    private Registro valores[];

    public MapaHash(int tamanho) {
        valores = new Registro[tamanho];
    }

    public void put(Registro registro, int posicao) {
        if (valores[posicao] == null) {
            valores[posicao] = registro;
//            System.out.println("Posição vazia! Novo Registro");
        } else {
//            System.out.print("Colisão  --->  ");
            Registro reg = valores[posicao];
            if (reg.getKey() == registro.getKey()) {
                reg.setValue(registro.getValue());
//                System.out.println("Registro existente - atualizando...");
                return;
            }
            while (reg.getProximo() != null) {
                if (reg.getKey() == registro.getKey()) {
                    reg.setValue(registro.getValue());
//                    System.out.println("Registro Existente - atualizando");
                    return;
                }
                reg = reg.getProximo();
            }
//                if(reg.getProximo() == null) {
            if (reg.getKey() == registro.getKey()) {
                reg.setValue(registro.getValue());
//                System.out.println("Registro Existente - atualizando");
                return;
            }
//                }
            reg.setProximo(registro);
//            System.out.println("Novo registro");
        }

    }

    public Registro get(int key, int posicao) {
        Registro r = new Registro();
        r.setKey(key);
        Registro resultado = valores[posicao];
        if (resultado != null && resultado.getKey() == key) {
            return resultado;
        } else {
            while (resultado.getProximo() != null) {
                resultado = resultado.getProximo();
                if (resultado != null && resultado.getKey() == key) {
                    return resultado;
                }
            }
        }
        return null;
    }
}
