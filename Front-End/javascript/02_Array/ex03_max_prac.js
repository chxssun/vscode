let nums = [23,54,78,13,44];
// let max = nums[0];
// for(let num of nums) {
//     if(num > max) {
//         max = num;
//     }
// }
// alert("최댓값 >> " + max);

let max = nums[0];
for(let i = 0; i < nums.length; i++) {
    nums[i] > max && (max = nums[i]);
}
console.log(max);
alert(`최댓갑 >> ${max}`);

