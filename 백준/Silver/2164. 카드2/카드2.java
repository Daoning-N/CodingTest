import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            myQueue.add(i);
        }
        while(myQueue.size()>1){
            myQueue.poll();
            
            int temp = myQueue.poll();
            myQueue.add(temp);
            // = myQueue.add(muQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}