package day20collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();

        depo.add("Süt");
        depo.add("Et");
        depo.add("Yumurta");
        depo.add("Peynir");
        System.out.println(depo);
        System.out.println(depo.peek());
        System.out.println(depo);
        depo.clear();//Queue içini tamamen temizler
        System.out.println(depo);

        //System.out.println(depo.element());Exception
        System.out.println(depo.peek());//null

        Queue<String> wareHouse = new PriorityQueue<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);//[Egg, Milk, Meat, Orange, Tomatoes]

        Deque<String>d=new LinkedList<>();
        //Double ended que ==> iki uçlu kuyruk
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d);

    }
}
