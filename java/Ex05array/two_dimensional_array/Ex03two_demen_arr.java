package aischool.java.Ex05array.two_dimensional_array;

public class Ex03two_demen_arr {
    
    public static void main(String[] args) {
        
        // 실습) 출력
        // 21    22    23    24    25
        // 30    29    28    27    26
        // 31    32    33    34    35
        // 40    39    38    37    36
        // 41    42    43    44    45

        int[][] arr = new int[5][5];

        int num = 21;

        for(int j = 0; j < 5; j++) {
			if(j % 2 == 1) {
				for(int i = arr.length-1; i >= 0; i--) {
					arr[j][i] = num;
					num++;
				}
			}else {
				for(int i = 0; i < 5; i++) {
					arr[j][i] = num;
					num++;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}

        
    }
}
