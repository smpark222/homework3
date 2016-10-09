import java.util.*;
class A03{
	public static void main(String[] args){
		System.out.print("월을 입력하세요 ");
		int month = input();
		System.out.print("일을 입력하세요 ");
		int day = input();
		int day_count = month(month) + day;
		if(day_count <= 365) System.out.printf("이 날짜는 1년 중 %d 번째 날에 해당됩니다.\n", day_count);
		else System.out.println("잘못 입력하셨습니다.");
	}

	public static int input(){
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static int month(int month){
		int month_count = 0;
		for(int i = 1; i < month; i++){
			month_count += 30;
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) month_count++;
			else if (i == 2) month_count -= 2;
		}
		return month_count;
	}
}
