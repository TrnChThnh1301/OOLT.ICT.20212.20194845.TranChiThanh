package Package1;
import java.time.LocalDate;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private LocalDate dateAdded;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded = LocalDate.now();
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.dateAdded = LocalDate.now();
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return String.format("[%4s] - [%4s] - [%4s] - [%1s] : [%3s]$", title, category, director, length, cost);
	}
	public String returnByFormat() {
		return String.format("[%10s] - [%10s] - [%10s] - [%5s] : [%5s]$", title, category, director, length, cost);
	}
}
