/**
 * 
 */
 
function login(){
    const username=document.getElementById("username").value;
    const password=document.getElementById("password").value;   
    

    const xhttp=new XMLHttpRequest();

    xhttp.open("POST","http://localhost:8080/author/login",true);
    xhttp.setRequestHeader("Content-Type","application/json");
    xhttp.send(JSON.stringify({
        "username":username,
        "password":password
    }));

    xhttp.onreadystatechange = function(){
        if(this.readyState == 4){
           const objects=JSON.parse(xhttp.response);
            
            if(objects.status == 200){
                    window.alert(objects.message);
                    window.location.href="./index2.html";
            }
            else
                window.alert(objects.message);
         }
    };
    return false;

}
