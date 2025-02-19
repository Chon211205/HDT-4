import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements StackADT<T> {

    /**Instancia del Arraylist */
    private List<T> stack = new ArrayList<>();

    /**Metodos */
    /**El "?" es una declaracion generica, significando que puede aceptar cualquier tipo de variable. */

    /**Metodo para introducir un elemento en el stack aplicando push */
    @Override
    public void push(T value) {stack.add(value);}

    /**Metodo para eliminar un elemento del stack aplicando pop */
    @Override
    public T pop(){return stack.isEmpty()? null : stack.remove(stack.size()-1);}

    /**Metodo para ver el elemento en la cima del stack aplicando peek*/
    @Override
    public T peek(){return stack.isEmpty()? null : stack.get(stack.size()-1);}

    /**Metodo para ver si el stack esta vacio  isEmpty*/
    @Override
    public boolean isEmpty(){return stack.isEmpty();}
    
}
