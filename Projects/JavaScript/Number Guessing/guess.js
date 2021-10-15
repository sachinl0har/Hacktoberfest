const prompt = require('prompt-sync')();

function guessNumber() {

    const random = Math.floor(Math.random() * 10) + 1;
    var maxTry = 5;
    var tries = 0;

    do {
      if(tries == 5){
        console.log("Last Chance! Think hard.\n")
      }
       var number = prompt('Guess a number from 1 to 10: ');
       tries++;
       if(number > random){
         console.log("Too High");
       }else if(number < random){
         console.log("Too Low");
       }else{
        console.log('You guessed the correct number.');
       }
    }while((number != random) && (tries <= maxTry));

  }

guessNumber();
