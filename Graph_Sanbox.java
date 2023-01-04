/**
 * 
 * @author Samnang_Thorn
 *
 */
public class Graph_Sanbox {

	public static void main(String[] args) {

		// Graph Sizes: Small (4(rows) x 4(collons)), Medium (7 x 7), Large (10 x 10)

		Graphs graph = new Graphs(true, "small");
		graph.printGraph();
		graph.printGraphDetail();
		
		new GUI(graph);

		
	}

}
