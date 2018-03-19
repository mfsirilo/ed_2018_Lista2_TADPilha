package ed_2018_lista2_tadpilha;
/*
Escreva um metodo para inverter a posiçao dos elementos de uma pilha P.
O uso de pilhas auxiliares e permitido, mas o resultado deve ser dado na pilha P. 
*/

public class Exercicio2 {
    
    private Pilha Inverter(Pilha pilha){
        Pilha pilhaAux = new Pilha();
        Pilha pilhaAux1 = new Pilha();
        pilhaAux1=pilha;
        while(pilhaAux1.isEmpty()==false){
            pilhaAux.Push(pilhaAux1.Topo());
            pilhaAux1.Pop();
        }
        return pilhaAux;
    }

    public void Exercicio2() {
        Pilha pilhaP = new Pilha();
        Pilha pilha2 = new Pilha();
        
        for(int i = 0; i<3;i++){
            pilhaP.Push(i);
        }
        pilha2=pilhaP;
        System.out.println("Pilha original é:");
        while(pilha2.isEmpty()==false){
            System.out.println(pilha2.Topo());
            pilha2.Pop();
        }

        pilhaP=Inverter(pilhaP);
        pilhaP=Inverter(pilhaP);
        System.out.println("Pilha invertida é:");
        
        while(pilhaP.isEmpty()==false){
            System.out.println(pilhaP.Topo());
            pilhaP.Pop();
        }
        

    }

}
