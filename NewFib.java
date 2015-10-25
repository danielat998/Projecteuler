public class NewFib{
  public static void main(String[] args){
    int a=1, b=1;
    while (true){
      int c=a+b;
      System.out.println("the next fibonacci value is:" + c);
      a=b;
      b=c;
    }
  }


}
