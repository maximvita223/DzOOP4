
public class Main {
public static void main(String[] args) {
 IsEven even = new IsEven();
 IsPositive pos = new IsPositive();
 System.out.println(even.isGood(10));  
 System.out.println(pos.isGood(-1)); 
 BeginsWithA beg = new BeginsWithA();
 System.out.println(beg.isGood("gmature"));
}
    
}