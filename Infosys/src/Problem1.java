import java.util.Arrays;

/*
Gym Problem
 */
public class Problem1 {
    public int Energy(int E , int [] A  , int N){
        // case 1 takig total sum and maximize them (2 times)
        // checking that if sum < E or not if it is then directly return -1;
        int sum = 0;
      for(int i = 0; i < N; i++) sum += A[i] * 2;
        if(sum < E)return -1;
        Arrays.sort(A);
      // reversing it
        for(int i = 0; i < N/2; i++){
            // swapping
            int temp = A[i];
            A[i] = A[N-1-i];
            A[N-1-i] = temp;
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2; j++){
                E -= A[i];
                count ++;
                if(E <= 0){
                    return count;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int E = 30;
        int [] A  = {5 ,4, 1, 2,3};
        int N = 5;
        System.out.println(p.Energy(E, A, N));
    }
}
