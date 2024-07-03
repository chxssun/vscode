package aischool.java.Ex05array.one_dimensional_array;

public class Ex01array_concept {
    
    public static void main(String[] args) {
        
        
      // 배열의 필요성
      String b1 = "양준영";
      String b2 = "방상재";
      String b3 = "김지호";
      String b4 = "김창민";
      String b5 = "조자연";
      // 5명의 학생이름을 for문으로 출력할수 있지 않을까?
      
      // 변수를 만드는건 서로 다른 공간이 5개가 생긴것(흩어져있음)
      // for문을 사용한 순차적 접근은 불가능하게 만들어짐
      
      // 이름을 관리하는 배열을 만들어 주자
      // 1) 배열 생성 방법
      // 자료형[] 배열명 = new 자료형[배열의크기];
      // 자료형 : 내가 배열에 저장하고 싶은 데이터들의 타입
      // [] -> 배열을 의미
      // new --> 동적 메모리를 새롭게 할당 해주는 키워드
      // 배열을 생성할 때는 뒤쪽에서 반드시 크기를 정해줘야한다
      
      String[] names = new String[5];
      // 배열은 인덱스 구조를 가지고 있다
      System.out.println(names);
      // names : 레퍼런스형 변수(주소값을 참조하는 변수)
      
      // 기본 데이터 타입이 저장되는 방법(boolean, int,...)
      // 레퍼런스형 데이터 타임이 저장되는 방법
      
      names[1] = b1;
      names[2] = b2;
      names[3] = b3;
      names[4] = b4;
      names[0] = b5;
      // ArrayIndexOutofBoundsExceotion : 예외상황
      // - 살행을 시켜야 알 수 있는 에러
      // - 인덱스 값이 초과/ 없는 인덱스 값에 접근
      // index 기본적으로 0부여
      // namas가 가질수 있는 인덱스 값은 0~4
      
      // 인덱스를 변수로 사용 / for문을 사용해서 names에 저장되어 있는 이름 5개 출력
      for(int i = 0; i <= 4; i++) {
         System.out.println(names[i]);
      }
      
      // 학생수가 증가
      // names[5] = "한재옥";
      // 앞에서 배열을 생성할 때 정해놓은 크기를 뒤에서 바꿀 수 없다.

      // + 배열의 크기를 가져와 주는 기능
      System.out.println(names.length); // 5

      for(int i = 0; i < names.length; i++) {
         System.out.println(names[i]);
      }
      
      // 실습) 배열을 임의의 값 8개로 초기화
      // 7,11,20,30,5,45,17,9
      // 배열안에서 홀수만 출력
      // 배열안에서 짝수개수 출력
      // 배열안에 숫자들중 가장 큰 값 출력
      int[] nums = {7,11,20,30,5,45,17,9};

      int cnt = 0;
      int max = nums[0];

      for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 1) {
          System.out.print(nums[i] + " ");
        }else {
          cnt++;
        }
        if(nums[i] > max) {
          max = nums[i];
        }
      }
      System.out.println();
      System.out.println("짝수 개수 : " + cnt);
      System.out.println("가장 큰 값 : " + max);
    }
}
