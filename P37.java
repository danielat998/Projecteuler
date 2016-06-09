import java.util.*;
public class P37{
 public static List<Integer> primes=new ArrayList<Integer>();
 public static void main(String[] args){
  //sieve of Erastothenes
  int M=999999;
  boolean[] a=new boolean[M];//only this time initialise to false and do backwards
  for (int i=2;i<Math.sqrt(M);i++){
   if(!a[i]){
    for (int j=(int)Math.pow(i,2);j<M;j+=i){
     a[j] = true;
    }
   }
  }
  for(int i=10;i<M;i++){
   if(!a[i]) primes.add(i);
  }
  int acc=0;
  int times=11;
  //then loop through primes
  for (Integer p:primes){
   if(isTrunc((""+p),true) && isTrunc((""+p),false)){
    acc +=p;
    if(--times==0){
     break;
    }
   }
  }
  System.out.println(acc);
 }

 public static boolean isTrunc(String p,boolean left){
  if (p.length()==1){
    return PrimeStuff.isPrime(Integer.parseInt(p))&&Integer.parseInt(p)!=1;
  } else {
   if(PrimeStuff.isPrime(Integer.parseInt(p))){
    if ((left &&isTrunc(p.substring(1,p.length()),true)) ||(!left&& isTrunc(p.substring(0,p.length()-1),false))){
     return true;
    } else {
     return false;
    }
   }
  }
  return false;
 }
}
