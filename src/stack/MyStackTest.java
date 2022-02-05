package stack;

import queue.MyQueue;

public class MyStackTest {
    public static void main(String[] args) {


        String l;
        int i;
        MyStack<String> stack = new MyStack<>();
        stack.push("1");//push
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println("size = " + (i = stack.size()));

        System.out.println(" = " + (l = stack.peek()));


        stack.remove(3);
        System.out.println("stack to remove = " + stack.remove(0));

        System.out.println("size = " + (i = stack.size()));
        System.out.println("poll = " + (l = stack.poll()));
        System.out.println("peek = " + (l = stack.peek()));
        System.out.println("poll = " + ( l = stack.poll()));
        System.out.println("size = " + (i = stack.size()));

        stack.clear();
        System.out.println("size = " + (i = stack.size()));

    }
}