package core.collections;

import java.util.LinkedList;

public class RPAtask {
    private int position;

    private LinkedList<Integer> integerLinkedList = new LinkedList<>();

    public RPAtask(int n, int position) {
        this.position = position;
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(i);
        }
    }

    public void jumpLeft() {
        integerLinkedList.remove(position);
        position = position - 2;
    }

    public void jumpRight() {
        integerLinkedList.remove(position);
        position = position + 1;
    }

    public int position() {
        return position;
    }

    public static void main(String[] args) {
        RPAtask rpAtask = new RPAtask(6, 3);
        System.out.println(rpAtask.position());

        rpAtask.jumpLeft();
        System.out.println(rpAtask.position());

        rpAtask.jumpRight();
        System.out.println(rpAtask.position());

    }
}
