package ed_2018_lista2_tadpilha;

/*
Escreva um metodo que teste e informe se uma P1 tem mais elementos que uma pilha P2. Considere que P1 e P2 existem.
 */
public class Exercicio1 {

    private boolean testaP1(Pilha pilha1, Pilha pilha2) {
        int testePilha1 = Desempilhadoramento(pilha1);
        int testePilha2 = Desempilhadoramento(pilha2);
        if(testePilha1==testePilha2){
            return true;
        }
        return false;
    }

    private int Desempilhadoramento(Pilha pilha) {
        int count = 0;
        while (pilha.isEmpty() == false) {
            pilha.Pop();
            count++;
        }
        return count;
    }

    public void Exercicio1() {
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();

        for (int i = 0; i < 9; i++) {
            pilha1.Push(i);
        }
        for (int i = 0; i < 9; i++) {
            pilha2.Push(i);
        }
        if (testaP1(pilha1, pilha2)) {
            System.out.println("Ok, possuem o mesmo numero de elmentos");
        } else {
            System.out.println("OPS!!!, Nao possuem o mesmo numero de elmentos");
        }
    }

}
