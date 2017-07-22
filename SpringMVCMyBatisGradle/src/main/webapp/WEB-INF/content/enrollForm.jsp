<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
 <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
</head>
<body>
<div class="container" style="background:image/background.jpg">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">兔子菇凉的花草小铺</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li >
							 <p style="text-align:center">已有账号？</p>
						</li>
						<li>
							 <a href="login">请登录</a>
						</li>
						
							</ul>
					
					
					
				</div>
				
			</nav>
			<div class="jumbotron">
             <h2 >花花草草，暮暮朝朝</h2>
             <img src="image/logo.jpg" >
           
             <p><a class="btn btn-primary btn-lg  col-lg-4" href="#" role="button">Learn more</a></p>
</div>
	      <div class="row">
        <div class="col-md-12">
          <h4>欢迎注册</h4>
          <form class="form-horizontal" role="form" action="enroll" method="post">
            <div class="form-group">
              <label for="inputUsername" class="col-lg-2 control-label">注册名：</label>
              <div class="col-lg-10">
                <input type="text" id="loginname" name="loginname" class="form-control"  placeholder="Username">
              </div>
            </div>
            <div class="form-group">
              <label for="inputEmail1" class="col-lg-2 control-label">邮箱：</label>
              <div class="col-lg-10">
                <input type="email" class="form-control" id="inputEmail1" placeholder="Email">
              </div>
            </div>
            <div class="form-group">
              <label for="inputPassword1" class="col-lg-2 control-label">密码：</label>
              <div class="col-lg-10">
                <input type="password" class="form-control" id="password" name="password"  placeholder="Password">
              </div>
            </div>
            
            <div class="form-group">
              <label for="inputAddress" class="col-lg-2 control-label">地址：</label>
              <div class="col-lg-10">
                <input type="text" class="form-control" id="address" name="address"  placeholder="Address">
              </div>
            </div>
            <div class="form-group">
              <label for="inputPhone" class="col-lg-2 control-label">联系方式：</label>
              <div class="col-lg-10">
                <input type="email" class="form-control" id="inputEmail1" placeholder="Email">
              </div>
            </div>
            <div class="form-group">
              <div class="col-lg-offset-2 col-lg-10">
                <label class="checkbox" for="checkbox3">
                  <input type="checkbox" data-toggle="checkbox" value="" id="checkbox3" required>
                  Remember me
                </label>
              </div>
            </div>
            <div class="form-group">
              <div class="col-lg-offset-2 col-lg-10">
                <button type="submit" class="btn btn-default">Sign in</button>
              </div>
            </div>
          </form>
        </div>	
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg col-lg-offset-2 col-lg-4" data-toggle="modal" data-target="#myModal">
  注册
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">用户提示</h4>
      </div>
      <div class="modal-body">
                     请确认您的用户信息无误
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
       <button type="button" class="btn btn-primary">保存</button>
      </div>
    </div>
  </div>
</div>
</div>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"> 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
 
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 
<script>
  $(function(){
    $(".btn").click(function(){
      $("#mymodal").modal("toggle");
    });
  });
</script>
</body>
</html>