import java.math.BigInteger;
public class P14_1{
  //public static final int MAX=1000000;
  public static final int MAX=2000000;
//  public static int[] arr = new int[20000000];
  public static void main(String[] args){
    initArr();
    int largest=0;
    for (int i = 1; i < MAX; i++){
//System.out.println("i:"+i);
      int len=0;
      int a = i;
//System.out.println(a);
      while((a = getCollatz(a)) != 1){
//System.out.println(a);
/*        if(arr[a] != 0){
          len += arr[a];
          break;
        } else */
          len++;
        
      }//while
 //     arr[i] = len;
      if(len>largest)
        largest=len;
    }//for
    System.out.println(largest);
  }//main

  public static int getCollatz(int n){
    if (n % 2==0)
      return n / 2;
    else
      return (3 * n) + 1;
  }

  public static void initArr(){
/*    for (int i =0; i < MAX; i++)
      arr[i] =0;*/
  }
}
