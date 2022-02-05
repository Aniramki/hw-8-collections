package arraylist;

//import java.util.ArrayList;

import java.util.Objects;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;

    private Object[] data;
    private int index;

    public MyArrayList() {
        data = new Object[INIT_SIZE];
    }

    public void add(T value) {
        resizeIfNeed();

        data[index] = value;
        index++;
    }

    private void resizeIfNeed() {
        if (index == data.length) {

            System.out.println("Resize happened, index: " + index + ", data.length: " + data.length);
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public T get(int i) {
        return (T) data[i];
    }

    public int size() {
        return index;
    }

    //remove(int index)
    //isEmpty()
    //contains(item)

    public void remove(int indexToRemove) {
            int newSize = data.length - 1;
            Object[] newData = new Object[newSize];

            System.arraycopy(data, 0, newData, 0, indexToRemove);

        int amountElementAfterIndex = data.length - indexToRemove - 1;
            System.arraycopy(data, indexToRemove + 1, newData, indexToRemove, amountElementAfterIndex);

        data = newData;
        }
    public boolean contains(Object o) {


            for (int i = 0; i < data.length; i++) {
                if (data[i] == o) {
                    return true;
                }
            }

        return false;
    }
    public void clear() {


        for (int i = 0; i < data.length-1; i++) {
            data[i] = null;
            }
        index = 0;
        }



    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index-1; i++) {
            result.add(data[i].toString());
        }

        return "[" + result + "]";
    }
}
