import java.util.Random;

public class DataBag {

	private int data;
	
	//constructor
	public DataBag() {
		Random obj = new Random();
		this.data = obj.nextInt(1000);
	}
	
	//getter
	public int getData() {
		return this.data;
	}
	
	
}
