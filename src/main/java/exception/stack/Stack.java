package exception.stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Stack {

    private int top;
    private int[] elements;
    private int size;

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.elements = new int[size];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }


    public void push(int newElement) {
        try {
            elements[top + 1] = newElement;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack too small. Resizing.");
            int oldSize = this.size;
            this.size = oldSize + oldSize / 2;
            int[] oldElements = elements;
            this.elements = new int[size];
            for (int i = 0; i < oldSize; i++) {
                this.elements[i] = oldElements[i];
            }
            this.top = oldSize - 1;
            elements[top + 1] = newElement;
        }
        top++;

    }

    public void peak() {
        System.out.println(elements[top]);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        stack.push(7);
        stack.push(9);

        System.out.println(stack);



        stack.peak();


    }
}
