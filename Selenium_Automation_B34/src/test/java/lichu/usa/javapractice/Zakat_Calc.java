package lichu.usa.javapractice;

public class Zakat_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double income = 18.2;     //salary in millions
		int spon = 16;			  //endorsements 
		int bonus = 25;           // bonuses
		double asset = 91.56;	  //cash at home + bank accounts + assets
		double gold = 1.65;      //gold 
		double silver = 0.56;     //silver 
		double total = income+spon+bonus+asset+gold+silver; //total assets
		double liability = 20.58;                           //total liabilities 
		double z = 0.025; 
		
		double z2 = total-liability; 					   //total zakatable income 
		double zakat = z2*z; 								   //total zakat due 
		
		String TotalAsset = "Mo Salah's total assets = "; 
		String Liab = "His total liabilities = "; 
		String Zakat = "Mo Salah's Zakat for 2023 = "; 
		String money = "$"; 
		String m = " million"; 
		
		
		System.out.println(TotalAsset+money+total+m);
		System.out.println(Liab+money+liability+m);
		System.out.println(Zakat+money+zakat+m); 
		
		
		
	}

}
