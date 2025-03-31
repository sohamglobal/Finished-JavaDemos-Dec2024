function add()
{
    a=parseInt(document.getElementById("num1").value)
    b=parseInt(document.getElementById("num2").value)
    c=a+b
    document.getElementById("result").textContent="Addition is "+c
}

function sub()
{
    a=document.getElementById("num1").value
    b=document.getElementById("num2").value
    c=a-b
    document.getElementById("result").textContent="Subtraction is "+c
}

function mul()
{
    a=document.getElementById("num1").value
    b=document.getElementById("num2").value
    c=a*b
    document.getElementById("result").textContent="Multiplication is "+c
}

function div()
{
    a=document.getElementById("num1").value
    b=document.getElementById("num2").value
    c=a/b
    document.getElementById("result").textContent="Division is "+c
}

