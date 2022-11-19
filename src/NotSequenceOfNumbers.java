import java.util.ArrayList;

public class NotSequenceOfNumbers {


    public static int[] solution(int []arr) {

        ArrayList<Integer> newArray = new ArrayList<>();

        for( int i=0; i < arr.length-1; i++){
            System.out.printf("%d, %d\n", arr[i], arr[i+1]);

            // 바로 옆 중복이 아닌 경우
            if(arr[i] != arr[i+1]){
                if( newArray.size() == 0 || newArray.get(newArray.size()-1) != arr[i]){
                    newArray.add(arr[i]);
                    newArray.add(arr[i+1]);
                }else{
                    newArray.add(arr[i+1]);
                }
            }
            else{
                if(newArray.size() == 0 || newArray.get(newArray.size()-1) != arr[i]){
                    newArray.add(arr[i]);
                }
            }
        }

        System.out.println(newArray);

        int[] answer = newArray.stream().mapToInt(i->i).toArray();
        return answer;
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] a = solution(arr);

        int[] arr1 = {4, 4, 4, 3, 3};
        int[] b = solution(arr1);
//
        int[] arr2 = {4, 5, 3};
        int[] c = solution(arr2);
    }
}
