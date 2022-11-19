import java.util.Arrays;

public class Day2 {

    public static void main(String[] args) {

        // 1번 문제 >> 실수 변환
        int var1 = 5;
        int var2 = 2;

        // 이유: long타입을 제외한 정수 타입(byte, short, char, int)의 연산은 int타입으로 산출됨.
        double var3 = var1 / var2; // 2.0
        int var4 = (int) (var3 * var2); // 4

        // var4가 5가 나오게 하려면 var3이 2.5로 실수타입으로 계산되어야 함
        // 연산전에 타입변환이 필요하다.
        // 그 이유는, 피연산 중 실수타입(float, double)이 있을 경우, 허용범위가 큰 실수 타입으로 변환된 후 연산을 수행하기 때문.

        // 내가 생각한 풀이
        double result3 = (var1 + 0.0) / var2; // 2.5
        double result4 = (double) var1 / var2; // 2.5
        double result5 = var1 / (double) var2; // 2.5
        double result6 = (double) (var1 / var2); // 2.0 >> 연산 후 타입변환을 한 경우는 var3의 식과 같으며 의미없다.


        // ==============================
        // 2번 문제 >> 증감연산자
        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // 31
        // 이유
        // 증감연산자가 앞에 올 경우: 다른 연산을 수행하기 전에 증감연산자가 수행됨
        // 증감연산자가 뒤에 올 경우: 다른 연산을 수행한 후에 증감연산자가 수행됨

        // 위의 z의 식 같은 경우: (10 + 1) + 20 이며 이 연산 이후 y의 값은 19로 변한다.


        // =============================
        // 3번 문제 >> 랜덤 메소드 주사위 문제
        // while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
        // 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성

        // Math.random() 메소드는 **0.0 ~ 1에 무한히 가까운** 숫자들을 제공함
        // 따라서, 랜덤함수 원하는 정수 범위 정하는 법
        // (int) (Math.random() * (최댓값 - 최솟값 + 1)) + 최솟값


        while (true) {
            int a = (int) Math.random(); // 0의 값만 가짐

            // Math.random()을 int로 형변환을 먼저 진행하면 0의 값만 가지기에 무한루프에 빠진다.
            // *주의: (Math.random() * 숫자) 과정을 먼저 진행하여 int형태로 변환해야 한다!
            int first = (int) (Math.random() * 6) + 1;
            int last = (int) (Math.random() * 6) + 1;
//            System.out.println(first);
//            System.out.println(last);

            int sum_value = first + last;

            if (sum_value == 5) {
                System.out.printf("(%d, %d)", first, last);
                break;
            }
        }


    }

}
