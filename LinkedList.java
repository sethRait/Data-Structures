/**
 * Seth Rait, srait@brandeis.edu
 */
public class LinkedList<E> {
    private Node current;
    private Node head;
    private Node tail;
    private int size;

    /**
     *Runtime: O(1)
     * adds new nodes to the List
     * @param elem the value of the new node
     */
    public void add(E elem){
        Node<E> newNode = new Node<>(elem);
        if(head==null) {    //if list is empty
            head = newNode;
            tail = newNode;
            current = newNode;
        }
        else{   //if list is not empty
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    /**
     *Runtime: O(1)
     * Removes an element from the front (head) of the list
     */
    public E removeFirst(){
        E temp=null;
        if(head!=null) {
            temp =(E) head.getData();
            head = head.next;
            current=current.next;
        size--;
        }
        return temp;
    }

    /**
     *Runtime: O(n)
     * Removes an element from the back (tail) of the list
     */
    public E removeLast(){
        E temp=null;
        current=head;
        if(head!=null){     //list is not empty
            if(current.getNext()!=null) {   //current is not the last element
                while (current.next.next != null)
                    current = current.next; //set current to the second last element
                temp = (E) current.next.getData();
                tail = current;
                current = head;
                current.next=null;
            }else{  //current is the last element
                temp=(E)current.getData();
                tail=head=current=null;
            }
        }
        size--;
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
    public int getSize(){
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
     *Runtime: O(n)
     * process through list one by one, printing out each elem as it is passed
     */
    public String toString(){
        String s="[";
        while(current!=tail){
            s+=current+", ";
            current=current.next;   //increment current
        }
        s+=current; //for fencepost correcting
        current=head;
        return s+"]";
    }
}