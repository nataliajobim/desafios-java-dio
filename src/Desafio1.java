import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (A == B)
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");
    }
}

