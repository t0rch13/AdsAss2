

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(17);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(24);
        for (var elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        System.out.println(list.size());
        list.remove(2);
        for (var elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        System.out.println(list.size());

        
    }
}