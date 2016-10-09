import java.util.*;
class A02{
	public static void main(String[] args){
		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. ");
		double m2_area = input();
		double pyung_area = m2_area / 3.305;
		System.out.printf("아파트의 평형은 %.1f 입니다.", pyung_area);
	}

	public static double input(){
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}

}
