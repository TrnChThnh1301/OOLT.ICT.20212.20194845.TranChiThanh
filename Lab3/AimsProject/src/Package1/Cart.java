package Package1;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = itemsOrdered.length();
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(itemsOrdered.length < 20) {
			new disc;
			println('The disc has been added!\n');
		}
		else {
			printfln('The cart is almost full!\n');
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
	}
	public float totalCost() {
		for(int i = 0 ; i < itemsOrdered.length(); i ++)
	}
}
