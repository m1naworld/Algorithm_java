import java.util.Arrays;

public class KthNumber {


    public static int[] solution(int[] array, int[][] commands) {

        int resultIndex = commands.length;
        int[] answer = new int[resultIndex];

        int[] arr;
        int[] commandsElement;
        for(int i=0; i < resultIndex; i++){
            commandsElement = commands[i];

            if(commandsElement[0] == commandsElement[1]){
                answer[i] = array[commandsElement[0] -1];
            }else{
                arr = Arrays.copyOfRange(array, commandsElement[0] -1, commandsElement[1]);
                Arrays.sort(arr);
                answer[i] = arr[commandsElement[2] -1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);

    }
}


