public class P13{
  public static void main(String[] args){
    //start off with a simple one, then copy and paste proj Euler one
    int[][] numbers = {
                       {1,2,3,4,5},
                       {4,5,6,7,8},
                       {9,8,4,3,1}
                      };
    int[] sums = new int[5];
    for (int i = 0; i < 5; i++){
      sums[i] = 0;
      for (int j = 0; j < 3; j++){
        sums[i] += numbers[i][j];
      }
    }
    
  }
}
