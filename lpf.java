import java.util.ArrayList;
import java.util.List;

public class lpf
{
  static<T> void println(T arg) { System.out.println(arg); }
  public static void main(String[] args)
  {
    //loop through all numbers <= the number/2 , divide the number by that
    //(this is to avoid duplication)
    //Then put these into a list of factors(for now)
    //foreach factor, call method recursively until we reach 
    println("*******************<prime factors>************************");
    List<Integer> l = getFactors(13195);
    println(getPrimeFactors(l));
/*    for (int i : l)
    {
      if(isPrime(i))
        println(i);
    }
*/
  }
 

  public static List<Integer> getPrimeFactors(List<Integer> l)
  {
    List<Integer> primeList = new ArrayList<Integer>();
    for (Integer i: l)
      if (isPrime(i))
        primeList.add(i);
    return l;
  }

  public static boolean isPrime(int no)
  {
/*
//println("In isPrime, no=" + no);
    List l = new ArrayList<Integer>();
    if (no == 1)
      return true;
    for (int i = (int)Math.floor((double)no / 2); i > 0; i--)
    {
//println("\tIn loop, i = " + i);
      if (no % i == 0)
        return false;
      else if (!isPrime(i))//recursively call this
        return false;
//println("\tEnd of loop, i = " + i + ", not returned yet");
    }
    return true; //if no numbers divide into it
*/
  }
 
  public static List<Integer> getFactors(int no)
  {
    List l = new ArrayList<Integer>();
    for (int i = (int)Math.floor((double)no / 2); i > 0; i--)
    {
      if (no % i == 0)
      {
        //if not already there, add both these numbers
        //for efficiency, we could probably just add the one
        insertIfNotInList(l, i);
      }
    }
    return l;
  }

  //we don't use this any more
  public static void insertIfNotInList(List<Integer> l, int no)
  {
    if(!l.contains(no))
      l.add(no);
  }
}
