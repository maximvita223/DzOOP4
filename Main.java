import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Filter<T>{
    <T> Iterable<T> filter(Iterable<T> list, IsGood<T> approver){
        Iterable<T> newList = list;
        Iterator<T> iterator = newList.iterator();
        while(iterator.hasNext()){
            T item = iterator.next();
            if(!approver.isGood(item)) {iterator.remove();}
        } 
        System.out.println();    
        return   newList;
    }
}
public class Main {
public static void main(String[] args) {
    Filter filter = new Filter();


 IsPositive approver1 = new IsPositive(); 
        List<Integer> ansortedList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,-1,-2,-3));
        System.out.println(filter.filter(ansortedList, approver1));


        BeginsWith approver2 = new BeginsWith("Am");
        List<String> strList = new ArrayList<>(Arrays.asList("Amper","Anfer","Am Gett out"));
        System.out.println(filter.filter(strList, approver2));


        IsEven approver3 = new IsEven();
        List<Integer> ansortedList1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,-1,-2,-3));
        System.out.println( filter.filter(ansortedList1, approver3));
}
    
}