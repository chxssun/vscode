// 1. 두개의 수를 입력 받는다
// 2. 입력받은 두 수의 합을 구하는 함수 생성
// 결과값을 알림팝업으로 출력

let num1 = Number(prompt("첫번째 정수 입력"));
let num2 = Number(prompt("두번째 정수 입력"));

const addNumber = (num1, num2) => num1+num2;

alert(addNumber(num1, num2));