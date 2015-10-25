public class Fib
{
  public static void main(String[] args)
  {
    System.out.println("Sum:" + fibIt(1, 1));
  }

  public static int fibIt(int a, int b)
  {
    int acc = 0;
    while (true)
    {
      int sum = a + b;
      if (sum % 2 == 0)
      {
        acc += sum;
        p(""+sum);
      }
      a = b;
      b = sum;
      if (sum > 4000000)//00000)
      {
        sum = b;
        break;
      }
    }
    return acc;
  }

  public static void p(String s)
  {
    System.out.println(s);
  }

  public static int fib(int a, int b)
  {
    int sum = a + b;
    p("" + sum);
/*    if (sum > 40)//00000)
    {
      if (b < 40)
        return b;
      else
        return a;
    }
*/
    if (fib(b,sum) % 2 == 0)//if even
    {
      if (fib(b, sum) < 40)
        return sum + fib(b, sum);
      else
        return b < 40 ? b : a;
    }
    else
      if (fib(b, sum) < 40)
        return fib(b, sum);
      else
        return b < 40 ? b : a;
  }
}
