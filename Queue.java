import java.util.Scanner;


public class Queue {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public Queue() {
        maxSize = 100;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }


    public void insert() {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter some number: ");
        int elem = scanner.nextInt();

        if (rear == maxSize - 1)
        {  // циклический перенос

            rear = -1;
        }

        queue[++rear] = elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди

    }
    public int remove() {
        int temp = queue[front++]; // получаем первый элемент из очереди

        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public int getFront() {
        return queue[front];
    }

    public int getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }
}