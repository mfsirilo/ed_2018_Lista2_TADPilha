package ed_2018_lista2_tadpilha;
/*
Escreva um metodo para inverter a posiçao dos elementos de uma pilha P.
O uso de pilhas auxiliares e permitido, mas o resultado deve ser dado na pilha P. 
*/

public class Exercicio2 {
    
    private Pilha Inverter(Pilha pilha){
        Pilha pilhaAux = new Pilha();
        
        while(pilha.isEmpty()==false){
            pilhaAux.Push(pilha.Topo());
            pilha.Pop();
        }
        return pilha;
    }

    public void Exercicio2() {
        Pilha pilha1 = new Pilha();
        
        for(int i = 0; i<20;i++){
            pilha1.Push(i);
        }
        pilha1=Inverter(pilha1);
        pilha1=Inverter(pilha1);
        
        while(pilha1.isEmpty()==false){
            System.out.println(pilha1.Topo());
            pilha1.Pop();
        }
        

    }

}
