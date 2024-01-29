package Queues;

import java.util.Queue;
import java.util.LinkedList;

public class QueueAdt {
    public static void main(String[] args) {
        MovieQueue q = new MovieQueue();
        // join the line method
        q.joinTheLine("Jhon");
        q.joinTheLine("Bob");
        q.joinTheLine("Mike");
        // line size method
        System.out.println("Current line size " + q.getTheLineSize());
        // leave the line method
        q.leaveTheLine();
        // line size method
        System.out.println("Current line size " + q.getTheLineSize());
    }
}

class MovieQueue implements MovieQueueADT {
    private Queue<String> line;

    public MovieQueue() {
        this.line = new LinkedList<>();
    }

    @Override
    public void joinTheLine(String person) {
        line.offer(person);
        System.out.println("Person join the line ");
    }

    @Override
    public void leaveTheLine() {
        if (!line.isEmpty()) {
            String person = line.poll();
            System.out.println("Person leave the line");
        } else {
            System.out.println("The line is already empty");
        }
    }

    @Override
    public int getTheLineSize() {
        return line.size();
    }
}

interface MovieQueueADT {
    void joinTheLine(String person);

    void leaveTheLine();

    int getTheLineSize();
}
