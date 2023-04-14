public class MyArrayList<T> {
    private Object[] hiddenArr;
    private int length;

    public MyArrayList(int initialCapacity){
        hiddenArr = new Object[initialCapacity];
    }
    public MyArrayList(){
        this(5);
    }

}
