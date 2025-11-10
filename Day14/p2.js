//count repeated char
var character = 'A';
var count = 5;

function repeatCharacter(character, count) {
    var result = "";
    for (var i = 0; i < count; i++) {
        result = result + character;
    }
    return result;
}

var output = repeatCharacter(character, count);
console.log(output);
