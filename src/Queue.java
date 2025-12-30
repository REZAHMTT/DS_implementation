class Queue{
    private int[] array;
    private int front;
    private int rear;
    private int STRG;
    private int size;

    public Queue(int capacity){
        this.STRG = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int item){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%STRG;
        array[rear]=item;
        size++;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int removedItem = array[front];
        front = (front + 1) % STRG;
        size--;
        return removedItem;
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == STRG;
    }
}