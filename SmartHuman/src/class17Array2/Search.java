package class17Array2;

public class Search {
    public static void main(String[] args) {
        // Sequential search
        // 1. 배열 생성
        int[] arr = {13,35,15,11,26,72,78,13,61,90};

        // 2. 78 찾기
        int searchValue = 61;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchValue) {
                System.out.println(searchValue+"는"+i+"번째 있습니다");
            }
        }
    }
}
