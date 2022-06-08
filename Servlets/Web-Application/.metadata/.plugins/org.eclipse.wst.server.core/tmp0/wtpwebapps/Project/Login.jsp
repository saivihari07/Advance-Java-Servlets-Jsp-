<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<%@ include file="include/head.jsp"%>
</head>
<body style="background: #2F4F4F">
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center" style="background: #2F4F4F">User Login</div>
			<div class="card-body">
				<form action="user-login" method="post">
					<div class="form-group">
						<label>Email address</label> <input type="email"
							name="login-email" class="form-control" placeholder="Enter email">
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password"
							name="login-password" class="form-control" placeholder="password">
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-success">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<%@include file="/include/footer.jsp"%>

</body>
</html>