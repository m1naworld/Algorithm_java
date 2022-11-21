import java.util.ArrayList;
import java.util.Arrays;

public class StringOfNumbersAndWords {

    public static int solution(String s) {

        // 주어진 String char 배열로 변환
        char[] charArr = s.toCharArray();

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String findWord = "";

        String result = "";

        for (int i=0; i < s.length(); i++) {

            char currentChar = Character.valueOf(charArr[i]);

            // char에서 소문자는 97부터
            if(currentChar > 96){
                findWord += String.valueOf(currentChar);
            }else{
                result += currentChar;
            }

            for(int j=0; j < arr.length; j ++){
                if(arr[j].equals(findWord)){
                    result += j;
                    findWord = "";   // 일치하는 문자 있을 경우 초기화
                }
            }
        }

        System.out.println("c: " + result );


        return Integer.parseInt(result);
    }


    public static void main(String[] args) {
        solution("one4seveneight");
        solution("23four5six7");
    }
}
