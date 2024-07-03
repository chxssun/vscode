package aischool.java.Ex05array.two_dimensional_array;

public class Ex00two_demen_arr {

    public static void main(String[] args) {
        
        // 이차원 배열 : 1차원 배열 안에 1차원 배열이 들어가 있는 구조
        // 같은 자료형의 데이터들을 관리하는 구조

        // 1) 이차원배열 선언 및 생성
        // 자료형[][] 배열명 = new 자료형[5][3];

        int[][] arr = new int[5][3];

        // arr.length : 5
        // arr[0].length : 3

        System.out.println(arr);

        System.out.println(arr[0]); // 3칸짜리 배열이 만들어져 있는 주소값

        System.out.println(arr[1]);

        arr[0][0] = 1;
        arr[0][1] = 2;

        // arr2 라는 이차원 배열
        // 크기는 5,5 정방형 이차원 배열

        // 1~25 순차적으로 대입
        int[][] arr2 = new int[5][5];

        int num = 1;

        for(int j = 0; j < arr2.length; j++) {
            for(int i = 0; i < arr2.length; i++) {
                arr2[j][i] = num;
                System.out.print(arr2[j][i] + "\t");
                num++;
            }System.out.println();
        }

        // 빌드업
        // int[][] arr3 = new int[5][5];
        // int num1 = 1;
        // arr3[0][0] = num1;
        // num1++;
        // arr3[0][1] = num1;
        // num1++;
        // arr3[0][2] = num1;
        // num1++;
        // arr3[0][3] = num1;
        // num1++;
        // arr3[0][4] = num1;
        // num1++;
        // arr3[1][0] = num1;
        // num1++;
        // for(int i = 0; i < arr3.length; i++) {
        //     arr3[0][i] = num1;
        //     num++;
        // }
        // for(int i = 0; i < arr3.length; i++) {
        //     arr3[1][i] = num1;
        //     num++;
        // }
        // for(int i = 0; i < arr3.length; i++) {
        //     arr3[2][i] = num1;
        //     num++;
        // }
        // for(int i = 0; i < arr3.length; i++) {
        //     arr3[3][i] = num1;
        //     num++;
        // }
        // for(int i = 0; i < arr3.length; i++) {
        //     arr3[4][i] = num1;
        //     num++;
        // }
        // for(int i = 0; i < arr3.length; i++) {
        //     for(int j = 0; j < arr3.length; j++) {
        //         arr[i][j] = num1;
        //         num1++;
        //     }
        // }
        // 출력
        // for(int i = 0; i < arr3.length; i++) {
        //     for(int j = 0; j < arr3.length; j++) {
        //         System.out.print(arr3[i][j] + "\t")
        //     }System.out.println();
        // }
        // for(int i = 0; i < arr3.length; i++) {
        //     for(int j = 0; j < arr3.length; j++) {
        //         arr3[i][j] = num;
        //         System.out.print(arr3[i][j] + "\t");
        //         num++;
        //     }System.out.println();
        // }
    }
}
