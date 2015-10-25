public class P6{
  public static void main(String[] args){
    int accsq = 0;
    int acc = 0;
    for (int i = 0; i <= 100; i++)
      accsq += i * i;
    for (int i = 0; i <= 100; i++)
      acc += i;
    System.out.println((acc * acc) - accsq);
  }
}
