package arraylist;

public class MyArrayListTest {
        public static void main(String[] args) {
            MyArrayList<String> list = new MyArrayList<>();

            list.add("Igor");
            list.add("Marina");
            list.add("Ewa");
            list.add("Igor");
            list.add("Igor");
            list.add("Igor");
            list.add("Igor");
            list.add("Igor");
            list.add("Igor");


            list.remove(1);
            System.out.println(list.contains("Igor"));

            System.out.println("list = " + list);
            System.out.println("list.size() = " + list.size());
            System.out.println("list.get(1) = " + list.get(1));
            list.clear();
            System.out.println("list.size() = " + list.size());


        }
    }

