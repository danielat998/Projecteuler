public class P17{
  public static int[][] vals = {
 {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100},
 {3,3,5,4,4,3,5,5,4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8, 6, 6, 6, 5, 5, 7, 6, 6, 10}};
 //                             This is 10 because "(one) hundred AND..."
  public static void main(String[] args){
    int total = 0;
    //first do the numbers one to nineteen inclusive
    for (int i = 0; i < 19; i++){
      total += vals[1][i];
    }
    //then start doing the decades
    for (int i = 19; i < 26; i++){
      //first do the 'decade' on its own (e.g. twenty)
      total += vals[1][i];
      //then loop through 1 to 9
      for (int j = 0; j < 9; j++){
        total += vals[1][i] + vals[1][j];
      }
    }//'decades'

    //Then we want to do the same sort of thing but this time adding hundreds
    for (int h = 0; h < 9; h++){
      for (int i = 19; i < 26; i++){
        //first do the 'decade' on its own (e.g. twenty)
        total += vals[1][i];
        //then loop through 1 to 9
        for (int j = 0; j < 9; j++){
          total += vals[1][i] + vals[1][j] + vals[1][h] + vals[1][27];//add the hundred bit and the number before it
        }
      }
    }

  //then don't forget about a thousand
  total += 11;
  System.out.println(total);
  }//main
}
