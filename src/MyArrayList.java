import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] hiddenArr;
    private int size;

    public MyArrayList(int initialCapacity){
        hiddenArr = new Object[initialCapacity];
    }
    public MyArrayList(){
        this(5);
    }

    private void increaseArray(){               //increasing the size of arraylist, making it twice bigger
        int biggerSize = hiddenArr.length * 2;
        Object[] biggerArr = new Object[biggerSize];

        for (int i = 0; i < hiddenArr.length; i++) {
            biggerArr[i] = hiddenArr[i];
        }
        hiddenArr = biggerArr;
    }

    @Override
    public void add(T item){
        if (size == hiddenArr.length) {
            increaseArray();
        }
        hiddenArr[size++] = item;
    }

    @Override
    public T get(int index) {
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

    private class MyIterator implements Iterator<T> {
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
    @Override
    public T remove(int index){
        T elem = get(index);
        for (int i = index; i < size - 1; i++) {
            hiddenArr[i] = hiddenArr[i+1];
        }
        hiddenArr[size - 1] = null;
        size--;
        return elem;
    }


}
