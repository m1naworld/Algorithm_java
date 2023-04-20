package programmers.greedy;

import java.util.Stack;

/*
문제 설명

어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건

number는 2자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.

입출력 예

number	k	return
"1924"	2	"94"
"1231234"	3	"3234"
"4177252841"	4	"775841"
 */

public class 큰_수_만들기 {

    public static String solution(String number, int k) {

        StringBuilder answer = new StringBuilder();
		Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char n = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < n && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(n);
        }

        // k가 남아있을 경우
        while (k > 0) {
            stack.pop();
            k--;
        }

        for (char c : stack) {
            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
		solution("1924", 2);
		solution("1231234", 3);
        solution("4177252841", 4);
    }
}

/*
테스트 10: 75.70ms
테스트 12: 0.39ms
*/

/* 기존코드

public static String solution(String number, int k) {
	StringBuilder sf = new StringBuilder(number);

	int reminder = k;

	for (int i = 0; i < sf.length(); ) {
		if (reminder == 0) {
			break;
		}

		if (sf.charAt(i) < sf.charAt(i + 1)) {
			sf.delete(i, i + 1);
			reminder -= 1;

			i = i > 0 ? i - 1 : 0;
		} else {
			i++;
		}
	}

	String answer = sf.toString();
	return answer;
}

느린 이유: StringBuilder의 delete() 메서드를 호출할 때마다 문자열을 복사해야 하기 때문.
StringBuilder는 내부적으로 문자열 버퍼를 가지고 있어서 문자열을 추가할 때는 버퍼에 직접 추가하지만, 문자열을 삭제할 때는 버퍼의 내용을 복사해야 하므로 시간이 오래 걸릴 수 있음.

추가 꿀팁) 문자열을 비교할 때는 char형으로 비교하는 것이 더 효율적!!
char형은 정수형으로 처리되기 때문에 비교 연산자로 바로 비교할 수 있지만, 문자열은 내부적으로 문자 배열로 처리되기 때문에 charAt() 메서드를 호출하여 문자를 가져와야 함. 이러한 이유로 문자열을 비교하는 것보다는 char형으로 비교하는 것이 더 효율적입니다.
- 문자열 비교가 자주 일어나는 경우에는 char형 배열 char형 배열을 사용하고, 비교할 때도 char형으로 비교하는 것이 좋음.
- 문자열을 동적으로 조작하는 경우에 StringBuilder가 유용
 */
