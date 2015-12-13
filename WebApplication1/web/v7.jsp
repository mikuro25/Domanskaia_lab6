<%-- 
    Document   : v7
    Created on : 06.12.2015, 0:26:32
    Author     : Hanna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.14.0/jquery.validate.min.js"></script>
        <script>
            $(function () {
                $(".insertForm").validate({
                    rules: {
                        parameter: {
                            required: true
                        }
                    }
                });
            });
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <input type="text" value="3" name="parameter">
        <button >Insert</button>
        <form action="ClientServlet" method="post" class="insertForm">
            <table style="margin-left: 10px;">
                <tr>
                    <td>parameter</td> <td><input type="text" name="parameter"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="insert" value="insert" style="width: 80px"></td>
                </tr>
            </table>
        </form>
   
    </body>
</html>
