package queue;

public class MyQueueTest {
    public static void main(String[] args) {


        String l;
        int i;
        MyQueue<String> queue = new MyQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");

        queue.remove(2);

        System.out.println("queue to remove = " + queue.remove(1));

        System.out.println("queue size = " + (i = queue.size()));
        System.out.println("queue = poll" + (l = queue.poll()));
        System.out.println("queue = peek" + (l = queue.peek()));
        System.out.println("queue = poll" + ( l = queue.poll()));
        System.out.println("queue = size" + (i = queue.size()));

        queue.clear();
        System.out.println("queue = size" + (i = queue.size()));

    }
}