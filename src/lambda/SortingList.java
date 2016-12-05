package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingList {
    public static void main(String[] args){
        SortingList sortingList = new SortingList();
        sortingList.init();
    }
    public void init(){
        List<Integer> list = Arrays.asList(4,5,2,6,1,3);
        System.out.println("unsorted list: " + list);

        OrderBy orderBy = new OrderBy();
        Collections.sort(list,orderBy);
        System.out.println("ascending list: "+list);

        Collections.sort(list,(a,b)-> b - a );
        System.out.println("descending list: "+list);
    }

    public class OrderBy implements Comparator<Integer>{

        @Override
        public int compare(Integer a, Integer b) {
            return a-b;
        }
    }
}
