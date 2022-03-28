package org.academiadecodigo.containers;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> t = new LinkedList<>();
        t.add("Listen");
        t.add("Talk");

        for (String s : t) {
            System.out.println(s);

        }
        t.remove("Talk");
        for (String s : t) {
            System.out.println(s);

        }
            LinkedList<Integer> integers = new LinkedList<>();
            integers.add(1);
            integers.add(2);

            for (Integer s : integers) {
                System.out.println(s);
            }

        }

    }

