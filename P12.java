/*
 * This is a program that will calculate the lowest triangle number to have
 * more than a certain number of divisors. The number of divisors is set using
 * the static variable threshold
 */

public class P12_2{

  public static boolean debug=false;

  //The threshold above which the number of divisors must be
  public static final int threshold = 500;

  public static void main(String[] args){
if (debug){
  System.out.println("28:" + getNoDivisors(500));


}
    long acc = 1;
    for (long l = 2; l < 999999999L; l++){
      acc += l;
//System.out.println("acc:"+acc);
      int noDivisors = getNoDivisors(acc);
      if (noDivisors>threshold){
        System.out.println("The first triangle number to have over " +
                           "five hundred divisors is: " + acc + "with " + noDivisors + " divisors");
        return;
      }
    }//for
  }//main

  public static int getNoDivisors(long divisee){
    int acc = 0;
    for (long l = 1; l <= divisee/2; l++){
      if (divisee % l == 0){
        acc++;
      }
    }
//System.out.println(acc);
    return acc;
  }
}
