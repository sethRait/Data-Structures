import java.util.EmptyStackException;

/**
 * Seth Rait, srait@brandeis.edu
 */
public class Queue<E> {
    private E[] queue;
    private int front;
    private int rear;
    private int size;
    private final int LENGTH=10;
    private int totalAdd;   //number of elems added total

    /**
     *Runtime: O(1)
     * create array of type E and size LENGTH
     */
    public MyQueue(){   //O(1)
        queue = (E[]) new Object[LENGTH];
    }

    /**
     *Runtime: O(1)
     * add an element to the queue
     * @param elem the value to be added
     */
    public void enqueue(E elem){
        if(size==LENGTH)    //if queue is full
            throw new StackOverflowError("Too many elements!");
        queue[rear]=elem;   //add elem at rear
        rear=(rear+1)%LENGTH;   //move rear (circular if rear+1>LENGTH)
        size++;
        totalAdd++;
    }

    /**
     *Runtime: O(1)
     * remove an element from the queue
     * @return removed elem
     */
    public E dequeue(){ //O(1)
        if(size==0) //empty queue
            throw new EmptyStackException();
        E elem = queue[front];  //get value to be removed
        front=(front+1)%LENGTH; //move front (circular if front + 1>LENGTH)
        size--;
        return elem;
    }

    /**
     *Runtime: O(1)
     * @return boolan true if size is 0
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     *Runtime: O(1)
     * @return size of queue
     */
    public int getSize(){
        return size;
    }

    /**
     *Runtime: O(1)
     * @return int number of elems added
     */
    public int getTotalAdd(){
        return totalAdd;
    }
}
