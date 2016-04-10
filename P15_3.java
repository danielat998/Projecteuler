public class P15_3{
  public static final int width = 20; //no of points in each dimension
  public static void main(String[] args){
    System.out.println(recTraverse(0,0)); 
  }

  public static int recTraverse(int x, int y){
    if (x == width-1 && y == width-1)
      return 1;//we have reached the end
    int count = 0;
    if (x != width)
      count += recTraverse(x+1, y);
    if (y != width)
      count += recTraverse(x, y+1);
    return count;
  }

}
