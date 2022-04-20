package Package1;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		anOrder.qtyOrdered = 0;
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		
		//DigitalVideoDisc dvdList[] = {dvd1, dvd2, dvd3};
		//anOrder.addDigitalVideoDisc(dvdList);
		//Add a list of DVD to cart
		
		anOrder.addDigitalVideoDisc(dvd1, dvd2);
		//Add two DVDs to cart
		
		System.out.println("Total cost is " + anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd3);
	}

}
