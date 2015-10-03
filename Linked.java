/**
 * Seth Rait, srait@brandeis.edu
 */
public class CList<E> {
    private Node<E> current;
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     *Runtime: O(1)
     * adds new nodes to the List
     * @param elem the value of the new node
     */
    public void add(E elem){    //O(1)
        Node<E> newNode = new Node<>(elem);
        if(head==null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
        tail.next=head;
    }

    /**
     *Runtime: O(1)
     * Removes an element from the front (head) of the list
     */
    public E removeFirst(){     //O(1)
        E temp=null;
        if(head!=null) {
            temp =(E) head.getData();
            head = head.next;
            current=current.next;
            size--;
        }
        tail.next=head;
        return temp;
    }

    /**
     *Runtime: O(n)
     * Removes an element from the back (tail) of the list
     */
    public E removeLast(){  //O(n)
        E temp=null;
        if(head!=null){
            while(current.next.next!=null)
                current=current.next;
            temp=(E) current.next.getData();
            tail=current;
            current=head;
        }
        size--;
        tail.next=head;
        return temp;
    }

    /**
     *Runtime: O(1)
     * @return boolean true if empty
     */
    public boolean isEmpty(){   //O(1)
        return(head==null);
    }

    /**
     *Runtime: O(1)
     * @return int size of list
     */
    public int getSize(){   //O(1)
        return size;
    }

    /**
     *Runtime: O(1)
     * sets all pointers to null, clearing the list
     */
    public void clear(){
        tail=head=current=null;
    }

    /**
     *Runtime: O(1)
     * @retrun value of head pointer
     */
    public E getHead(){
        return head.getData();
    }

    /**
     *Runtime: O(n)
     * increment current until it is at the desired position
     * @param position the desired number of moves left or right of current
     * @return value of current pointer
     */
    public E toPosition(int position) {
        if (position >= 0) {    //if pos is positive
            for (int i = 0; i < position; i++)
                current = current.next;
            return current.getData();
        }
        else    //if pos is negative
            for (int i = 0; i < size+position; i++)
                current = current.next;
        return current.getData();
    }

    /**
     *Runtime: O(1)
     * @param data the new value of current data
     */
    public void changeData(E data){
        current.setData(data);
    }

    /**
     *Runtime: O(n)
     * process through list one by one, printing out each elem as it is passed
     */
    public String toString(){   //O(n)
        current=head;
        String s="[";
        while(current!=tail){
            s+=current+", ";
            current=current.next;
        }
        s+=current;
        current=head;
        return s+"]";
    }
}