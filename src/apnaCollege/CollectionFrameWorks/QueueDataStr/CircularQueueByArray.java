package apnaCollege.CollectionFrameWorks.QueueDataStr;

public class CircularQueueByArray {
    static class CircularQueue {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        public CircularQueue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }

            if (front == -1) {
                front++;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front+1) % size;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
    }
}
