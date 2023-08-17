import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); 
        // readLine() 예제의 첫번째 데이터(숫자) 개수
        int suNo =  Integer.parseInt(stringTokenizer.nextToken()); //데이터(수) 개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); //질의개수
        
        long[]S = new long[suNo + 1]; //0번째 인덱스까지 바로 합하기 위해 +1
        
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++){ //0번째 인덱스 건너뛰고 계산하기 위해 i=1;
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q=0; q<quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}