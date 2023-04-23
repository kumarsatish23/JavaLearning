
function add(){
    
    //const authorid=document.getElementById("authorid").value;
    const name=document.getElementById("authorname").value;
    const phonenumber=document.getElementById("pn").value;
    const bookid=document.getElementById("bookid").value;
    const bookname=document.getElementById("bookname").value;
    const publishername=document.getElementById("pname").value;

    const xhttp=new XMLHttpRequest();

    xhttp.open("POST","http://localhost:8080/author/addauthor",true);
    xhttp.setRequestHeader("Content-Type","application/json");
    xhttp.send(JSON.stringify({
        "name":name,
        "phonenumber":phonenumber,
        "book":[{
            "bookId":bookid,
            "bookName":bookname,
            "publishername":publishername
        }]
    }));

    xhttp.onreadystatechange = function(){
        if(this.readyState == 4){
           const objects=JSON.parse(xhttp.response);

            if(objects.status == 200){
                   window.location.href="./addedbook.html";
            }
            else if(objects.status==500){
                window.alert(objects.message);
            }
            else{
                if(objects.hasOwnProperty('phonenumber') && objects.hasOwnProperty('name'))
                     window.alert(objects.name+"\n"+objects.phonenumber);
                else if(objects.hasOwnProperty('phonenumber'))
                    window.alert(objects.phonenumber);
                else    
                    window.alert(objects);
            }
         }
    };
    return false;

}

  
    