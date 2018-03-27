package classes;

import interfaces.Stack;
/**
 * @author pedroirivera-vega
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class SLLStack<E> implements Stack<E>
{   
	// SNode is a public class defined elsewhere. No 
	// need to have it as a private class in this case. 
	private SNode<E> top;   
	private int size; 
	
	public SLLStack() {
		top = null; 
		size = 0; 
	}
	
	public E pop() {
		if (isEmpty())
			return null; 
		
		SNode ntr = top;
		E etr = (E) ntr.getElement();
		top = top.getNext();
		size--;
		ntr.clean(); 
		
		return etr;
	}

	public void push(E e) {
		SNode <E> snuevo = new SNode<E>(e, top);
		top = snuevo;
		size++;
		
	}

	public E top() {
		if (isEmpty())
			return null;  
		return top.getElement();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}


	// The following two methods are just for testing and grading....
    public void showReverse() { 
	    if (size == 0)
		   System.out.println("Stack is empty."); 
		else
		   recSR(top);
    }
    private void recSR(SNode<E> f) { 
		if (f != null) { 
		   recSR(f.getNext()); 
		   System.out.println(f.getElement()); 
	     } 
    } 
 
}
