//Zabian Threatt
//This program moves all the zeroes to the end of an array.

const zeroesToEnd = (arr) => {
    let numOfZeroes = 0;

    for(let i = 0; i < arr.length; i++){
        if(arr[i] == '0'){
            arr.splice(i,1);
            i--;
            numOfZeroes++;
        }
    }

    for(let j = 0; j < numOfZeroes; j++){
        arr.push(0);
    }

    console.log(arr);
}

zeroesToEnd ([1, 2, 0, 0, 4, 0, 5]) //returns [1,2,4,5,0,0,0]
zeroesToEnd ([0, 0, 2, 0, 5]) //returns [2, 5, 0, 0, 0]
zeroesToEnd ([4, 4, 5]) //returns [4, 4, 5]
zeroesToEnd ([0, 0]) //returns [0,0] 