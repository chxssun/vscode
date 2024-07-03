// 함수 : 특정 기능을 수행하는 소스코드를 
//      하나로 묶어서 필요할 때 마다 사용하기 위한 구조

// 1. 함수 선언식
function intro() {
    console.log("Spring반에서 막내를 맡은 지호입니다. 😊");
}
// 2. 함수 호출
intro();

// 3. 매개변수
function intro2(name) {
    console.log(`Spring반에서 막내를 맡은 ${name}입니다. 😊`);
}
intro2("막둥이");

// 4. 매개변수 + return문
function intro3(name) {
    return `Spring반에서 막내를 맡은 ${name}입니다. 😊`;
}
intro3("창선") // 출력X
console.log(intro3("창선"));

