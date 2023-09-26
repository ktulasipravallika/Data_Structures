

import org.w3c.dom.Node;

public class DoublyLinkedList<T> {
    
    private int size;
    private Node <T> head = null;
    private Node <T> tail = null;

    private class Node<T>{
        T data;
        Node <T> previous, next;

        public Node(T data, Node <T> previous , Node <T> next){

            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        public String toString() {
            return data.toString();
        }
    }

    public void clear(){
        Node <T> trav = head;

        while(trav!=null){
            Node <T> nextNode = trav.next;
            trav.previous = trav.next = null;
            trav.data = null;
            trav = nextNode;
        }
        head = trav = tail = null;
        size = 0;
    } 

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void add(T element){
        addLast(element);
    }

    public void addFirst(T element){
        if(isEmpty())
            head = tail = new Node<T>(element, null, null);
        else{
            head.previous = new Node<T>(element, null , head);
            head = head.previous;
        }

        size++;
    }

    public void addLast(T element){

        if(isEmpty())
            head = tail = new Node<T>(element, null, null);
        else{
            tail.next = new Node<T>(element, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public T peekFirst(){
        if(isEmpty()) throw new RuntimeException("Empty List");
        return head.data;
    }

    public T peekLast() {
        if(isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }

    public T removeFirst(){
        if(isEmpty()) throw new RuntimeException("Empty List");
        else{
            T data = head.data;
            head = head.next;
            size--;

            if(isEmpty()) tail = null;
            else head.previous = null;
            return data;
        }
    }

    public T removeLast() {
        if(isEmpty()) throw new RuntimeException("Empty List");
        T data = tail.data;
        tail = tail.previous;
        size--;

        if(isEmpty()) head = null;
        tail.next = null;
        
        return data;

    }

    public T remove(Node <T> node){
        if(isEmpty()) throw new RuntimeException("Empty List");

        if(node.previous == null) removeFirst();
        if(node.next == null) removeLast();

        node.next.previous = node.previous;
        node.previous.next = node.next;

        node.next= node.previous = null;
        T data = node.data;
        node.data = null;
        size--;

        return data;
    }

    public T remove(int index){
        if(index < 0 || index >= size) throw new RuntimeException("Index is more than size");

        Node <T> trav;
        int i;

        if(index < size/2){
            for( i = 0, trav = head ; i!=index ; i++){
                trav = trav.next;
            }
        }
        else{
            for( i = size -1, trav = tail ; i!=index ; i--){
                trav = trav.previous;
            }
        }
        return remove(trav);
    }

    public boolean remove(Object obj){
        Node <T> trav = head;
        if(obj.equals(null))
        for(trav = head; trav != null; trav = trav.next){
            if(trav.data == null){
                remove(trav);
                size--;
                return true;
            }
        }
        else{
            for(trav = head; trav != null ; trav = trav.next){
                if(trav.data.equals(obj)){
                    remove(trav);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    public int indexOf(Object obj){

        if(isEmpty()) throw new RuntimeException("Empty List");
        Node <T> trav = head;
        int index =0;

        if(obj== null){
            for(trav = head; trav != null ; trav= trav.next, index++){
                if(trav.data == null){
                    return index;
                }
            }
        }

        else {
            for(trav= head; trav!=null ; trav = trav.next, index++){
                if(obj.equals(trav.data)){
                    return index;
                }
            } 
        }
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj)!=-1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node <T> trav = head;

        sb.append("[");
        while(trav!=null){
            sb.append(trav.data + ",");
            trav = trav.next;
        }
        sb.append("]");

        return sb.toString();
    }
}


    

