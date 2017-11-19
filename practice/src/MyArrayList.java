import java.util.Arrays;

public class MyArrayList<E> {

    private static final int INIT_CAPACITY = 10;
    private E [] theData;
    private int size;
    private int capacity = 0;

    public MyArrayList(){
        theData = (E []) new Object[INIT_CAPACITY];
        size=0;
    }

    public void add(int index, E anEntry){
        if( index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException(index);

        if(size >= capacity)
            reallocate();
        for(int i=size-1;i>=index; i-- ){
            theData[i+1] = theData[i];
            theData[index] = anEntry;
                size++;
        }
    }

    private void reallocate() {
        capacity *= 2;
        theData = Arrays.copyOf(theData, capacity);
    }

    public void add(E anEntry){

    }

    public int indexOf( E anEntry) {
        for (int i = 0; i < size; i++) {
            if (theData[i].equals(anEntry)) //==으로 하면안됨 , 가상의타입이라도 equals메서드를 가지고있으므로 이렇게해야함함
                return i;

        }
        return -1;
    }
}
