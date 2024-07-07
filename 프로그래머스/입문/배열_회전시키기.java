package 프로그래머스.입문;

import java.util.ArrayList;

public class 배열_회전시키기 {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        String a = "right";
        int[] newarr = new int[arr.length];

        
        if(a.equals("right")){
            newarr[0] = arr[arr.length-1];
            for(int i = 1; i < arr.length; i++) {
                newarr[i] = arr[i-1]; 
            }
        }
        if(a.equals("left")){
            newarr[0] = arr[1];
            newarr[1] = arr[2];
            newarr[2] = arr[0];
            for(int i = 0; i < arr.length-1; i++){
                newarr[i] = arr[i+1];
            }
            newarr[arr.length-1] = arr[0];
        }
    }
}
