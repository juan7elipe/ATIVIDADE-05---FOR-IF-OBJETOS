import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 20;
        int i;
        int numero;
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;

        for (i = x; i >= 1; i--) {
                System.out.println("Digite o " + (21 - i) + " º número:");
                numero = scanner.nextInt();

                if (numero >= 0 && numero <= 100) {
                cont = cont + 1;
                }

                else if (numero >= 101 && numero <= 200) {
                cont2 = cont2 + 1;
                }

                else {
                cont3 = cont3 + 1;
                 }
        }

        if (cont > 0) {
            System.out.println(cont + " Número(os) entre 0 e 100");
        } else {
            System.out.println("Nennhum número está entre 0 e 100");
        }

        if (cont2 > 0) {
            System.out.println(cont2 + " Número(os) entre 101 e 200");
        } else {
            System.out.println("Nenhum número está entre 101 e 200");
        }

        if (cont3 > 0) {
            System.out.println(cont3 + " Número(os) maior(es) que 200");
        } else {
            System.out.println("Nenhum número acima de 200");
        }

    }
}
