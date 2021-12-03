package Lesson014_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));

//        // 3 person <-- 2 person <-- 4 person <-- 1 person
//
//        people.remove();
////        for (Person person : people)
////            System.out.println(person);
//
//        System.out.println(people.remove());
//        System.out.println(people.peek());
//        System.out.println(people);

            }
}
class Person{
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}