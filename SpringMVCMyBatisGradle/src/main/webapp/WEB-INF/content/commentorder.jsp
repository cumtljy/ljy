<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>Omygod | Shopping Mall</title>

<!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Old+Standard+TT:400,400italic' rel='stylesheet' type='text/css'>


<!-- font awesome -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<!-- bootstrap -->
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />


<!-- animate.css -->
<link rel="stylesheet" href="assets/animate.css" />



<!-- Owl Carousel Assets -->
<link href="assets/owl-carousel/owl.carousel.css" rel="stylesheet">

<link  href="assets/style.css" rel="stylesheet">

<!-- favicon -->
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
<link rel="icon" href="images/favicon.png" type="image/x-icon">
<link  href="assets/css/stars.css" rel="stylesheet">

    <script src="js/jquery.min.js"></script>

</head>

<body id="home">






<div class="header">
<nav class="navbar  navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <h1><a class="navbar-brand logo" href="index">Omygod </a></h1>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
      
      <ul class="nav navbar-nav">        
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">所有商品 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
             <li><a href="Men">Men</a></li>
            <li><a href="Women">Women</a></li>
            <li><a href="Gifts">Gifts</a></li>          
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="adminLogin">管理员登录</a></li>
          <li><a href="collect.action?username=${sessionScope.user.username }">收藏夹</a></li>
            <li><a href="order.action?username=${sessionScope.user.username }">我的订单</a></li>                       
          </ul>
        </li>
      </ul>
      
      <form class="navbar-form navbar-left searchbar" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search for products">
        </div>
      </form>
      <ul class="nav navbar-nav">
        <li><a href="login" data-target="#login"><span class="glyphicon glyphicon-user"></span> Login</a>
        <li><a href="register" data-target="#login"><span class="glyphicon glyphicon-user"></span>  Register</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle cart" data-toggle="dropdown"><span class="glyphicon glyphicon-shopping-cart"></span> Cart  <span class="caret"></span></a>
          <div class="dropdown-menu mini-cart">
          
          <div class="clearfix">
         <a href="index" class="btn btn-primary">继续购物</a> <a href="checkout.action?username=${sessionScope.user.username }" class="btn btn-primary">查看购物车</a>
          </div>

          </div>
        </li>
      </ul>
    </div><!-- Wnavbar-collapse -->
  </div><!-- container-fluid -->
</nav>
</div>





<div class="container" >
<form class="form-horizontal" action="submitcomment" method="post" >
  <div class="row">
            <h1 class="text-left">订单打分及图文评论</h1>
            <c:forEach items="${requestScope.order_list }" var="c">
            <input type="hidden" name="username" id="username" tabindex="1" class="form-control" value="${sessionScope.user.username}" > 
            <input type="hidden" name="oid" id="oid" tabindex="1" class="form-control" value="${c.id}" > 
             </c:forEach>	
             
    </div>
 
  <div class="col-md-4">
     <div class="stars">
    <span>商品质量：</span>
    <i>★</i>
    <i>★</i>
    <i>★</i>
    <i>★</i>
    <i>★</i>
    <input type="text" id ="quality" name ="quality" class="form-control"/>
</div>
<div class="stars">
    <span>卖家服务：</span>
    <i class="" score="1">★</i>
    <i class="" score="2">★</i>
    <i class="" score="3">★</i>
    <i class="" score="4">★</i>
    <i class="" score="5">★</i>
    <input type="text" id ="service" name="service" class="form-control"/>
</div>
<div class="stars">
    <span>物流服务：</span>
    <i>★</i>
    <i>★</i>
    <i>★</i>
    <i>★</i>
    <i>★</i>
    <input type="text" id ="logistics" name ="logistics" class="form-control"/>
</div>
   </div>
   <div class="input-group input-group-lg">
     	<input type="text" id="comments" name="comments" class="form-control"  style="width:600px;height:270px;">
   </div>
   <div class="input-group input-group-lg">
    		 <label for="inputfile">添加图片</label>
	    	 <input type="file" id="image" name="image" class="form-control" >
</div>
	  <div class="input-group input-group-lg">
			<button type="submit"  class="btn btn-primary" >发表评论</button>
	</div>
</form>

</div>        
      
   
		



<footer>
   <div class="container">
            <div class="row">

                <div class="col-sm-3 sitemap">
                    <h4>导航地图</h4>
                    <ul class="list-unstyled">
                        <li><a href="index">Home</a></li>
                       <li><a href="collect.action?username=${sessionScope.user.username }">查看收藏</a></li>
                        <li><a href="checkout.action?username=${sessionScope.user.username }">查看购物车</a></li>
                        <li><a href="order.action?username=${sessionScope.user.username }">查看订单</a></li>                           
                    </ul>
                </div>              
                 
                
               
                <div class="col-sm-3 joinus">
                    <h4>联系我们 </h4>
                    <div class="input-group"><input type="text" class="form-control" placeholder="Your Name"></div>
                    <div class="input-group"><input type="text" class="form-control email" placeholder="Your Email Address..."></div>
                    <button class="btn btn-primary"><i class="fa fa-paper-plane"></i> 反馈意见</button>                   
                </div>
                <div class="col-sm-3">
                    <h4>加入我们</h4>
                    <span class="social"><a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-twitter"></i> <a href="#"><i class="fa fa-youtube"></i></a> <a href="#"><i class="fa fa-pinterest"></i></a></span>
                </div>

                
            </div>
            <!--/.row--> 
 
    
    <!--/.footer-bottom--> 
</div>
</footer>
<div class="copyright">
    <div class="container">
        
        © Copyright Crystal E-commerce 15-2   
        <a href= class="pull-right">Omygod Shopping Mall</a>

    </div>
</div>
</div>


<script src="assets/jquery.js"></script>



<!-- owlcarousel -->
<script src="assets/owl-carousel/owl.carousel.min.js"></script>

<!-- boostrap -->
<script src="assets/bootstrap/js/bootstrap.js" type="text/javascript" ></script>

<!-- jquery mobile -->
<script src="assets/mobile/touchSwipe.min.js"></script>
<script src="assets/respond/respond.js"></script>





<!-- custom script -->
<script src="assets/script.js"></script>
<script>
    $(function(){
        /*
        * 鼠标点击，该元素包括该元素之前的元素获得样式,并给隐藏域input赋值
        * 鼠标移入，样式随鼠标移动
        * 鼠标移出，样式移除但被鼠标点击的该元素和之前的元素样式不变
        * 每次触发事件，移除所有样式，并重新获得样式
        * */
        var stars = $('.stars');
        var Len = stars.length;
        //遍历每个评分的容器
        for(i=0;i<Len;i++){
            //每次触发事件，清除该项父容器下所有子元素的样式所有样式
            function clearAll(obj){
                obj.parent().children('i').removeClass('on');
            }
            stars.eq(i).find('i').click(function(){
                var num = $(this).index();
                clearAll($(this));
                //当前包括前面的元素都加上样式
                $(this).addClass('on').prevAll('i').addClass('on');
                //给隐藏域input赋值
                $(this).siblings('input').val(num);
            });
            stars.eq(i).find('i').mouseover(function(){
                var num = $(this).index();
                clearAll($(this));
                //当前包括前面的元素都加上样式
                $(this).addClass('on').prevAll('i').addClass('on');
            });
            stars.eq(i).find('i').mouseout(function(){
                clearAll($(this));
                //触发点击事件后input有值
                var score = $(this).siblings('input').val();
                for(i=0;i<score;i++){
                    $(this).parent().find('i').eq(i).addClass('on');
                }
            });
        }
    })
</script>
</body>
</html>