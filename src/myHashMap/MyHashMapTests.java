package myHashMap;

public class MyHashMapTests {
    public static void main(String[] args)
    {
        MyHashMap<Integer, String> hashMap = new MyHashMap<Integer, String>();
        String l;
        int i;
        hashMap.put(1, "1111");
        hashMap.put(2, "2222");
        hashMap.put(3, "3");
        hashMap.put(4, "4");
        hashMap.put(5, "5");
        System.out.println("1 size = " + hashMap.getSize());

        hashMap.put(1, "1");
        hashMap.put(2, "2");
        System.out.println("2-" + hashMap.get(2));
        hashMap.remove(2);
        hashMap.remove(2);
        System.out.println("3-" + hashMap.get(2));

        i = hashMap.getSize();
        System.out.println("4 size = " + i);

        l = hashMap.get(6);
        System.out.println("5-" + l);

        l = hashMap.get(1);
        System.out.println("6-" + l);


        hashMap.clear();
        System.out.println("7-" + hashMap.get(1));
        System.out.println("8 size = " + hashMap.getSize());

    }
}
