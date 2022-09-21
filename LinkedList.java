package linkedList;
/**
 * Generic form of LinkedList class
 * @author njohnson3, Zachary Cowan
 * @version 9/1/2022
 */
public class LinkedList<T> {
	
	Node<T> head;
	int length;
	Node<T> tail;
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	
	/**
	* Check if linked list is empty
	* @return True if linked list is empty
	*/
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	
	/**
	* Gets the head of the list
	* @return The head node of linked list
	*/
	public Node<T> getList()
	{
		return head;
	}
	
	/**
	* Gets the head of the list
	* @param aNode Node to add to list
	* @return The head node of linked list
	*/
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
	}
}