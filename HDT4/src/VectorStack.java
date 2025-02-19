import java.util.Vector;

public class VectorStack<T> implements StackADT<T> {

    /**Instancia para Vector stack */
    private Vector<T> stack = new Vector<>();

    /**Metodos */
    /**El "?" es una declaracion generica, significando que puede aceptar cualquier tipo de variable. */

    /**Metodo para agregar un elemento al stack aplicando push */
    @Override
    public void push(T value) {stack.add(value);}

    /**Metodo para eliminar un elemento del stack aplicando pop */
    @Override
    public T pop() {return stack.isEmpty()? null : stack.remove(stack.size()-1);}

    /** Metodo para obtener el elemento mayor del stack aplicando peek*/
    @Override
    public T peek() {return stack.isEmpty()? null : stack.get(stack.size()-1);}

    /** Metodo para verificar si el stack esta vacio */
    @Override
    public boolean isEmpty() {return stack.isEmpty();}
    
}
