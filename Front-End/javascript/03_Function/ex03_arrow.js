// 화살표 함수 : 함수 표현식 형태
//      function 키워드 대신 =>

// 1. 함수 선언식
const intro = () => {
    console.log("Spring반에서 막내를 맡은 지호입니다. 😊");
}
// 2. 함수 호출
intro();

// 3. 매개변수
const intro2 = (name) => {
    console.log(`Spring반에서 막내를 맡은 ${name}입니다. 😊`);
}
intro2("막둥이");

// 4. 매개변수 + return문
// const intro3 = (name) = > {
//     return `Spring반에서 막내를 맡은 ${name}입니다. 😊`;
// }
const intro3 = name => `Spring반에서 
막내를 맡은 ${name}입니다.😊`;

// 매개변수 1개 => () 생략가능
// 실행문 1개 => {} + return 생략가능
intro3("창선") // 출력X
console.log(intro3("창선"));
