import java.util.*;
class A02{
	public static void main(String[] args){
		System.out.print("월을 입력하세요 ");
		int month = input();
		System.out.print("일을 입력하세요");
		int day = input();
		int day_count = month(month) + day;
		System.out.printf("이 날짜는 1년 중 %d 번째 날에 해당됩니다..\n", day_count);
		
	}

	public static double input(){
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}

	public static int month(int month){
		int month_count = 30 * (month - 1);
		if(month = 1 || month = 3 || month = 5 || month = 7 || month = 8 || month = 10) month_count++;
		else if (month = 2) month_count -= 2;
		return month_count;
	}
}
