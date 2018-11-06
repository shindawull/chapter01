package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 1;
		int days = 0;
		
		if(month == 1|| month == 3||month == 5|| month==7|| month == 8||month==10||month == 12) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		}  else if (month == 4||month == 6||month == 11) {
			
		}
		System.out.println(month + "월은"+days+"입니다.");
	
		switch(month) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : {
			days = 31;
			break;
			}
		case 2 :{
			days = 28;
			break;
		}
		
		case 4 :
		case 6 :
		case 9 :
		case 11 :{
			days = 30;
			break;
			}
		
		
		}	
	}
}
