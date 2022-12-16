import java.util.LinkedList;
/**
 * Node or Vertex of the graph.
 * @author Samnang_Thorn
 *
 */
public class Node {

	private DataBag data;
	private boolean weighted = false;
	private LinkedList<Node> adjacencyList = null;
	private LinkedList<Integer> weightList = null;
	
	/**
	 * Automated constructor with random data.
	 * @param weighted if true Node support weighted graph, false Node do not support weighted graph.
	 */
	public Node(boolean weighted) {
		if(weighted) {
			this.data = new DataBag();
			this.weighted = true;
			this.adjacencyList = new LinkedList<>();
			this.weightList = new LinkedList<>();
		}else {
			this.data = new DataBag();
			this.adjacencyList = new LinkedList<>();
		}
	}
	
	/**
	 * Customize constructor with input data.
	 * @param weighted if true Node support weighted graph, false Node do not support weighted graph.
	 * @param data of the vertex.
	 */
	public Node(boolean weighted, DataBag data) {
		if(weighted) {
			this.data = data;
			this.weighted = true;
			this.adjacencyList = new LinkedList<>();
			this.weightList = new LinkedList<>();
		}else {
			this.data = data;
			this.adjacencyList = new LinkedList<>();
		}
	}
	
	/**
	 * Getter method.
	 * @return data of the node or vertex.
	 */
	 public DataBag getData() {
		 return this.data;
	 }
	 
	 /**
	  * Getter method.
	  * @return list of the adjacent node or vertex.
	  */
	 public LinkedList<Node> getAdjacencyList(){
		 return this.adjacencyList;
	 }
	 
	 /**
	  * Getter method.
	  * @return list of the weight/cost of the connection edge.
	  */
	 public LinkedList<Integer> getWeightedList(){
		 return this.weightList;
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
	 
	 /**
	  * Add weight to the weight list.
	  * @param cost of the edge or connection to be add.
	  */
	 public void addWeight(int cost) {
		 this.weightList.add(cost);
	 }
}
