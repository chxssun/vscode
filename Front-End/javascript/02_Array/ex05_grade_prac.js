// 0. 과목 수, 과목 이름, 과목 점수, 총점, 평균 초기화
let subNum = 0; // 과목 수
let subName = []; // 과목 이름
let subScore = []; // 과목 점수
let totalScore = 0; // 총점
let averageScore = 0; // 평균

// 1. 과목 수 입력
subNum = Number(prompt('과목 수 입력'));
// 2. 과목 수 만큼 과목 이름 입력
for (let i = 0; i < subNum; i++) {
    subName.push(prompt('과목 이름 입력'));
}
console.log(subName);
// 3. 각 과목의 점수 입력
// 4. 과목 점수 총합과 평균 도출
for (let i = 0; i < subName.length; i++) {
    let score = Number(prompt(`${subName[i]}의 점수를 입력`));
    subScore.push(score);

    totalScore += score;
}
averageScore = parseInt(totalScore / subScore.length);

console.log(subScore, totalScore, averageScore);
// 5. 형태에 맞춰 HTML문서 내 테이블로 출력
let table = `<table><tr>`;
for (let i = 0; i < subNum; i++) {
    table += `<td>${subName[i]}</td>`;
}
table += `
        <td>총합</td>
        <td>평균</td>
    </tr>
    <tr>
    `;
for (let i = 0; i < subNum; i++) {
    table += `<td>${subScore[i]}</td>`;
}
table += `
        <td>${totalScore}</td>
        <td>${averageScore}</td>
    </tr>
</table>
`;

document.write(table);
