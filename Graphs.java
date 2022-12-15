import java.util.ArrayList;
import java.util.Random;

public class Graphs{
	
	ArrayList<Node> vertexList = new ArrayList<>();
	
	/**
	 * Constructor with random vertices.
	 * @param weighted if true it is weighted graph, otherwise un_weighted graph.
	 */
	public Graphs(boolean weighted) {
		
		Node vertex;
		for(int x = 0; x < 20; x++) {
			vertex = new Node(weighted);
			vertexList.add(vertex);
		}
		constructConnection(weighted);
	}
	
	// helper method
	private boolean constructConnection(boolean weighted) {
		Random obj = new Random();
		int randomInt = obj.nextInt(4) + 1;
		for(int x = 0; x < this.vertexList.size(); x+= randomInt) {
			connect(this.vertexList.get(x), this.vertexList.get(x), obj.nextInt(99) + 1);
		}
		return true;
	}
	
	// helper method
	private boolean connect(Node node1, Node node2, int cost) {
		if(node1.equals(null) || node2.equals(null) || node1.equals(node2)) {
			return false;
		}
		if(cost != 0 && node1.addAdjacent(node2) && node2.addAdjacent(node1)) {
			node1.addWeight(cost);
			node2.addWeight(cost);
		}
		return true;
	}
	
}
