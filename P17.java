public class P17{
  public static int[] len =               {3,3,5,4,4,3,5,5,4,3};
  public static int[] lenTwentyToNinety = {6,6,5,5,5,7,6,6};
  public static int[] teens =             {6,6,8,8,7,7,9,8,8}; 

  public static void main(String[] args){
    int acc = 0;
    //first 1 to 10
    acc += oneToTen();
    //then teens
    acc+= teens();
    //then the rest
    acc += twentyToNinety();
    //then hundreds
    for (int i =1; i < 10; i++){
      acc += hundred(i);
    }
    //then one thousand
    acc += 11;
    System.out.println("The sum is " + acc);
  }

  public static int hundred(int n){
    int tmp = 0;
    //first "one hundred" etc
    tmp += (len[n-1] + 7) * 100;
    //then "and"
    tmp += 3 * 99;
    //then oneToTen, teens and twenty to ninety
    tmp += oneToTen();
    tmp += teens();
    tmp += twentyToNinety();

    return tmp; 
  }

  public static int twentyToNinety(){
    int tmp = 0;
    //first add up the "twenty", "thirty" etc
    for (int i : lenTwentyToNinety){
      tmp += i * 10;//ten of each
    }
    //then the numbers
      tmp += oneToNine() * 8;
    return tmp;
  }

  public static int teens(){
    int tmp = 0;
    for (int i :teens){
      tmp += i;
    }
    return tmp;
  }
 
  public static int oneToNine(){
    return oneToTen() - 3;
  }
 
  public static int oneToTen(){
    int tmp = 0;
    for (int i :len){
      tmp += i;
    }
    return tmp;
  }

}
