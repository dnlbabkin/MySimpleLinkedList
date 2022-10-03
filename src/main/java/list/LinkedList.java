package list;

import node.Node;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node<E> head; //начало списка

    public LinkedList() {
        head = null; //пустой список
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data); //новый узел
        Node<E> currentNode = head; //текущий узел (для перемещения по списку)

        if (head == null) {
            head = newNode; //если отуствует начало списка, то созданный элемент становится началом
        } else {
            //Проход до конца списка
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void remove(E data) {
        Node<E> currentNode = head;
        Node<E> previousNode = null;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next; //предыдущий узел ссылается на следующий после текущего
                }
            }

            previousNode = currentNode;
            currentNode = currentNode.next; //текущий узел равен следующему
        }
    }

    public Object getFirst() {
        final Node<?> first = head;

        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    public void print() {
        Node<?> currentNode = head;

        if(head != null) {
            System.out.println(head.data);
        }

        while (true) {
            assert currentNode != null;
            if (currentNode.next == null) break;
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }
}
