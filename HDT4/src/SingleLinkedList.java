public class SingleLinkedList<T> extends AbstractList<T> {

    /**Clase interna de los nodos de la lista */
    private class Node {
        /**Almacenamiento del dato */
        T data;
        /**referencia para un siguiente nodo */
        Node next;

        /**Constructor del nodo */
        Node(T data){
            this.data = data;
        }
    }

    /**Referencia al primer nodo de la lista */
    private Node head;

    /**Metodos */

    /**Metodo para agregar un nodo */
    @Override
    public void add(T value) {
        /**Instancia del nodo */
        Node nodo = new Node(value);

        /**Si la lista está vacía, el nuevo nodo será el primero */
        nodo.next = head;
        head = nodo;

        /**Incrementa el tamaño de la lista */
        size++; 
    }

    /**Metodo para eliminar un nodo */
    @Override
    public T remove(){

        /**Comprueba si esta vacio, al cumplirse esto retorna null */
        if (isEmpty()) return null;
        T value = head.data;

        /**Mueve el dato maayor a otro nodo */
        head = head.next;

        /**Reduce el tamano de la lista */
        size--;
        return value;
    }   

    public T getValue(){
        return head.data;
    }

    public int getSize(){
        return size;
    }
}
