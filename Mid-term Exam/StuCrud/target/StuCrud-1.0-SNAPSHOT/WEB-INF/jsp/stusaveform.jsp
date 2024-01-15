<%-- 
    Document   : stusaveform
    Created on : 28 Dec 2023, 10:35:53
    Author     : user
--%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
        <h1>Add New Student</h1>

        <f:form method="post" action="/stusave" modelAttribute="student">
            <table class="table table-striped">
<!--                <tr>
                    <td>ID</td>
                    <td>
                        <f:input path="id" class="form-control" />
                    </td>
                </tr>-->
                <tr>
                    <td>Roll</td>
                    <td>
                        <f:input path="roll" class="form-control" />
                    </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>
                        <f:input path="name" class="form-control" />
                    </td>
                </tr>
                <tr>
                    <td>Department</td>
                    <td>
                        <f:select path="department" class="form-control">
                            <f:option value="C#">C#</f:option>
                            <f:option value="Java">Java</f:option>
                            <f:option value="Wdpf">WDPF</f:option>
                            <f:option value="Nt">NT</f:option>
                        </f:select>
                    </td>
                </tr>
                <tr>
                    <td>Marks</td>
                    <td>
                        <f:input path="marks" class="form-control" />
                    </td>
                </tr>

                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save" class="btn btn-primary" />
                    </td>
                </tr>
            </table>
        </f:form>
    </div>
        
           
        <!-- Bootstrap JS CDN -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
