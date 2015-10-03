/**
 * Seth Rait, srait@brandeis.edu
 */
public class Node<E> {
    public Node next;
    public E data;
    /**
     *Runtime: O(1)
     *creates a new empty node
     */
    public MyNode(){
        this(null);
    }
    /**
     *Runtime: O(1)
     * @param data creates a new node with data
     */
    public MyNode(E data){
        next = null;
        this.data=data;
    }
    /**
     *Runtime: O(1)
     * @return data of node
     */
    public E getData(){
        return this.data;
    }
    /**
     *Runtime: O(1)
     * @return next node
     */
    public Node getNext(){
        return this.next;
    }
    /**
     *Runtime: O(1)
     * @param data for this node
     */
    public void setData(E data){
        this.data=data;
    }
    /**
     *Runtime: O(1)
     * @param next node link
     */
    public void setNext(MyNode next){
        this.next=next;
    }
    /**
     *Runtime: O(1)
     * @return value of current node
     */
    public String toString(){
        return ""+data;
    }
}
