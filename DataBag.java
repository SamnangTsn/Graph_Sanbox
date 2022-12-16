import java.util.Random;

/**
 * DataBag that generate random data object.
 * @author Samnang_Thorn
 *
 */
public class DataBag {

	private int data;
	
	/**
	 * Constructor.
	 */
	public DataBag() {
		Random obj = new Random();
		this.data = obj.nextInt(1000);
	}
	
	/**
	 * Getter method.
	 * @return data contain within the object.
	 */
	public int getData() {
		return this.data;
	}	
}
