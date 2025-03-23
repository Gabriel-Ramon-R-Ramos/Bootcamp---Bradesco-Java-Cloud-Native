import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int paramentro1 = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        int paramentro2 = scan.nextInt();

        try {
            contar(paramentro1, paramentro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro precisa ser maior que o primeiro.");
        }
        scan.close();
    }

    static void contar(int paramentro1, int paramentro2) throws ParametrosInvalidosException {
        if (paramentro1 > paramentro2) {
            throw new ParametrosInvalidosException();
        } else {
            int contador =  paramentro2 - paramentro1;
            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}
