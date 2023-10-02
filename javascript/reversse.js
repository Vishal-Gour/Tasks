function reverseWord(word){
    return word.split('').reverse().join(''); 
}

const strArray = prompt('Enter a string').split(' '); 
let result = "";

strArray.forEach(word => {
    result += reverseWord(word) + ' '; 
});

console.log(result);
