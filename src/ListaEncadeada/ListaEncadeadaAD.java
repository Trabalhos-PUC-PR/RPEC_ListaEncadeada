package ListaEncadeada;

public class ListaEncadeadaAD {
    private NoAD primeiro;

    public ListaEncadeadaAD() {
        this.primeiro = null;
    }

    public ListaEncadeadaAD(NoAD pPrimeiro) {
        this.primeiro = pPrimeiro;
    }

    public boolean vazia(){
        if(primeiro==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void inserePrimeiro(int pDado) {
        if(primeiro != null) {
            NoAD dado = new NoAD(pDado);
            dado.setProximo(primeiro);
            primeiro = dado;
        } else {
            primeiro = new NoAD(pDado);
        }
    }

    public void insereUltimo(int pDado) {
        NoAD dado = primeiro;
        while(dado.getProximo() != null){
            dado = dado.getProximo();
        }
        dado.setProximo(new NoAD(pDado));
    }

    public void insereDepois(NoAD pNo, Integer pDado) {
        NoAD dado = primeiro;
        while(dado != null) {
            if (pNo.getDado() == dado.getDado()) {
                NoAD novo = new NoAD(pDado);
                novo.setProximo(dado.getProximo());
                dado.setProximo(novo);
                break;
            }
            dado = dado.getProximo();
        }
    }

 // a lista ja ta ordenada previamente? e se tiver [0, 2, 3, 2]????
    public void insereOrdenado(int valor) {
        NoAD dado = primeiro;
            while(dado != null) {
                if(dado.getProximo() == null) {
                    insereUltimo(valor);
                    return;
                }else {
                    if(dado.getProximo().getDado() >= valor) {
                        NoAD novo = new NoAD(valor);
                        novo.setProximo(dado.getProximo());
                        dado.setProximo(novo);
                        return;
                    }
                    dado = dado.getProximo();    
                }
            }
    }
    
    public void imprime() {
        NoAD dado = primeiro;
        System.out.print('[');
        while(dado != null) {
            System.out.print(dado.getDado());
            dado = dado.getProximo();
            if(dado != null){
                System.out.print(", ");
            }
        }
        System.out.println(']');
    }

    public NoAD removePrimeiro(){
        if (vazia()){
            System.out.println("A lista esta vazia");
            return null;
        }
        NoAD pPrimeiro = primeiro;
        primeiro = primeiro.getProximo();
        return pPrimeiro;
    }

    public NoAD removeUltimo(){
        if (vazia()){
            System.out.println("A lista esta vazia");
            return null;
        }
        NoAD nos = primeiro;
        NoAD anterior = null;

        while(nos.getProximo() != null){
            anterior = nos;
            nos = nos.getProximo();
        }
        NoAD retorno = nos;
        anterior.setProximo(null);
        return retorno;

    }

    public NoAD removeNoAD(NoAD pNO){
        if (vazia()){
            System.out.println("A lista esta vazia");
            return null;
        }
        NoAD nos = primeiro;
        NoAD anterior = null;

        while(nos.getProximo() != null){
            if(pNO.getDado() == nos.getDado()){
                NoAD retorno = nos;
                anterior.setProximo(null);
                return retorno;
            }else{
                anterior = nos;
                nos = nos.getProximo();
            }

        }
        return null;
    }

}
