import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NewId {
    public static String solution(String new_id) {

        new_id = new_id.toLowerCase(); // 소문자 정렬
        new_id = new_id.replaceAll("[^a-z0-9._-]", ""); // 소문자, 숫자, . , _ , - 제외하고 모두 제거
        new_id = new_id.replaceAll("[.]{2,}", "."); // .이 두개 이상 중복일 경우 제거

        ArrayList<String> newIdList = new ArrayList<>(Arrays.asList(new_id.split("")));

        String answer = "";

        if (newIdList.get(0).equals(".")) {
            newIdList.remove(0);
        }
        if (newIdList.size() != 0 && newIdList.get(newIdList.size() - 1).equals(".")) {
            newIdList.remove(newIdList.size() - 1);
        }


        int newIdLength = newIdList.size();

        if (newIdLength == 0) {
            return "aaa";
        } else if (newIdLength >= 16) {
            if (newIdList.get(14).equals(".")) {
                answer = new String(String.join("", newIdList.subList(0, 14)));
            } else {
                answer = new String(String.join("", newIdList.subList(0, 15)));
            }
        } else if (newIdLength < 3) {
            for (int i = newIdLength; i < 3; i++) {
                newIdList.add(newIdList.get(i - 1));
            }
            answer = new String(String.join("", newIdList));
        } else {
            answer = new String(String.join("", newIdList));
        }

        return answer;
    }


    public static void main(String[] args) {
        solution("z-+.^.");
        solution("...!@BaT#*..y.abcdefghijklm");
        solution("123_.def");
        solution("=.=");
        solution("abcdefghijklmn.p");


    }
}
