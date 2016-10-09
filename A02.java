import java.util.*;
class A02{
	public static void main(String[] args){
		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. ");
		double m2_area = input();
		double pyung_area = m2_area / 3.305;
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", pyung_area);
		result(pyung_area);
	}

	public static double input(){
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}

	public static void result(double area){
		if(area < 15) System.out.print("소형 ");
		else if(area < 30) System.out.print("중소형 ");
		else if(area < 50) System.out.print("중형 ");
		else System.out.print("대형 ");
		System.out.println("아파트 입니다.");
	}
}
