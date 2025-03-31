function welcome()
{
    alert("welcome to javascript programming")
}

function validate()
            {
                m=document.frm.mob.value
                if(m.length!=10)
                {
                    //alert("Invalid mobile number")
                    document.getElementById("err").innerHTML="Invalid mobile number"
                    return false
                }
                else
                return true
            }