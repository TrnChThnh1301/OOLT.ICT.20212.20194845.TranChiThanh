package Package1;

import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = itemsOrdered.length;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= 20) {
			System.out.println("The cart is almost full!\n");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc " + disc.getTitle() + " has been added to cart!\n");
		}
		//System.out.println("There are " + qtyOrdered + " disc in the cart.\n");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < 1) {
			System.out.println("There is no disc to remove!\n");
		}
		else {
			DigitalVideoDisc[] newArr = new DigitalVideoDisc[itemsOrdered.length - 1];
			qtyOrdered -= 1;
			System.out.println("The disc " + disc.getTitle() + " has been removed from the cart!\n");
			System.out.println("There are " + qtyOrdered + " disc left on the cart:");
			for(int i = 0,j = 0; i < qtyOrdered; i++) {
				if(itemsOrdered[i] != disc) {
				newArr[j++] = itemsOrdered[i];
				System.out.println(itemsOrdered[i].getTitle());
				}
			}
		}
	}
	public float totalCost() {
		float sum = 0f;
		for(int i = 0 ; i < qtyOrdered ; i++) {
			sum = sum + itemsOrdered[i].getCost();
		}
		return sum;
	}
}
