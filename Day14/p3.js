//find max number
function findMax(){
    let max = numbersArray[0];
    for(var i=1;i<numbersArray.length;i++){
        if(numbersArray[i]>max){
            max=numbersArray[i];
        }
    }
    return max;
}
const numbersArray = [2, 8, 5, 1, 7];
const result = findMax(numbersArray);

console.log("Array:", numbersArray);
console.log("Maximum Value:", result);