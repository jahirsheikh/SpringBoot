<%-- 
    Document   : stueditform
    Created on : 28 Dec 2023, 10:41:48
    Author     : user
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
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
        <h1>Edit Page</h1>
        <f:form method="post" action="/editstusave" modelAttribute="student">
            <f:hidden path="id" />
            <table class="table table-striped">
                <tr>
                    <td>Roll</td>
                    <td><f:input path="roll" class="form-control"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><f:input path="name" class="form-control"/></td>
                </tr>
                <tr>
                    <td>Department</td>
                    <td>
                        <f:select path="department" class="form-control">
                            <f:option value="Java" label="Java"/>
                            <f:option value="C#" label="C#"/>
                            <f:option value="Wdpf" label="Wdpf"/>
                            <f:option value="Nt" label="Nt"/>
                        </f:select>
                    </td>
                </tr>
                <tr>
                    <td>Marks</td>
                    <td><f:input path="marks" class="form-control"/></td>
                </tr>
            </table>
                
            <div class="row">
                <div class="col">
                    <input type="submit" value="Edit" class="btn btn-primary"/>
                </div>
                <div class="col">
                    <a href="/viewallstu" class="btn btn-secondary">View All Student</a>
                </div>
            </div>
        </f:form>
    </div> 
        
           
        <!-- Bootstrap JS CDN -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
