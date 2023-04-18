import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] hiddenArr; // array of objects inside the arraylist
    private int size; //shows the size of the arraylist

    public MyArrayList(int initialCapacity){
        hiddenArr = new Object[initialCapacity]; //capacity != size
    }
    public MyArrayList(){
        this(7);
    }

    private void increaseArray(){        //increasing the size of arraylist, making it twice bigger
        int biggerSize = hiddenArr.length * 2;
        Object[] biggerArr = new Object[biggerSize];

        for (int i = 0; i < hiddenArr.length; i++) {
            biggerArr[i] = hiddenArr[i];
        }
        hiddenArr = biggerArr;
    }

    @Override
    public void add(T item){ // adding the element to the end of the arraylist
        if (size == hiddenArr.length) {
            increaseArray();
        }
        hiddenArr[size++] = item;
    }

    @Override
    public T get(int index) { // returning the data of the element of the certain index
        if (index >= size) throw new IndexOutOfBoundsException();
        return (T)hiddenArr[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> { // to iterate through arraylist
        private int cursor;

        @Override
        public boolean hasNext(){
            return cursor < size();
        }

        @Override
        public T next() {
            return get(cursor++);
        }
    }

    public T remove(int index){
        if (index >= size)throw new IndexOutOfBoundsException();
        T elem = get(index);
        for (int i = index; i < size - 1; i++) {
            hiddenArr[i] = hiddenArr[i+1];
        }
        hiddenArr[size - 1] = null;
        size--;
        return elem;
    }


}
