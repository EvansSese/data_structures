import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //add elements in queue
        for (int i = 0; i < 5; i++){
            q.add(i);
        }

        System.out.println(q);

        //remove elements in queue
        q.remove();

        System.out.println(q);
    }
}
