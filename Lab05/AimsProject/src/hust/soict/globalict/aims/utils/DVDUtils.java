package hust.soict.globalict.aims.utils;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class DVDUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(dvd1.getCost() > dvd2.getCost()) return 1;
		else if(dvd1.getCost() < dvd2.getCost()) return -1;
		else return 0;
	}
	
	public static int compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(dvd1.getTitle().compareTo(dvd2.getTitle()) == 1) return 1;
		else return -1;
	}
	
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] dvdList) {
		for(int i = 0 ; i < dvdList.length - 1; i++) {
			for(int j = i + 1 ; j < dvdList.length; j++) {
				if(dvdList[i].getCost() < dvdList[j].getCost()) {
					DigitalVideoDisc tmp = dvdList[i];
					dvdList[i] = dvdList[j];
					dvdList[j] = tmp;
				}
			}
		}
		return dvdList;
	}
	
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] dvdList) {
		for(int i = 0 ; i < dvdList.length - 1; i++) {
			for(int j = i + 1 ; j < dvdList.length; j++) {
				if(dvdList[i].getTitle().compareTo(dvdList[j].getTitle()) > 0) {
					DigitalVideoDisc tmp = dvdList[i];
					dvdList[i] = dvdList[j];
					dvdList[j] = tmp;
				}
			}
		}
		return dvdList;
	}

}
