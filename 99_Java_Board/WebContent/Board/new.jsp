<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>New Entry</title>
</head>

<body>
<div class="container mx-auto mt-5 p-5 shadow" style="width: 50%">
<H2>EMP::New Entry</H2>
<HR>
<a href="javascript:history.go(-1)"  class="btn btn-info">Back to List</a> <P>
<form name=form1 method=post action="/99_Java_Board/BoardController">
<input type=hidden name="action" value="insert">

<div class="form-group">
   <label for="EMPNO">EMPNO:</label>   
     <input type="text" class="form-control" name="EMPNO">
</div>

<div class="form-group">
   <label for="ENAME">ENAME:</label>   
     <input type="text" class="form-control" name="ENAME">
</div>

<div class="form-group">
   <label for="JOB">JOB:</label>   
     <input type="text" class="form-control" name="JOB">
</div>

<div class="form-group">
     <label for="MGR">MGR:</label>
    <input type="text" class="form-control" name="MGR">
</div>

<div class="form-group">
     <label for="SAL">SAL:</label>
    <input type="text" class="form-control" name="SAL">
</div>

<div class="form-group">
     <label for="COMM">COMM:</label>
    <input type="text" class="form-control" name="COMM">
</div>

<div class="form-group">
     <label for="DEPTNO">DEPTNO:</label>
    <input type="text" class="form-control" name="DEPTNO">
</div>

<button type="submit" class="btn btn-primary">Save</button>
<button type="reset" class="btn btn-warning">Cancel</button>
</form>

</div>
</body>
</html>