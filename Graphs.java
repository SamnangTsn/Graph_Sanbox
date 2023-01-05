import java.util.ArrayList;
import java.util.Random;

/**
 * Graph structure contains all the vertices or nodes.
 * @author Samnang_Thorn
 *
 */
public class Graphs{
	
	private ArrayList<Node> vertexList = new ArrayList<>();
	
	/**
	 * Constructor with random vertices.
	 * @param weighted if true it is weighted graph, otherwise un_weighted graph.
	 */
	public Graphs(boolean weighted, String size) {
		
		int collon;
		char row = 68; // ascii value of D

		if(size.equalsIgnoreCase("small")){
			collon = 4;
		}else if(size.equalsIgnoreCase("medium")){
			collon = 7;
		}else if(size.equalsIgnoreCase("large")){
			collon = 10;
		}else{
			throw new IllegalArgumentException("Invalid Input: Size!");
		}

		Node vertex;
		// row
		for(int r = 0; r < collon; r++){
			// collon
			for(int c = 0; c < collon; c++) {

				vertex = new Node(weighted, row, c + 1);
				vertexList.add(vertex);
			}
			row+=1;
		}
		constructConnection(weighted);
	}
	
	// helper method
	private void constructConnection(boolean weighted) {
		Random obj = new Random();
		int randomInt = obj.nextInt(10) + 1; // random weight's cost of the edges

		for(int y = 0; y < this.vertexList.size() - 1; y++){
			for(int x = 0; x < this.vertexList.size() - 1; x++){

				if(x != y){
					if((this.vertexList.get(y).getRow() - this.vertexList.get(x).getRow() <= 1) && (this.vertexList.get(y).getRow() - this.vertexList.get(x).getRow() >= -1)){
						if((this.vertexList.get(y).getCollon() - this.vertexList.get(x).getCollon() <= 1) && (this.vertexList.get(y).getCollon() - this.vertexList.get(x).getCollon()) >= -1){
							if(this.vertexList.get(y).getRow() == this.vertexList.get(x).getRow() || this.vertexList.get(y).getCollon() == this.vertexList.get(x).getCollon()){
								connect(this.vertexList.get(y), this.getVertexList().get(x), randomInt);
								randomInt = obj.nextInt(10) + 1;
							}
						}
					}
				}
			}
		}
	}
	
	// helper method
	private boolean connect(Node node1, Node node2, int cost) {
		if(node1.equals(null) || node2.equals(null) || node1.equals(node2)) {
			return false;
		}
		node1.addAdjacent(node2);
		node2.addAdjacent(node1); 
		if(cost != 0) {
			node1.addWeight(cost);
			node2.addWeight(cost);
		}
		return true;
	}
	
	public void printGraph() {
		System.out.println("Graph Vertices: \n");
		int y = 0;
		for(int x = 0; x < this.vertexList.size(); x++) {
			System.out.printf("| %3d | ", this.vertexList.get(x).getData().getData());
			if(y == 3) {
				y = 0;
				System.out.println("\n");
			}else {
				y++;
			}
		}
	}
	
	public void printGraphDetail() {
		System.out.println("Graph Data: \n");
		int y = 0;
		Node tempNode;
		for(int x = 0; x < this.vertexList.size(); x++) {
			tempNode = this.vertexList.get(x);
			System.out.printf(" | %3d < ", tempNode.getData().getData());
			for(int i = 0; i < 4; i++) {
				if(i >= tempNode.getAdjacencyList().size()){
					System.out.printf("%3d, ", 0);
				}else{
					System.out.printf("%3d, ", tempNode.getAdjacencyList().get(i).getData().getData());
				}
			}
			System.out.print(" > |");
			if(y == 3) {
				y = 0;
				System.out.println("\n");
			}else {
				y++;
			}
		}
	}
	
	public int getNumberOfVertices() {
		return this.vertexList.size();
	}

	public ArrayList<Node> getVertexList(){
		return this.vertexList;
	}
	
}

