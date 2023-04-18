

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(24);
        list.add(13);
        for (var elem: list) {
            System.out.println(elem);
        }
        System.out.println();

        System.out.println(list.remove(4));
        System.out.println();
        for (var elem: list) {
            System.out.println(elem);
        }
        
    }
}