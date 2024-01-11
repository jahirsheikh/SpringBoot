<%-- 
    Document   : viewallstu
    Created on : 28 Dec 2023, 10:29:22
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
     
        <div class="container">
        <h1>All Student Details</h1>

        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Roll</th>
                    <th>Department</th>
                    <th>Marks</th>
                    
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="stu" items="${stuList}">
                    <tr>
                        <td>${stu.id}</td>
                        <td>${stu.roll}</td>
                        <td>${stu.name}</td>
                        <td>${stu.department}</td>
                        <td>${stu.marks}</td>
                        
                        <td>
                            <a href="/stueditform/${stu.id}" class="btn btn-primary">Edit</a>
                            <a href="/deletestu/${stu.id}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <a href="/stusaveform" class="btn btn-success">Add Employee</a>
    </div>
        
        
        
        <!-- Bootstrap JS CDN -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
