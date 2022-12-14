import java.util.LinkedList;
/**
 * Node or Vertex of the graph.
 * @author Samnang_Thorn
 *
 */
public class Node {

	private DataBag data;
	private LinkedList<Node> adjacencyList;
	
	// random constructor
	public Node() {
		
		this.data = new DataBag();
	}

	// customize constructor
	public Node(DataBag data) {
		this.data = data;
	}
	
	//getter methods
	
	 public DataBag getData() {
		 return this.data;
	 }
	 
	 public LinkedList<Node> getAdjacencyList(){
		 return this.adjacencyList;
	 }
	 
	 /**
	  * Add a new adjacent node to the adjacencyList.
	  * @param node to be add.
	  * @return true if node is not yet exist and been add. Otherwise false.
	  */
	 public boolean addAdjacent(Node node) {
		 if(node.equals(null)) {
			 return false;
		 }
		 for(Node n : adjacencyList) {
			 if(n.equals(node)) {
				 return false;
			 }
		 }
		 this.adjacencyList.add(node);
		 return true;
	 }
	 
	 /**
	  * Remove an adjacent node from the adjacencyList.
	  * @param node to be remove.
	  * @return true if node exist and been removed, otherwise false.
	  */
	 public boolean removeAdjacent(Node node) {
		 if(node.equals(null)) {
			 return false;
		 }
		 for(Node n : adjacencyList) {
			 if(n.equals(node)) {
				 adjacencyList.remove(n);
				 return true;
			 }
		 }
		 return false;
	 }
}
