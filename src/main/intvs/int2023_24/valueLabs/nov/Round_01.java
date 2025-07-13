package main.intvs.int2023_24.valueLabs.nov;

public class Round_01 {

}

//console.log("Hello, World!");
//
//function removeDuplicates(input) {
//    let seen = new Set();
//    let output = "";
//
//    for (let char of input) {
//        // Add the character to output only if it hasn't been seen before
//        if (!seen.has(char)) {
//            output += char;
//            seen.add(char);
//        }
//    }
//
//    return output;
//}

//console.log(removeDuplicates("tesssts")); // Output: "tets"

//function removeConsecutiveDuplicates(input) {
//    // Split input string into an array of characters
//  const chars = input.split('');
//
//    // Initialize output array with the first character
//    let output = [chars[0]];
//
//    // Loop through the characters starting from the second one
//    for (let i = 1; i < chars.length; i++) {
//        // Add character if it's different from the last added character in output
//        if (chars[i] !== chars[i - 1]) {
//            output.push(chars[i]);
//        }
//    }
//
//    // Join output array to form final string
//    return output.join('');
//}

//const res2 = removeConsecutiveDuplicates("tesssts");
//console.log(res2);


// tesssts
// tets

//function removedDuplicateChars(input) {
//    let right = 0;
//    let left = 0;
//    let len = input.length;
//    let res = "";
//    while(right < len) {
//
//        while(input.charAt(left) == input.charAt(right) && left <= right) {// 0 == 0
//            left++;
//        }
//        if(input.charAt(left) != input.charAt(right) && left != right) {
//            res += input.charAt(right);
//        }
//        right++;
//    }
//    return res;
//}

//const res = removedDuplicateChars2("tesssts");
//console.log(res);

//function removedDuplicateChars2(input) {
//    let right = 0;
//    let left = 0;
//    let len = input.length;
//    let res = "";
//    while(right < len) {
//
//        while(input.charAt(left) == input.charAt(right) && left <= right) {// 0 == 0
//            left++;
//        }
//        if(input.charAt(left) != input.charAt(right)) {
//            res += input.charAt(right);
//        }
//        right++;
//    }
//    return res;
//}

// function removedDuplicateChars2(input) {
//   let len = input.length;
//   let res = "";

//   let left = 0;
//   for(let i = 1; i<len; i++) {
//     if(input.charAt(i) != input.charAt(left)) {
//       res += input.charAt(left);
//       left = i;
//     } else {
//       left = i;
//     }
//   }

//   return res;
// }


