package ed_2018_lista2_tadpilha;

import java.util.Scanner;

public class Ed_2018_Lista2_TADPilha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercicio1 exe1 = new Exercicio1();
        Exercicio2 exe2 = new Exercicio2();
        Exercicio3 exe3 = new Exercicio3();

        System.out.println("Informe o exercicio a ser executado de 1 a 3 ");
        int exe = scan.nextInt();

        while (exe != 0) {
            switch (exe) {
                case 1:
                    exe1.Exercicio1();
                    break;
                case 2:
                    exe2.Exercicio2();
                    break;
                case 3:
                    exe3.Exercicio3();
                    break;

            }
            System.out.println("Deseja continuar? se não digite 0");
            exe = scan.nextInt();
        }

    }

}

