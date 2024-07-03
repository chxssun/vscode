package class17Array2;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random rd = new Random();
        
        // 1. 선언
        int[] lotto = new int[6];

        // 2. 로또 번호 생성
        for(int i = 0; i < lotto.length; i++) {
            // lotto배열에 숫자 넣기
            lotto[i] = rd.nextInt(45)+1;
            // 3. 중복제거
            // i인덱스 전 인덱스 까지 비교 j<i
            for(int j = 0; j < i; j++) {
                // 만약 같은게 있으면
                if(lotto[i] == lotto[j]) {
                    // 생성 로직 다시실행
                    i--;
                    break;
                }
            }
        }
        // 4. 출력
        System.out.println(Arrays.toString(lotto));

    }
}
