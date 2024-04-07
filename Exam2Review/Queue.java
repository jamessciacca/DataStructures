package Exam2Review;

public class Queue {
    public static void main(String[] args) {

        QueueArray queue = new QueueArray(10);

        // add integer to the queue

        try {

            queue.enqueue(5);

            queue.enqueue(3);

            queue.enqueue(8);

            queue.enqueue(2);

            queue.enqueue(10);

            queue.enqueue(4);

            queue.enqueue(6);

            queue.findAndRemoveMinMax();

            // print what remains

            System.out.println("Remainning elements ");

            while (!queue.isEmpty()) {

                System.out.println(queue.dequeue());

            }

        } catch (QueueOverflowException | QueueUnderflowException e) {

            e.printStackTrace();

        }

    }

}

class QueueArray {

    private int maxSize;

    private int[] queueArray;

    private int front;

    private int rear;

    private int currentSize;

    public QueueArray(int size) {

        maxSize = size;

        queueArray = new int[maxSize];

        front = 0;

        rear = -1;

        currentSize = 0;

    }

    public boolean isEmpty() {

        return currentSize == 0;

    }

    public boolean isFull() {

        return currentSize == maxSize;

    }

    public int front() throws QueueUnderflowException {

        if (isEmpty()) {

            throw new QueueUnderflowException("Queue is empty");

        }

        return queueArray[front];

    }

    public int back() throws QueueUnderflowException {

        if (isEmpty()) {

            throw new QueueUnderflowException("Queue is empty");

        }

        return queueArray[rear];

    }

    public void enqueue(int item) throws QueueOverflowException {

        if (isFull()) {

            throw new QueueOverflowException("Queue is full");

        }

        rear = (rear + 1) % maxSize;

        queueArray[rear] = item;

        currentSize++;

    }

    public int dequeue() throws QueueUnderflowException {

        if (isEmpty()) {

            throw new QueueUnderflowException("Queue is full");

        }

        int removedItem = queueArray[front];

        front = (front + 1) % maxSize;

        currentSize--;

        return removedItem;

    }

    public void findAndRemoveMinMax() throws QueueUnderflowException {

        if (!isEmpty()) {

            int minVal = Integer.MAX_VALUE;

            int maxVal = Integer.MIN_VALUE;

            // find min and max

            for (int i = 0; i < currentSize; i++) {

                int item = queueArray[(front + i) % maxSize];

                minVal = Math.min(minVal, item);

                maxVal = Math.max(maxVal, item);

            }

            // remove min or max value

            removeValue(minVal);

            removeValue(maxVal);

            System.out.println("Min: " + minVal);

            System.out.println("Max: " + maxVal);

        } else {

            throw new QueueUnderflowException("Queue is empty");

        }

    }

    private void removeValue(int value) {

        int indexToRemove = -1;

        for (int i = 0; i < currentSize; i++) {

            if (queueArray[(front + i) % maxSize] == value) {

                indexToRemove = (front + i) % maxSize;

                break;

            }

        }

        if (indexToRemove != -1) {

            for (int i = indexToRemove; i < currentSize - 1; i++) {

                queueArray[i] = queueArray[i + 1];

            }

            rear = (rear - 1 + maxSize) & maxSize;

            currentSize--;

        }

    }

}

class QueueOverflowException extends Exception {

    public QueueOverflowException(String message) {

        super(message);

    }

}

class QueueUnderflowException extends Exception {

    public QueueUnderflowException(String message) {

        super(message);

    }
}
