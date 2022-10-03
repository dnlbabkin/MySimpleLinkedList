package node;

public class Node<E> {

    public E data; //данные
    public Node<E> next; //ссылка на следующий узел


    //конструктор для создания нового узла
    public Node(E data) {
        this.data = data;
        next = null;
    }
}
