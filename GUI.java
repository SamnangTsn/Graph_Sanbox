import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	
	GraphLayout layout1;
	
	public GUI(){
		
		this.setTitle("Graph_Sandbox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 700);
		layout1 = new GraphLayout();
		this.add(layout1);
		this.setVisible(true);
	}

}
