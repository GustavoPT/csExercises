var car = {
    "wheels":4,
    "engines":1,
    "seats":5
};


var car = function()
{
    this.wheels = 4;
    this.engines = 5;
    this.seats = 5;
}

doc = document.getElementsByClassName("m");

var myCar = new car()

function onClickButton()
{
    doc.innerText = myCar.wheels;
}
