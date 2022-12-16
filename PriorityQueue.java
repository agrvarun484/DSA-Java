package DSA;
import java.util.*;

public class PriorityQueue1{
public static void main(String[] args) {
    PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
    int []ranks = {33, 7, 10, 99, 1, 4, 249};

    for(int val: ranks){
        pq.add(val);
    }
    while(pq.size() > 0){
        System.out.print(pq.peek() + " --> ");
        pq.remove();
    }
}
}
