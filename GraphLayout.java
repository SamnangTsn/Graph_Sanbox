import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphLayout extends JPanel{
	
	int x, y;
	Graphs graph;
	
	public GraphLayout(Graphs graph){
		//this.setPreferredSize(new Dimension(500, 500));
		this.graph = graph;
		this.setBounds(10, 10, 490, 490);
	}
	
	public void paint(Graphics g) {
		
		Graphics2D G = (Graphics2D) g;
		G.setPaint(Color.black);
		G.setStroke(new BasicStroke(2));
		
		// drawing vertex
		this.x = this.y = 0;
		for(int x = 0; x < this.graph.getNumberOfVertices(); x++) {
			G.drawOval(this.x, this.y, 25, 25);
			this.x += 60;
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
