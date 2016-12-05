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

        Collections.sort(list,(a,b)-> a - b );
        System.out.println("ascending list: "+list);

        Collections.sort(list,(a,b)-> b - a );
        System.out.println("descending list: "+list);
    }

    public class orderBy implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }
}
