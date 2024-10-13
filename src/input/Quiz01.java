package input;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, math, sum;
		System.out.print("당신의 이름은 무엇입니까 ? ");
		name = input.next();
		System.out.print(name + "님의 국어점수 : ");
		kor = input.nextInt();
		System.out.print(name + "님의 영어점수 : ");
		eng = input.nextInt();
		System.out.print(name + "님의 수학점수 : ");
		math = input.nextInt();
		
		System.out.println("==============================");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("==============================");
		sum = kor + eng + math;
		System.out.println("합계 : " + sum);
		System.out.println("==============================");
	}
}