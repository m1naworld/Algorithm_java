public class CollatzConjecture {

    public static int solution(int num) {

        long result = num;  // 오버플로우 문제
        int count = 0;

        if(num == 1){
            count = 0;
            return count;
        }

        while (result != 1 && count <= 500) {
                result = result % 2 == 0 ? result / 2 : result * 3 + 1;
                System.out.println(result);
                count += 1;

        }

        if(count > 500){
            count = -1;
        }

        return count;
    }


    public static void main(String[] args) {
        int a = solution(626331);
//        int b = solution(16);
        System.out.println(a);
//        System.out.println(b);
    }
}


