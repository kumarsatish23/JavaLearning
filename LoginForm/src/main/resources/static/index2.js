function author(){
    const xhttp=new XMLHttpRequest();

    xhttp.open("GET","http://localhost:8080/author/getall",true);
    xhttp.send();

    xhttp.onreadystatechange = function() {
        if (this.readyState == 4) {
        const data=JSON.parse(xhttp.response);
            
        // for(i=0;i<data.length;i++){      
        //     document.write("<br>"+"<b style='color:red'>Author</b>:"+"<br>"+
        //     "<b>Id:</b>"+data[i].id+"<br>"+
        //     "<b>Author Name:</b>"+data[i].name+"<br>");
        //     const book=data[i].book;
        //     document.write("<br>"+"<b style='color:blue;'>Book Details:</b>"+"<br>");
        //     for(j=0;j<book.length;j++){
        //         document.write("<br>"+"<b>Book Id:</b>"+data[i].book[j].bookId+"<br>"+
        //         "<b>Book Name:</b>"+data[i].book[j].bookName+"<br>"+
        //         "<b>Publisher Name:</b>"+data[i].book[j].publishername+"<br>");
        //     }
        // }
            let text = "<table border='1' width=100% style='border-collapse:collapse;'>";
            text += "<tr style='height:50px'><th rowspan='2'>Author Id</th>"
                    +"<th rowspan='2'>Author Name</th>"+
                    "<th rowspan='2'>Mobile Number</th>"+
                    "<th colspan='3'>Book Details</th></tr>";
            text += "<tr style='height:50px'><th>Book Id</th>"+
                    "<th>Book Name</th>"+
                    "<th>Publisher Name</th></tr>";
            for(let i=0;i<data.length;i++) {
                        let n=data[i].book.length;
               text += "<tr style='height:50px'><td rowspan="+n+">" + data[i].id + "</td>";
               text +="<td rowspan="+n+">"+data[i].name +"</td>";
               text +="<td rowspan="+n+">"+data[i].phonenumber +"</td>";
               for(let j=0;j<n;j++){
                    if(j>0)
                            text+="<tr style='height:50px'>";
                    text +="<td>"+data[i].book[j].bookId +"</td>";
                    text +="<td>"+data[i].book[j].bookName +"</td>";
                    text +="<td>"+data[i].book[j].publishername +"</td></tr>";
                }
            }
             text += "</table>"    
            document.write(text);   
      
       }
    };
}