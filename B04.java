import java.util.*;
public class B04 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.print("연봉을 입력 : ");
		
		int money = input();
		double result = tax(money);
		
		System.out.printf("당신의 소득세는 %.0f원입니다.", result);
	}
	
	public static int input(){
		Scanner num = new Scanner(System.in);
		int money =  num.nextInt();
		
		return money;
	}
	
	public static double tax(int money){
		double tax;
		if(money < 10000000) tax = money * 0.095;
		else if(money < 40000000) tax = money * 0.19;
		else if(money < 80000000) tax = money * 0.28;
		else tax = money * 0.37;
		
		return tax;
	}
}
