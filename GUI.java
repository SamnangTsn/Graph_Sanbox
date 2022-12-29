import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	
	GraphLayout layout1;
	ButtonLayout layout2;
	
	public GUI(Graphs graph){
		
		this.setTitle("Graph_Sandbox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 700);
		this.setLayout(null);
		layout1 = new GraphLayout(graph);
		this.add(layout1);
		layout2 = new ButtonLayout();
		this.add(layout2);
		this.setVisible(true);
	}

}
