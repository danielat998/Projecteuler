public class P26{
  public static void main(String[] args){
    int max = 0;
    int actNo = 0;
    for (int i = 2; i < 1000; i++){
      if (countDigits((double)1 / i) > max){
        max = countDigits((double)1 / i);
        actNo = i;
      }
    }
    System.out.println(actNo);
  }//main

  /* At the moment, this seems to be working on assumption that all fractions
     will evaluate to a recurring number
  */
  public static int countDigits(double n){
    char[] chars = (Double.toString(n)).toCharArray();
    int noDigs = 1;
    boolean done = true;
    while (true){
      for (int i = 2; i < noDigs; i++){
        if (chars[i] != chars[i + noDigs]){
          done = false;
        }
      }//for
      if (!done){
        noDigs++;
      } else {
        return noDigs;
      }
    }//while
  }
}
