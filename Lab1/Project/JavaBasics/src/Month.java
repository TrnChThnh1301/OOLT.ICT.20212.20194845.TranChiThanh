import java.util.Scanner;
public class Month {
	public static void main(String[] str) {
		Scanner in = new Scanner(System.in);
		
		int DayInMonth=0;
		String Month = "Unknown";
		
		System.out.print("Input a month: ");
		String month = in.nextLine();
		
		System.out.print("Input a year: ");
		int year = in.nextInt();
		
		if(month == "January"||month=="Jan."||month=="Jan"||month== "1") {
			DayInMonth = 31;
		}
		else if(month=="February"||month=="Feb."||month=="Feb"||month=="2") {
			if((year%4==0)) {
				if((year%100==0)&&(year%400!=0)) {
					DayInMonth =29;
				}
			}
			else DayInMonth = 28;
		}
		else if(month=="March"||month=="Mar."||month=="Mar"||month=="3") {
			DayInMonth = 31;
		}
		else if(month=="April"||month=="Apr."||month=="Apr"||month=="4") {
			DayInMonth = 30;
		}
		else if(month=="May"||month=="5") {
			DayInMonth = 31;
		}
		else if(month=="June"||month=="Jun"||month=="6") {
			DayInMonth = 30;
		}
		else if(month=="July"||month=="Jul"||month=="7") {
			DayInMonth = 31;
		}
		else if(month=="August"||month=="Aug."||month=="Aug"||month=="8") {
			DayInMonth = 31;
		}
		else if(month=="September"||month=="Sept."||month=="Sep"||month=="9") {
			DayInMonth = 30;
		}
		else if(month=="October"||month=="Oct."||month=="Oct"||month=="10") {
			DayInMonth = 31;
		}
		else if(month=="November"||month=="Nov."||month=="Nov"||month=="11") {
			DayInMonth = 30;
		}
		else if(month=="December"||month=="Dec."||month=="Dec"||month=="12") {
			DayInMonth = 31;
		}
		System.out.print(month + "/" + year + " has " + DayInMonth + " days\n");
	}

}