import java.util.Map; /**Biblioteca que permite almacenar datos en pares, especificamente con su clave(palabra) y valor(numero) */

public class Calculadora {
    private static Calculadora instance;
    private Calculadora(){}

    public static Calculadora getInstance(){
        if(instance == null) instance = new Calculadora();
            return instance;
    }

    
    /** Metodos */

    /** Metodo de conversion de infix a postfix */
    public String InfixToPostfix(String infix, StackADT<Character> stack){
        /**Con el stringbuilder es posible manipular las cadenas de caracteres, siendo estos los que leera por medio del archivo .txt. */
        StringBuilder Postfix = new StringBuilder();
        /**Al utilizar map, cada operacion es un String, por lo tanto tiene asignado un valor numerico */
        Map<Character, Integer> precedence = Map.of('+', 1, '-', 1, '*', 2, '/', 2);

        for (char ch : infix.toCharArray()){
            if(Character.isDigit(ch)){
                Postfix.append(ch).append(' ');
            } else if(ch == '('){
                stack.push(ch);
            } else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    Postfix.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence.getOrDefault(stack.peek(),0)>= precedence.getOrDefault(ch, 0)){
                    Postfix.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()) Postfix.append(stack.pop()).append(' ');
        return Postfix.toString();
    
    }


    /** Metodo de evaluacion de postfix */
    public int evaluatePostfix(String postfix, StackADT<Integer> stack) {
        /**Con este ciclo for, itera con los token; al ser numero, lo convierte en entero y lo agrega al stack. Si es operador, se extraen y aplican. */
        for (String token : postfix.split(" ")) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(switch (token) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> throw new IllegalArgumentException("Operador inválido");
                });
            }
        }
        return stack.pop();
    }
    

}
