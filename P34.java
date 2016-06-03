import java.util.*;
public class P34{
	public static void main(String[] args){
		int totalSum = 0;
		for (int i = 3; i < 9999999;i++){
			Integer[] digs = getDigits(i);
			int acc = 0;
			for (Integer no:digs)
				acc += fact(no);
			if (acc == i)
				totalSum += i;
		}
		System.out.println(totalSum);
	}

	public static int fact(int n){
		int prod = 1;
		for (int i = n; i > 1;i--)
			prod *= i;
		return prod;
	}

	public static Integer[] getDigits(int num) {
    List<Integer> digits = new ArrayList<Integer>();
    collectDigits(num, digits);
    return digits.toArray(new Integer[]{});
	}

	private static void collectDigits(int num, List<Integer> digits) {
    if(num / 10 > 0) {
      collectDigits(num / 10, digits);
    }
    digits.add(num % 10);
	}
}
