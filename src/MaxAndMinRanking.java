/*
import javax.sound.sampled.FloatControl;
import java.util.List;

public class MaxAndMinRanking {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};


        int lottoIndex = 0;
        int lottoNum = lottos[lottoIndex];

        int winNumIndex = 0;
        int winNum = win_nums[winNumIndex];


        int sameCount = 0;

        while(lottoIndex < lottos.length){

            if(lottoNum != 0  && lottoNum != winNum){

            }
            if(lottoNum == 0 | lottoNum == winNum){
                if(lottoIndex == winNum){
                    sameCount += 1;
                }
                lottoIndex += 1;
                lottoNum = lottos[lottoIndex];
                winNumIndex = 0 ;
                winNum = win_nums[winNumIndex];
//            }else if(lottoNum !=0 && lottos == num)

        }

//        int[] answer = {sameCount, }
        return answer;




    }

    public static void main(String[] args) {

    }
}
*/
