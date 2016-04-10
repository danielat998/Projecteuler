public class P2{
  public static void main(String[] args){
    int a = 1;
    int b = 2;
    int acc = 2;//as the initial value of b won't get summed up
    while (b < 4000000){
      int tmp = a + b;
      if (tmp % 2 ==0){
        acc += tmp;
      }
      //then keep iterating
      a = b;
      b = tmp;
    }
    System.out.println("The sum of even-valued terms below 4000000 in the"
                                          " Fibonacci sequence is: " + acc);
  }

  

}
