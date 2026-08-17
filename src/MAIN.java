import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        System.out.printf("porfavor coloque seu nome ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.printf("insira um numero positivo: ");
        int numero = sc.nextInt();
        for (int i = 0; i <= numero; i++) {
            System.out.printf("CRESENTE %d\n", i);
        }
        for(int i = numero; i >= 0; i--) {
            System.out.printf("DECRESENTE %d\n", i);
        }

    if (nome.length() <= 6){
        System.out.printf(nome);
    }
    else {
        for (int i = 1; i <= numero; i++) {
            System.out.printf("%d: %s\n", i, nome);
        }
    }
    }
}
