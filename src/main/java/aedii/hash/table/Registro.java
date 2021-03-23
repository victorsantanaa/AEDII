package aedii.hash.table;

public class Registro {

    public Registro(int key, String value) {
        this.key = key;
        this.value = value;
        proximo = null;
    }

    public Registro() {
        proximo = null;
    }

    private int key;
    private String value;
    private Registro proximo;

    public Registro getProximo() {
        return this.proximo;
    }

    public void setProximo(Registro proximo) {
        this.proximo = proximo;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int espalhamentoDivisao(int key, int m) {
        return (key & 0x7FFFFFFF) % m;
    }

    public int espalhamentoMultiplicacao(int key, int m, float a) {
        float val =  key * a;
        val -= (int) val;
        return (int) (m * val);
    }
}
