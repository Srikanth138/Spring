<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<head>
  <link  rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<div class="container">
                 <h1> Result page</h1>
                 <c:choose>
     <c:when  test="${!empty listDTO }">
           <table  class="table  table-center" >
               <tr class="text-danger bg-info">
                 <th>SrNo</th><th>EmpNo </th> <th> EmpName </th> <th>Desg</th> <th>Salary</th> 
               </tr>
               
               <c:forEach var="dto" items="${listDTO}">
                 <tr class="bg-warning  text-danger">
                    <td>${dto.srNo}  </td>
                    <td>${dto.empNo}  </td>
                    <td>${dto.ename}  </td>
                    <td>${dto.job}  </td>
                    <td>${dto.sal}  </td>
                 </tr>
               </c:forEach>
           </table>
     </c:when>
     <c:otherwise>
         <h1 class="bg-success text-white">No Records found</h1>
     </c:otherwise>
  </c:choose>
  <br><br>
     <h3 > <a href="welcome">home</a></h3> 
</div>