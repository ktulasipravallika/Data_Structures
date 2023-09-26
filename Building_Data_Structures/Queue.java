import java.util.Iterator;

public class Queue<T> {

    private DoublyLinkedList<T> list = new DoublyLinkedList<T>();

    public Queue(){}
    public Queue(T firstElement){
        offer(firstElement);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public T peek() {
        return list.peekFirst();
    }

    public T poll(){
        if(isEmpty()){
            throw new RuntimeException("Empty Queue");
        }
        return list.removeFirst();
    }

    public void offer(T element){
        list.addLast(element);
    }
}
