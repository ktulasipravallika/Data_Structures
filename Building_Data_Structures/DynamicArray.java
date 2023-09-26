public class DynamicArray<T> {

     int length = 0;
     int capacity = 0 ;
     private T arr[];

     public DynamicArray() {
        this(16);
     }

    public DynamicArray(int length) {
        if(length < 0)
            throw new IllegalArgumentException("The capacity should be more than or equal to 0 " + length);
        this.length = length;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T element){
        arr[index] = element;
    }

    public void clear() {
        for(int i = 0 ; i < capacity ; i++){
            arr[i]=null;
        }
        length= 0;
    }

    public void add(T element){
        if(length + 1 >= capacity){
            if(capacity == 0){
                capacity = 1;
            }
            else{
                capacity *= 2;
            }
        T[] new_arr =(T[]) new Object[capacity];
        for(int i = 0 ; i < length ; i ++){
            new_arr[i] = arr[i];
        }
        arr= new_arr;
        }
        arr[length++] = element;
    }

    public T removeAt(int rm_index){

        if(rm_index < 0 || rm_index >=length){
            throw new IndexOutOfBoundsException();
        }
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[length-1];

        for(int i = 0,j=0; i < length ; i++, j++){
            if(i == rm_index) j--;
            
            else new_arr[j]= arr[i];
        }
        arr = new_arr;
        capacity = --length;
        return data;
    }

    public boolean remove(Object element){
        for(int i = 0 ; i < length ; i++){
            if(arr[i].equals(element)){
                removeAt(i);
                return true;
            } 
        }
        return false;
    }

    public int indexOf(Object element){
        for(int i = 0 ; i < length ; i ++){
            if(arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object element){
        return indexOf(element)!=-1;
    }

    public String toString(){
        if(length == 0){
            return "[]";
        }
        else{
            StringBuilder sb = new StringBuilder(length).append("[");
            for(int i = 0; i < length ; i ++ ){
                sb.append(arr[i] + ",");
            }
            return sb.append("]").toString();
        }

    }
}









