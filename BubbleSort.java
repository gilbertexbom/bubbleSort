import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        //Declaração de variáveis
        //int n1, n2;
        int[] num = new int[4];

        //Construção do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Bubble Sort --\n");

        //Entradas
        for(int i = 0; i < 4; i++){
            System.out.print("Informe o n" + (i+1) + ": ");
            num[i] = entrada.nextInt();
        }
        /* obsoleto
        System.out.print("Informe o n1: ");
        n1 = entrada.nextInt();

        System.out.print("Informe o n2: ");
        n2 = entrada.nextInt();
        */

        //Processamento
        for(int i = 0; i < 3; i++){
            for(int j = (i+1); j < 4; j++){
                if(num[i] > num[j]){
                    int swap = num[j];
                    num[j] = num[i];
                    num[i] = swap;
                }
            }
        }
        
        /* obsoleto
        if(n1 > n2){
            int swap = n2;
            n2 = n1;
            n1 = swap;
        }
        */

        //Saída
        System.out.println("\n");
        for(int n: num){
            System.out.print(n + ", ");
        }
        //System.out.println("\n" + n1 + ", " + n2 + "\n");

    }

}