package DSA;

import java.util.Scanner;

public class ll {
    Node head;
    private int size;

    ll() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        } else {
            size--;
            head = head.next;
        }
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("The link is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Printing Size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addfirst("a");
        list.addfirst("is");
        list.addLast("list");
        list.addfirst("this");

        ll varun = new ll();
        varun.addLast("Singhal");
        varun.addfirst("Varun");
        varun.addLast("is learning programming");
        varun.addfirst("varun");
        varun.deleteFirst();
        varun.printList();
        varun.deleteLast();
        varun.printList();
        System.out.println(varun.getSize());

        ll homework = new ll();
        homework.addLast("1");
        homework.addLast("5");
        homework.addLast("7");
        homework.addLast("3");
        homework.addLast("8");
        homework.addLast("2");
        homework.addLast("3");

    }
}
