import java.util.List;
import java.util.ArrayList;
public class P40{
  public static void main(String[] args){
    List<Integer> list = new ArrayList<Integer>();
    int no = 1;
    while (list.size() < 1000000){
      for (int i: ("" + no++).toCharArray()){
        i -= 48;//ASCII shit
        list.add(i);
      }
    }
    //Then print out what we need
    for (int i =0; i < 6; i++){
System.out.println("index:" + (int)Math.pow(10, i));
      System.out.println(list.get((int)Math.pow(10, i) -1));
    }
for (int i = 0; i < 120; i++){
  System.out.print(list.get(i));
}
  }//main
}
