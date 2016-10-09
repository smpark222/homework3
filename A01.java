import java.util.*;
class A01{
	public static void main(String[] args){
		int num1, num2, num3;
		int max_num, min_num;
		System.out.print("첫번째 숫자를 입력하세요 ");
		num1 = input();
		System.out.print("두번째 숫자를 입력하세요 ");
		num2 = input();
		System.out.print("세번째 숫자를 입력하세요 ");
		num3 = input();
		max(num1, num2, num3);
		min(num1, num2, num3);
	}

	public static int input(){
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static void max(int num1, int num2, int num3){
		int max_num;
		if(num1 > num2) max_num = num1;
		else max_num = num2;
		if(max_num < num3) max_num = num3;
		System.out.printf("가장 큰 수는 %d이고, ", max_num);
	}
	public static void min(int num1, int num2, int num3){
		int min_num;
		if(num1 < num2) min_num = num1;
		else min_num = num2;
		if(min_num > num3) min_num = num3;
		System.out.printf("가장 작은 수는 %d입니다.", min_num);
	}
}
