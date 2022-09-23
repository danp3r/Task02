import list.MyList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nТест первый");
        MyList first = new MyList();
        first.add(1);
        first.add(3);
        first.add(5);
        first.add(7);

        MyList second = new MyList();
        second.add(2);
        second.add(4);
        second.add(6);
        second.add(8);

        printLists(first, second);

        MyList myList = Function.mergeLists(first, second);
        System.out.println("Результат");
        print(myList);

        System.out.println("Размер первого списка " + first.getSize());
        System.out.println("Размер второго списка " + second.getSize());

        System.out.println("\n\nТест второй");

        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);

        second.add(5);
        second.add(6);
        second.add(7);
        second.add(8);
        printLists(first, second);

        myList = Function.mergeLists(first, second);
        System.out.println("Результат");
        print(myList);

        System.out.println("Размер первого списка " + first.getSize());
        System.out.println("Размер второго списка " + second.getSize());

        System.out.println("\n\nТест третий");

        first.add(5);
        first.add(6);

        second.add(1);
        second.add(3);
        second.add(7);

        printLists(first, second);

        myList = Function.mergeLists(first, second);
        System.out.println("Результат");
        print(myList);

        System.out.println("Размер первого списка " + first.getSize());
        System.out.println("Размер второго списка " + second.getSize());
    }

    private static void printLists(MyList first, MyList second) {
        System.out.println("Первый список");
        print(first);
        System.out.println("Второй список");
        print(second);
    }

    private static void print(MyList myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
