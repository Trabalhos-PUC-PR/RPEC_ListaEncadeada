package ListaEncadeada;

public class NoAD {
    private Integer dado;
    private NoAD proximo;

    public NoAD() {
        this.dado = null;
        this.proximo = null;
    }

    public NoAD(Integer pDado) {
        this.dado = pDado;
        this.proximo = null;
    }

    public void setProximo(NoAD pNo) {
        this.proximo = pNo;
    }

    public NoAD getProximo() {
        return this.proximo;
    }

    public Integer getDado() {
        return this.dado;
    }
}