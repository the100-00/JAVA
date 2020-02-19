
public class Date {
	int year;
	int month;
	int day;
	
	Date(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	
	public void print1(){
		System.out.println(year+"."+month+"."+day);
	}
	
	public void print2(){
		String sMonth = "";
		
		switch(month){
		case 1:
			sMonth = "January";
		case 2:
			sMonth = "Faburary";
		case 3:
			sMonth = "March";
		case 4:
			sMonth = "April";
		case 5:
			sMonth = "May";
		case 6:
			sMonth = "June";
		case 7:
			sMonth = "July";
		case 8:
			sMonth = "August";
		case 9:
			sMonth = "September";
		case 10:
			sMonth = "October";
		case 11:
			sMonth = "November";
		case 12:
			sMonth = "December";
		default:
			break;
		}
		
		System.out.println(sMonth+" "+day+","+year);
	}
}
