package aischool.java.Ex05array.two_dimensional_array;

public class Ex01two_demen_arr {
    
    public static void main(String[] args) {
        
        // 실습) 출력결과
        // 21    26    31    36    41
        // 22    27    32    37    42
        // 23    28    33    38    43
        // 24    29    34    39    44
        // 25    30    35    40    45
        
        int[][] arr = new int[5][5];
        
        int num = 21;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = num;
                System.out.print(arr[i][j] + "\t");
                num += 5;
            }
            System.out.println();
            num -= 24;
        }
    }
}
