import java.math.BigInteger;

public class P16{
  public static void main(String[] args){
    int acc = 0;
    BigInteger BI = new BigInteger("2").pow(1000);
    for (char c:BI.toString().toCharArray()){
      acc += Character.getNumericValue(c);
    }
    System.out.println(acc);
  }
}
