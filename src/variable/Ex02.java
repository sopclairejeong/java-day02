package variable;

public class Ex02 {
	public static void main(String[] args) {
		int num = 123;
		System.out.println("변경 전 num : " + num);
		num = 100;
		System.out.println("변경 후 num : " + num);
		num = num + 200;
		System.out.println("변경 후 num : " + num);
	}
}