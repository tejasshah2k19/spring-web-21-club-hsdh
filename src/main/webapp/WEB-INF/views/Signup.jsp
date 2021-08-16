<!DOCTYPE html>
<html lang="en">

<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
.error {
	color: red;
}

table {
	background-color: azure;
	border-spacing: 1px;
}

tr, td, th {
	border: 1px solid black;
	padding: 10px 15px;
}
</style>
</head>

<body>

	<div class="container">
		<div id="signup">
			<h2>Signup form</h2>
			<div class="row">
				<div class="col-md-6">
					<form action="saveuser" method="post" name="reg">
						<div class="form-group">
							<label for="email">FirstName:</label> <input type="text"
								class="form-control" id="firstName"
								placeholder="Enter firstname" name="firstName">
							<p class="error" id="firstNameError"></p>
						</div>

						<div class="form-group">
							<label for="email">Email:</label> <input type="text"
								class="form-control" id="email" placeholder="Enter email"
								name="email">
							<p class="error" id="emailError"></p>
						</div>
						<div class="form-group">
							<label for="pwd">Password:</label> <input type="password"
								class="form-control" id="pwd" placeholder="Enter password"
								name="password">
							<p class="error" id="passwordError"></p>
						</div>

						<button class="btn btn-primary" type="submit">Submit</button>
					</form>
				</div>
				<!--col md 6-->
			</div>
			<!-- row-->
		</div>
		<!-- main signup form-->


		<div id="login" style="display: none;">
			<h2>Login form</h2>
			<div class="row">
				<div class="col-md-6">
					<form action="/action_page.php" name="login">

						<div class="form-group">
							<label for="email">Email:</label> <input type="text"
								class="form-control" id="email" placeholder="Enter email"
								name="email">
							<p class="error" id="emailError"></p>
						</div>
						<div class="form-group">
							<label for="pwd">Password:</label> <input type="password"
								class="form-control" id="pwd" placeholder="Enter password"
								name="password">
							<p class="error" id="passwordError"></p>
						</div>

						<button type="button" class="btn btn-primary"
							onclick="authenticate()">Login</button>
					</form>
					<a href="#" onclick="signupForm()">Signup</a>
				</div>
				<!--col md 6-->
			</div>
			<!-- row-->
		</div>
		<!-- main login form div-->


		<div id="mytable" style="display: none;">
			<br> <a onclick="logout()">Logout</a> <br>
		</div>
	</div>
	<!--container-->
</body>

</html>