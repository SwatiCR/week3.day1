package week3.day1;

public class IPhone implements MobileInterface{
	public void sendSMS(){
		System.out.println("phone sent sms");
	}
	
	public void dialNumber(int number){
		System.out.println("get number to dial");
		int num= number;
		System.out.println("number dialed "+num);
	}
	
	public void switchOn()
	{
		System.out.println("IPhone switched on");
	}
	

}
