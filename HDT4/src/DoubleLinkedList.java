public class DoubleLinkedList<T> extends AbstractList<T>{

    /**Clase interna de nodos de la lista*/
    private class Node {
        /**Almacenamiento del dato */
        T data;

        /**Referencias al nodo anterior y siguiente */
        Node next, prev;

        /**Constructor de nodos*/
        Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    /**Referencia al primer nodo y ultimo nodo de la lista */
    private Node head, tail;

    /**Metodos */

    /**Metodo para agregar nuevo nodo */
    @Override
    public void add(T value){
        Node nodo = new Node(value);
        if (isEmpty()){
            /**La lista al estar vacia, el nuevo nodo es tanto el primer como el ultimo */
            head = tail = nodo;
        } else{
            /**Enlaza un nuevo nodo al inicio */
            nodo.next = head;
            /**Conecta un nodo anterior con uno nuevo */
            head.prev = nodo;
            /**Al realizar todo lo anterior se establece un nuevo nodo */
            head = nodo;
        }
        /**Aumento de la lista */
        size++;
    }

    /**Metodo para eliminar nodos */
    @Override
    public T remove(){
        if (isEmpty()) return null;

        T value = head.data;
        /**Pasa el mayor a otro nodo */
        head = head.next;

        if (head != null){
            /**Elimina las referencias del primero y ultimo nodo */
            head.prev = null;
        } else {
            /**Si la lista queda vacia, el ultimo nodo es nulo */
            tail = null;
        }
        /**Reduce el tamano de la lista */
        size--;
        /**retorna value */
        return value;
    }

    public T getValue(){
        return head.data;
    }

    public int getSize(){
        return size;
    }
}
