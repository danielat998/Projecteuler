public class P5{
  public static int LCM(int x, int y){
    int larger  = x>y? x: y,
      smaller = x>y? y: x,
      candidate = larger ;
    while (candidate % smaller  != 0) candidate += larger ;
      return candidate;
   }

  public static void main(String[] args){
    int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,19,20};
    int curr = list[0];
    for (int i = 1; i < 20; i++){ //for each element save the first
      curr = LCM(curr, i);
    }
    System.out.println(curr);
  }

}
