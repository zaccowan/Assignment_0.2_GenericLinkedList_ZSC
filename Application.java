package linkedList;

public class Application {

	public static void main(String[] args) {
		//
		//
		//Integer Testing
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		Node<Integer> aNode=new Node<Integer>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(2);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(3);
		myList.addNode(aNode);

		Node<Integer> tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		//
		//
		//String Testing
		LinkedList<String> myStrings = new LinkedList<String>();
		
		Node<String> bNode=new Node<String>();
		bNode.setData("Hello");
		myStrings.addNode(bNode);
		bNode = new Node<String>();
		bNode.setData("World!");
		myStrings.addNode(bNode);
		bNode = new Node<String>();
		bNode.setData("Really long sentence for no other reason besides \"because\".");
		myStrings.addNode(bNode);

		Node<String> tempnodeStrings = myStrings.getList();
		do 
		{
			System.out.println(tempnodeStrings.data);
			tempnodeStrings=tempnodeStrings.nextNode;
		} while (tempnodeStrings!=null);

	}
}
