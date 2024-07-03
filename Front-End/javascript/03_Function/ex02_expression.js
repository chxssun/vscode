// 함수 표현식 : 익명 함수 형태로 함수 선언한 수 변수에 참조
// function(){} => 이름이 없는 함수, 익명함수

const intro = function() {
    console.log('Spring반에서 막내를 맡은 지호입니다. 😊');
}
intro();

const intro2 = function(name) {
    console.log(`Spring반에서 ${name}를 맡은 지호입니다. 😊`);
}
intro2("귀염둥이")