import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphLayout extends JPanel{
	
	private int x, y = 0;
	private Graphs graph;
	//private ArrayList<Node> sortedVerticesList = new ArrayList<>();
	
	public GraphLayout(Graphs graph){
		//this.setPreferredSize(new Dimension(500, 500));
		this.graph = graph;
		this.setBounds(10, 10, 480, 480);
	}
	
	public void paint(Graphics g) {
		
		Graphics2D G = (Graphics2D) g;
		G.setPaint(Color.black);
		G.setStroke(new BasicStroke(2));

		// drawing frame component

		char[] charArray = {1, 2, 3};
		G.drawChars(charArray, ALLBITS, ABORT, x, y);
		
		// drawing vertex
		
		
		for(int i = 0; i < 5; i++) {

			G.drawOval(this.x, this.y, 25, 25);
			this.x += 50;

			//int[] coordinate = this.getCenterCoordinate(this.x, this.y, 25, 25);
			//this.graph.getVertexList().get(i).setXandYCoordinate(coordinate[0], coordinate[1]);
		}
		
		// drawing edges
		
		
		
	}

	private int[] getCenterCoordinate(int xCoordinate, int yCoordinate, int weidth, int height){
		int[] xAndYCoordinate = new int[2];
		xAndYCoordinate[0] = (xCoordinate + weidth) / 2;
		xAndYCoordinate[1] = (yCoordinate + height) / 2;
		return xAndYCoordinate;
	
	
	}
}
