import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        
        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
        
        System.out.println("A idade em dias é: " + idadeEmDias);

        scanner.close();
    }

    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        int totalDias = anos * 365 + meses * 30 + dias;
        return totalDias;
    }
}
