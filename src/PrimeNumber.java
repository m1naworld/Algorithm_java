import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumber {

    public static int solution(int[] nums) {

        // 기존 내 코드 >> 평균 5.x ms
        boolean[] prime = new boolean[3000];

        // 소수 판별
        Outter:
        for (int i = 2; i < prime.length; i++) {
            for (int j = 1; j < i; j++) {
                if (prime[j] == true) {
                    if (i % j == 0) {
                        continue Outter;
                    }
                }
            }
            prime[i] = true;
        }

//        // 범준님 코드  >> 평균 1.00ms 이하
//        boolean[] prime = new boolean[3000+1];
//        Arrays.fill(prime, true); // 소수 배열 초기화
//        prime[0] = false;
//        prime[1] = false;
//
//        for(int i=2; i <= 3000; i++){
//            if(prime[i]){
//                for(int l = i+i; l <= 3000; l+=i){
//                    prime[l] = false;
//                }
//                if(i*i >= 3000)break;
//            }
//        }


        int primeCount = 0;
        int numsLength = nums.length;

        for (int k = 0; k < numsLength; k++) {
            for (int l = k + 1; l < numsLength; l++) {
                for (int m = l + 1; m < numsLength; m++) {
                    int number = nums[k] + nums[l] + nums[m];
                    if (prime[number] == true) {
                        primeCount += 1;
                    }
                }
            }
        }
        System.out.println(primeCount);
        return primeCount;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 7, 6, 4};
        int[] b = {1, 2, 3, 4};

        solution(a);
        solution(b);
    }
}
