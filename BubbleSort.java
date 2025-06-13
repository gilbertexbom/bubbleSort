import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2;

        //Construção do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Bubble Sort --\n");

        //Entradas
        System.out.print("Informe o n1: ");
        n1 = entrada.nextInt();

        System.out.print("Informe o n2: ");
        n2 = entrada.nextInt();

        //Processamento
        if(n1 > n2){
            int swap = n2;
            n2 = n1;
            n1 = swap;
        }

        //Saída
        System.out.println("\n" + n1 + ", " + n2 + "\n");

    }

}