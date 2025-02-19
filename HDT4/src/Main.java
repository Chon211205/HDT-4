import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**Pregunta al usuario en que tipo de stack desea utilizarlo */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementación de pila: 1. ArrayList  2. Vector");
        int Op = scanner.nextInt();
        scanner.nextLine();

        StackADT<Character> charStack = StackFactory.createStack(Op);
        StackADT<Integer> intStack = StackFactory.createStack(Op);

        Calculadora calc = Calculadora.getInstance();

        //Lee el archivo .txt proporcionado
        String infix = " ";
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            infix = br.readLine();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        String postfix = calc.InfixToPostfix(infix, charStack);
        int result = calc.evaluatePostfix(postfix, intStack);

        System.out.println("Expresión Infix: " + infix);
        System.out.println("Expresión Postfix: " + postfix);
        System.out.println("Resultado: " + result);
    }
}
