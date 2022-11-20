public class MinimumRectangle {

    public static int solution(int[][] sizes) {

        int max_x = 0;
        int max_y = 0;

        for(int i=0; i < sizes.length; i ++){
            // 2차원 배열 안의 두 값을 비교하여 큰수는 큰수들 중, 작은 수는 작은 수들 중 비교하여 최대값들 뽑기
            if(sizes[i][0] > sizes[i][1]){
                max_x = Math.max(max_x, sizes[i][0]);
                max_y = Math.max(max_y, sizes[i][1]);
            }else{
                max_x = Math.max(max_x, sizes[i][1]);
                max_y = Math.max(max_y, sizes[i][0]);
            }
        }

        return max_x * max_y;
    }


    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
