

public class Main {
    public static void main(String[] args) {

        // MyLinkdedList add, remove, size methods test
        MyLinkedList<Integer> iList = new MyLinkedList<>();
        iList.add(1);
        iList.add(2);
        iList.add(4);
        iList.add(24);
        iList.add(13);
        for (var elem: iList) {
            System.out.println(elem);
        }
        System.out.println();
        System.out.println(iList.size());
        System.out.println();
        System.out.println(iList.remove(0));
        System.out.println();
        for (var elem: iList) {
            System.out.println(elem);
        }
        System.out.println();
        System.out.println(iList.size());

        // MyArrayList add, remove, size methods test
        MyArrayList<String> sList = new MyArrayList<>();
        sList.add("Coding");
        sList.add("is");
        sList.add("so");
        sList.add("much");
        sList.add("fun");
        for (var elem: sList) {
            System.out.println(elem);
        }
        System.out.println();
        System.out.println(sList.size());
        System.out.println();
        System.out.println(sList.remove(4));
        System.out.println();
        for (var elem: sList) {
            System.out.println(elem);
        }
        System.out.println();
        System.out.println(sList.size());
        
        
        
    }
}