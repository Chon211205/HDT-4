public class StackFactory {
    public static<T> StackADT<T> createStack(int eleccion){
        /**Al utilizar la variable eleccion, este identifica que tipo de stack se usara y lo retorna. Si es igual a 1, crea un ArrayListStack; por el contrario, se crea un VectorStack. */
        return (eleccion == 1)? new ArrayListStack<>() : new VectorStack<>();
    }   
}
