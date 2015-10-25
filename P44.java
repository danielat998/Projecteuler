import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class P44{

  private static int MAXN = 999999;

  private static List<Integer> list = new ArrayList<Integer>();

  public static void main(String[] args){
    //loop through possible vals, and populate the list
    for (int i = 1; i < MAXN; i++){
       double no = (double)i*(3*i-1)/2;
       if (no % 2 == 0){
         list.add((int)no);
       }
    }//for
    //then iterate through list
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()){
       Integer i = it.next();
       //then iterate again
       Iterator<Integer> smallIt = list.iterator();
       while (smallIt.hasNext()){
          //for efficiency
          Integer j = smallIt.next();
          if (j >= i) break;
          if (isPentagon(i + j) && isPentagon(i - j)){
             System.out.println("Pair: " + i + ", " + j);
          }
       }
    }
  }//main


  public static boolean isPentagon(Integer i){
    if (list.contains(i)){
      return true;
    } else {
      return false;
    }
  }
}
