// public class MyClass {...}


const prompt = require('prompt-sync')(); // this is comment
/*
*/
console.log("Hello Prateek from NodeJs");


//var uName = prompt("Please enter your wish? :");
//console.log(eval('3+5'));
//console.log("your wish :"+uName+" Was granted! enjoy");



x = 48; // not recommended
console.log(x);



//console.log(i);
var myFunction = function()
{

    "use strict";
    /* Start of your code */
    function greetMe(yourName)
    {
      console.log('Hello ' + yourName);
    }
  
    greetMe('Edureka');

    console.log(greetMe.prototype);

    
    /* End of your code */
}


  myFunction(); //calling once
  myFunction(); //calling again



{ // an independent block
    let i = 5;
    i = 7;
    console.log(i);
}

var myObject = {'id' : '001Student', 'name':'rohan'}; //JSON JavaScript Object Notation
console.log("Name of the Student is: "+myObject['name']);

var myObject_2 = myObject;
myObject_2.id = "002Student";
console.log("Id of the Student is: "+myObject_2.id);
console.log("Id of the Student is: "+myObject.id);

let myArray = ['student1','student2'];
console.log(myArray[2]); // this returns undefined
myArray.push('student3');
console.log(myArray[2]);

var  myString = "someText";

var k = 56;

//var num1 = prompt("Please enter first number");
//var num2 = prompt("Please enter second number");

//num1 = (+num1);
//num2 = (+num2);

//console.log("Sum of the two numbers is :"+((num1)+( num2)));

//var j = 0;

/*
while( j < 10 )
{
    console.log(j);
    j++;
}
 */

var userinput = prompt("please enter a value out of y/n/z");

if(userinput === "y")
{
    console.log("The user said Yes");
}
else if(userinput === "n")
{
    console.log("The user said No");
}
else{
    console.log("The user doesn't know");

}

outerloop : for(let i = 0; i<5; i++)
{

    for(let j=0; j<5; j++)
    {

        if(j === 3)
        {
             continue outerloop; // break;
        }
        else
        {
            console.log("the vlaue of i,j is :"+i+","+j);
        }

    }    

}



var myObj = {'id' : '001', 'name' : 'basheer', 'company' : 'TCS', 'enggBranch' : 'ECE'};

for( let dataField in myObj)
{
    console.log("DataField : "+dataField+" of Object : "+myObj+" has a value : "+myObj[dataField]);    
}











