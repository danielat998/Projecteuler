public class P9{
  public static void main(String[] args){
    for (int i = 1; i < 1000; i++){
      for (int j = i; j < 1000; j++){
         for (int k = j; k < 1000; k++){
            if (i * i + j * j == k * k && i + j + k == 1000)
              System.out.println(i * j * k);
         }
      }
    }
  }
}
