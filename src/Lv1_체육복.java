import java.util.*;

public class Lv1_체육복 {

    public static int solution(int n, int[] lost, int[] reserve) {

        int[] participants = new int[n + 1];

        Arrays.fill(participants, 1);

        // 인덱스 0일때는 영향 받지 않는 수 default
        participants[0] = -1;

        // 잃어버린 사람
        int lostLength = lost.length;
        for (int k : lost) {
            participants[k] = 0;
        }

        // 여벌 체육복 갖고 있는 사람
        int reserveLength = reserve.length;
        for (int k : reserve) {
            participants[k] += 1;
        }

        for (int i = 1; i < participants.length - 1; i++) {
            if (participants[i] == 0) {
                if (participants[i - 1] == 2) {
                    participants[i] = 1;
                    participants[i - 1] = 1;
                } else if (participants[i + 1] == 2) {
                    participants[i] = 1;
                    participants[i + 1] = 1;
                }
            }

        }


        int participantsCount = 0;
        for (int p : participants) {
            if (p > 0) {
                participantsCount += 1;
            }

        }

        return participantsCount;


    }

    public static void main(String[] args) {
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};
//        solution(5, lost, reserve);

//        int[] lost1 = {2, 4};
//        int[] reserve1 =  {3};
//        solution(5, lost1, reserve1);

        int[] lost2 = {3};
        int[] reserve2 = {1};
        solution(3, lost2, reserve2);

//        int[] lost3 = {2, 4, 7};
//        int[] reserve3 = {1, 3, 5};
//        solution(7, lost3, reserve3);

//        int[] lost4 = {1, 2};
//        int[] reserve4 = {2, 3};
//        solution(3, lost4, reserve4);
    }
}
