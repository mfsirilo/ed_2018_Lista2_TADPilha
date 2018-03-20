package ed_2018_lista2_tadpilha;
/*
Escreva um programa que solicite ao usuario uma sequencia de caracteres sem limite
maximo de tamanho e realize as seguintes operaçoes usando uma pilha:
a) Imprimir o texto em ordem inversa
b) Verificar se o texto e um palindromo. Ignore espaços e pontos.

*/

import java.util.*;
public class Exercicio3 {
    
    public void dezinversogramentadoramento(Pilha pilha2){
        Pilha aux = new Pilha();
        aux=pilha2;
        while(!aux.isEmpty()){
            System.out.print(aux.Topo());
            aux.Pop();
        }
        System.out.println("");
    }

    public void Exercicio3() {
        Scanner scan = new Scanner(System.in);
        
        String texto;
        
        Pilha pilha1 = new Pilha();
        Pilha pilhaComparacao = new Pilha();
        System.out.println("Informe o texto:");
        texto = scan.nextLine();
        for(int i=0; i < texto.length();i++){
            pilha1.Push(texto.charAt(i));
        }

        dezinversogramentadoramento(pilha1);

        for(int i=0; i < texto.length();i++){
            if(texto.charAt(i)==(' ')){
            } else {
                pilha1.Push(texto.charAt(i));
            }
        }
        pilhaComparacao=(pilha1);
        if(pilha1.equals(pilhaComparacao)){
            System.out.println("O texto é um palindromo!");
        }else{
            System.out.println("O texto não é um palindromo");
        }
    }
}
