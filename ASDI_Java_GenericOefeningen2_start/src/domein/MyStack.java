package domein;

import java.io.Serializable;

public class MyStack <T extends Serializable> implements Serializable{


	private static final long serialVersionUID = 1L;
	private MyListIterable<T> list;

    public MyStack() {
        this("Stack");
    }

    public MyStack(String name) {
        list = new MyListIterable<>(name);
    }

    public void push(T data) {
        list.insertAtFront(data);
    }

    public T pop() {
        return list.removeFromFront();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
