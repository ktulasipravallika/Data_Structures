import java.util.EmptyStackException;


public class Stack<T> {

    private DoublyLinkedList <T> list = new DoublyLinkedList<T>();

    public Stack(){}
    public Stack(T firstElem){
        push(firstElem);
    }

    public int Size() {
        return list.size();
    }

    public boolean isEmpty(){
        return Size()==0;
    }

    public void push(T element){
        list.addLast(element);
    }

    public void pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            list.removeLast();
        }
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return list.peekLast();
        }
    }
}
