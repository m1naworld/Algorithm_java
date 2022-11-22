public class CaesarCipher {


    public static String solution(String s, int n) {


        // 기존 코드 String에  += 한 코드 >> 최대 28.06ms, 평균 11ms
//        String answer = "";
//
//        char[] charArr = s.toCharArray();
//
//        char minLetter;
//        char maxLetter;
//
//        for (int i = 0; i < charArr.length; i++) {
//
//            if (charArr[i] == ' ') {
//                answer += charArr[i];
//                continue;
//            } else if ('a' <= charArr[i] && charArr[i] <= 'z') {
//                minLetter = 'a';
//                maxLetter = 'z';
//            } else {
//                minLetter = 'A';
//                maxLetter = 'Z';
//            }
//
//            if ((char)charArr[i] + n <= maxLetter) {
//                answer += (char) (charArr[i] + n);
//            } else {
//                answer += (char) (minLetter + (charArr[i] + n) - maxLetter -1 );
//            }
//        }
//        System.out.println(answer);
//
//        return answer;


        // StringBuffer() 활용 >> 최대 1.60ms, 평균 0.10ms
        StringBuffer sb = new StringBuffer();

        char[] charArr = s.toCharArray();

        char minLetter;
        char maxLetter;

        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] == ' ') {
                sb.append((char)charArr[i]);
                continue;
            } else if ('a' <= charArr[i] && charArr[i] <= 'z') {
                minLetter = 'a';
                maxLetter = 'z';
            } else {
                minLetter = 'A';
                maxLetter = 'Z';
            }


            if (charArr[i] + n <= maxLetter) {
                sb.append((char) (charArr[i] + n));

            } else {
                char change = (char) (minLetter + (charArr[i] + n) - maxLetter -1);
                sb.append(change);
            }
        }

        String answer = sb.toString();

        return answer;


    }
        public static void main (String[]args){
            solution("AB", 1);
            solution("z", 1);
            solution("a B z", 4);
        }
    }
