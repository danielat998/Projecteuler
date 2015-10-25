public class P39{
  public static void main(String[] args){
    int bestP = 1;
    int noSols = 0;
    for (int i = 0; i <= 1000; i++){
      int counter = 0;
      for (int j1 = 1; j1 < i/2; j1++){
        for (int j2 = 1; j2 < i/2; j2++){
          if (Math.sqrt(j1 * j1 + j2 * j2) == (i -j1 - j2)){
            counter++;
            if (counter > noSols){
              noSols = counter;
              bestP = i;
            }
          }//if ==
        }//for j2
      }//for j1
    }//for i
    System.out.println("The optimum value of p is:" + bestP + "with" + noSols
                                                            + "solutions.");
  }//main
}//class
