// 배열함수
let nameList = ["양세영", "조자연", "최영화"];
console.log("초기배열", nameList);

// 1. 마지막 인덱스 데이터 추가 : push()
nameList.push("박병관");
console.log("마지막 추가", nameList);

// 2. 마지막 인덱스 데이터 삭제 : pop()
nameList.pop();
console.log("마지막 삭제", nameList);

// 3. 첫번째 인덱스 데이터 추가 : unshift()
nameList.unshift("조준용");
console.log("첫번째 추가", nameList);

// 4. 첫번째 인덱스 데이터 삭제 : shift()
nameList.shift();
console.log("첫번째 삭제", nameList);

// 5. 특정 인덱스 데이터 추가/삭제 : splice()
// splice(시작인덱스, 제거할데이터 수, 추가할데이터1, 데이터3);
nameList.splice(1,0, "이도연")
console.log("splice 추가", nameList);
nameList.splice(2,1);
console.log("splice 삭제", nameList);
nameList.splice(1, 1, "박병관", "최영화");
console.log("splice추가/삭제");


