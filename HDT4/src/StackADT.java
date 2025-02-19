public interface StackADT<T> {

    /**Esta clase se implementa con ArrrayListStack y VectorStack */
    /**Establece las acciones como push, pop, peek o isEmpty para el funcionamiento de las operaciones */
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
}