// 배열에 저장된 데이터를 반복문으로 출력

// 1. for문
let nameList = ["창선","재옥","준영","상제","세영"];
for(let i = 0; i < nameList.length; i++) {
    console.log(nameList[i]);
}

// 2. for-of문
let foodList = ["삼겹살", "샌드위치", "샐러드파스타", "닭"];
for(let food of foodList) {
    console.log(food);
}

// 3. forEach()
let subList = ["javascript", "java", "db"]
subList.forEach((sub, index) => {
    console.log(index, sub);
});
