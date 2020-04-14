<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h1>Form</h1>


    <form action="backend.php">


    <div>
         Name :   <input type="Name" id="name">
        </div>
        <br>
        <div>

         Email :   <input type="email" id="myemail">
        </div>
        <br>
        <div>
         Age :   <input type="number" value="myage">
        </div>
        <br>
        <div>
         Are you Eligibe :   <input type="checkbox" value="myeligible">
        </div>
        <br>
        <div>
         Male :   <input type="radio" value="mygender">
         Female :   <input type="radio" value="mygender">
        </div>

        <div>

            Tell me about yourself :   <textarea name="" id="mytext" cols="30" rows="10"></textarea>


        </div>
        <br>
        <div>
            Car you want to buy :<select name="Mycar" id="car">
                <option value="Mer">Mercedes</option>
                <option value="Bmw">Bmw</option>
            </select>


        </div>
        <div>
         Submit :   <input type="submit" value="submit">


        </div>
        <br>



    </form>


</body>
</html>