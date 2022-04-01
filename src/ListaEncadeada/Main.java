package ListaEncadeada;

class Main {
    public static void main(String[] args) {
        ListaEncadeadaAD lista = new ListaEncadeadaAD();
        lista.inserePrimeiro(1);
        lista.inserePrimeiro(2);
        lista.inserePrimeiro(3);
        lista.insereUltimo(7);
        lista.removePrimeiro();
        lista.removeUltimo();
        lista.removeNoAD();

        lista.insereDepois(new NoAD(2), 4);

        System.out.println(lista.vazia());

        lista.imprime();
    }
}