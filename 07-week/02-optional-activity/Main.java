import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome to Java!");

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        if (count == 0) {
            System.out.print("Enter the size of the vector: ");
            count = scanner.nextInt();
        }

        Double[] vectorA = new Double[count];
        Double[] vectorB = new Double[count];
        Double[] vectorC = new Double[count];
        Double[] vectorD = new Double[count]; // ← NUEVO vector para la resta

        int i;

        // Vector A
        for(i = 0; i < vectorA.length; i++){
            vectorA[i] = (double) (i + 1);
        }

        // Vector B
        for(i = 0; i < vectorB.length; i++){
            vectorB[i] = vectorA[i] * 7;
        }

        // Vector C (suma)
        for(i = 0; i < vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        // Vector D (resta)
        for(i = 0; i < vectorD.length; i++){
            vectorD[i] = vectorB[i] - vectorA[i]; // ← RESTA en double
        }

        // Salidas
        System.out.println("\n\nVector A: ");
        for(i = 0; i < vectorA.length; i++){
            System.out.print(vectorA[i].intValue() + " - ");
        }

        System.out.println("\n\nVector B: ");
        for(i = 0; i < vectorB.length; i++){
            System.out.print(vectorB[i].intValue() + " * ");
        }

        System.out.println("\n\nVector C (Suma): ");
        for(i = 0; i < vectorC.length; i++){
            System.out.print(vectorC[i].intValue() + " | ");
        }

        System.out.println("\n\nVector D (Resta): ");
        for(i = 0; i < vectorD.length; i++){
            System.out.print(vectorD[i].intValue() + " # ");
        }
    }
}