public abstract class AbstractList<T> implements ListADT<T> {

    /**numero de elementos en la lista */
    protected int size = 0;

    @Override
    public boolean isEmpty() { return size == 0; }
    
}
