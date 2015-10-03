/**
 Seth Rait, srait@brandeis.edu
 */
import java.util.*;
public class Stack<E>{

    private List<E> stack;

    /**
     *Runtime: O(1)
     * create new empty MyList
     */
    public Stack(){	//O(1)
        stack = new List<>();
    }

    /**
     *Runtime: O(1)
     * @return boolean true if list has no elems
     */
    public boolean isEmpty(){	//O(1)
        return stack.isEmpty();
    }

    /**
     *Runtime: O(1)
     *@param element value to be added to list
     */
    public void push(E element){
        stack.add(element);
    }

    /**
     *Runtime: O(1)
     *@return element which is removed
     */
    public E pop(){
        if(isEmpty())
            throw new EmptyStackException();
        return stack.removeLast();
    }
    /**
     *Runtime: O(1)
     *removes all elements from stack
     */
    public void clear(){
        stack.clear();
    }
}