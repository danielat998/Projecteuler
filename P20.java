import java.math.BigInteger;

public class P20{
  public static void main(String[] args){
    System.out.println(getSum(getFact(100)));
  }


  public static BigInteger getFact(int a){
System.out.println("In getFact, a:" + a);
   return a == 1 ? BigInteger.ONE : BigInteger.valueOf(a).multiply(getFact(a - 1));
  }

  public static int getSum(BigInteger n){
    String s = n.toString(); //"" + n;
    int acc = 0;
    for (char c:s.toCharArray()){
      acc += Character.getNumericValue(c);
    }
    return acc;
  }

}
