import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
  
        int count = 1; //N값 본인
        //1부터 시작할거라서 1로 초기화
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index!=N){
            if(sum==N){
                count++; 
                end_index++; 
                sum += end_index;
            }else if(sum>N){
                //빼주고 ++해야되기 때문에 순서 조심
                sum -= start_index;
                start_index++;
            }else{
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}