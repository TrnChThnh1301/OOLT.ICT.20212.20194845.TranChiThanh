package Package1;

import java.util.Scanner;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = itemsOrdered.length;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= 20) {
			System.out.println("The cart is almost full!\n");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added to cart!\n");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc, int index) {
		if(qtyOrdered < 1) {
			System.out.println("There is no disc o remove!\n");
		}
		else {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap vi tri muon xoa: ");
			index = input.nextInt();
			DigitalVideoDisc[] newArr = new DigitalVideoDisc[itemsOrdered.length - 1];
			for(int i = 0,j = 0; i < qtyOrdered; i++) {
				if(i != index) {
				newArr[j++] = itemsOrdered[i];
				}
			}
			input.close();
		}
		
	}
	public float totalCost() {
		float sum = 0;
		for(int i = 0 ; i < itemsOrdered.length; i++) {
			sum = sum + itemsOrdered[i].getCost();
		}
		return sum;
	}
}
