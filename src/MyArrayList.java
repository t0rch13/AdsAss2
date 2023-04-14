public class MyArrayList<T> {
    private Object[] hiddenArr;
    private int size;

    public MyArrayList(int initialCapacity){
        hiddenArr = new Object[initialCapacity];
    }
    public MyArrayList(){
        this(5);
    }

    private void increaseArray(){
        int biggerSize = hiddenArr.length * 2;
        Object[] biggerArr = new Object[biggerSize];

        for (int i = 0; i < hiddenArr.length; i++) {
            biggerArr[i] = hiddenArr[i];
        }
        hiddenArr = biggerArr;
    }


}
