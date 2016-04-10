public class P4{
  //This is a brute force solution for problem 3 of Project Euler
  public static void main(String[] args){
    int max = 0;
    for (int i = 100; i < 1000; i++) {
      for (int j = i; j < 1000; j++) {
        if (isPalNum(i * j) && (i * j) > max){
          max = i * j;
        }
      }
    }
    System.out.println(max);
  }

  public static boolean isPalNum(int n){
    char[] num = new String("" + n).toCharArray();
    for (int i = 0; i < num.length; i++){
      if (num[i] != Math.ceil(num[num.length-1 - i]))
        return false;
    }
    return true;
  }
}
