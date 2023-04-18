import java.util.Iterator;
public class MyLinkedList<T> implements MyList<T>{
    private class MyNode { //Double linkedlist, each node has reference to next and prev
        private final T data;
        private MyNode next;
        private MyNode prev;

        public MyNode(T data) {
            this.data = data;
        }
    }

    // linkedlist has head and tail - reference to the first and last elements of it
    private MyNode head;
    private MyNode tail;
    private int size;


    public void add(T item){ // adding items to the end of the linkedlist
        MyNode newNode = new MyNode(item);
        if(head == null){ //if the list is empty
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public MyNode findNode(int index){ // method to avoid code repetition, finds the node using head or tail
        if (index >= size)throw new IndexOutOfBoundsException();
        if (index < size / 2) { //checking if the node is closer to head or to tail
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
        MyNode current = tail;
        for (int i = size - 1; i > index; i--) {
            current = current.prev;
        }
        return current;
    }

    public T get(int index) { // returns the data of the node of the inserted index
        MyNode current = findNode(index);
        return current.data;
    }

    public int size(){ // returns size of the linkedlist
        return size;
    }

    public T remove(int index){ // removes node form the linked list returning the data inside removed node
        T data = get(index);
        if(findNode(index) == head){ // if the element is head
            MyNode nextNode = findNode(index + 1);// node after head
            head = nextNode;
            size--;
            return data;
        } else if (findNode(index) == tail) { // if the element is tail
            MyNode prevNode = findNode(index - 1);// node before tail
            tail = prevNode;
            prevNode.next = null;
            size--;
            return data;

        }
        MyNode prevNode = findNode(index - 1);// node before current node
        MyNode nextNode = findNode(index + 1);// node after current node
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
        size--;
        return data;
    }

    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T>{ // to iterate through linkedlist
        MyNode cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next(){
            T data = cursor.data;
            cursor = cursor.next;
            return data;
        }

    }
}
