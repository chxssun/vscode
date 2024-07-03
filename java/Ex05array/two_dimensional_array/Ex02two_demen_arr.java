package aischool.java.Ex05array.two_dimensional_array;

public class Ex02two_demen_arr {
    
    public static void main(String[] args) {
        
        // 실습) 출력
        // 41    36    31    26    21
        // 42    37    32    27    22
        // 43    38    33    28    23
        // 44    39    34    29    24
        // 45    40    35    30    25
        
        int[][] arr = new int[5][5];
        
        int num = 41;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = num;
                System.out.print(arr[i][j] + "\t");
                num -= 5;
            }
            System.out.println();
            num += 26;
        }
    }
}
