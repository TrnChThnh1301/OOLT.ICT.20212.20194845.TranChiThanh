package Package1;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc JungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc CinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(JungleDVD, CinderellaDVD);
		System.out.println("Jungle DVD title: " + JungleDVD.getTitle());
		System.out.println("Cinderella DVD title " + CinderellaDVD.getTitle());
		
		changeTitle(JungleDVD, CinderellaDVD.getTitle());
		System.out.println("Jungle DVD title: " + JungleDVD.getTitle());
	}

	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
