public class 항해알고리즘테스트_2번 {

    public static void solution(int star) {

        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }


    public static void main(String[] args) {

        int star = 9;
        solution(star);
    }
}
