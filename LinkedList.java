package linkedList;

public class LinkedList {
private Node root;
private int size;

public LinkedList(){
	size = 0;
}

public void addFirst(Object obj){
	Node n = new Node();
	n.obj = obj;
	if (root != null){
		n.ref = root;
	}
	root = n;
	size++;
}

public void addLast(Object obj){
	Node n = new Node();
	n.obj = obj;
	if (root == null){
		root = n;
	} else {
		Node last = root;
		Node cp = root;
		while (cp.ref != null){
			last = cp;
			cp = cp.ref;
		}
		last.ref = n;
	} size++;
}

public void addAfter(Object obj, Object previous){
	
}

public int getSize(){
	return size;
}

private class Node {
	Object obj;
	Node ref;
}

}
