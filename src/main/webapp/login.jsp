<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="../resources/js/script.js"></script>
<!------ Include the above in your HEAD tag ---------->


<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <!-- Start form -->
            <form>
                <div class="form-group">
                    <label for="login">Email address</label>
                    <input type="email" class="form-control" id="login" aria-describedby="emailHelp" placeholder="Enter email">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                </div>
                <div class="form-check">
                    <button class="btn btn-info" type="button" name="showpassword" id="showpassword" value="Show Password">Show password</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>

            </form>


            <!-- End form -->
        </div>



    </div>
</div>


</html>