 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城首页</title>
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
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">其他服务 <span class="caret"></span></a>
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
        <li><a href="login" data-target="#login"><span class="glyphicon glyphicon-user"></span> 登录</a>
        <li><a href="register" data-target="#login"><span class="glyphicon glyphicon-user"></span>  注册</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle cart" data-toggle="dropdown"><span class="glyphicon glyphicon-shopping-cart"></span> Cart <span class="cart-counter">8</span> <span class="caret"></span></a>
          <div class="dropdown-menu mini-cart">
          
          <div class="clearfix">
          <a href="index" class="btn btn-primary">继续购物</a> 
          <a href="checkout.action?username=${sessionScope.user.username }" class="btn btn-primary">查看购物车</a>
          <a href="updatePassword" class="btn btn-primary">修改密码</a>
          </div>
          </div>
        </li>
      </ul>
    </div><!-- Wnavbar-collapse -->
  </div><!-- container-fluid -->
</nav>
</div>
<h1>Welcome ${sessionScope.user.username} to the Omygod!</h1><br>
<h3>Your ID：${cookie.JSESSIONID.value}</h3><br>
<h3>当前在线人数：<font color="red">${applicationScope.count}</font></h3><br>
<!-- hero landing -->
<div class="hero-land clearfix">
        <div class="landing men-land">
        <img src="images/female.jpg"  class="img-responsive" alt="slide">
        <div class="caption animated fadeInUp"><h1>女装</h1><a href="Women"><i class="fa fa-angle-right"></i></a></div>
        </div>
        <div class="landing women-land">
        <img src="images/male.jpg"  class="img-responsive" alt="slide">
        <div class="caption  animated fadeInUp"><h1>男装</h1><a href="Men"><i class="fa fa-angle-right"></i></a></div>
        </div>
</div>
<!-- hero landing -->
<!-- slider and feature product-->
<div class="container-feature">
<div class="container">
<div class="row">
<div class="col-sm-7">
<h3>Collections</h3>
<!-- banner -->
<div class="banner">
<div class="carousel fade-carousel slide" data-ride="carousel" data-interval="4000" id="banner-carousel">
  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item slides active">
      <img src="images/4.jpg"  class="img-responsive" alt="slide">
 
    </div>
    <div class="item slides">
      <img src="images/5.jpg"  class="img-responsive" alt="slide">
  
    </div>
    <div class="item slides">
      <img src="images/6.jpg"  class="img-responsive" alt="slide">
 
    </div>
  </div>
  <!-- Controls -->
  <a class="left carousel-control" href="#banner-carousel" role="button" data-slide="prev">
    <i class="fa fa-angle-left"></i>
  </a>
  <a class="right carousel-control" href="#banner-carousel" role="button" data-slide="next">
    <i class="fa fa-angle-right"></i>
  </a>

</div>   
</div>
<!-- banner-->
</div>
<div class="col-sm-5">
<!-- feature-products -->
<div class="feature-products">
        <h3>特色商品</h3>
        <div id="owl-products" class="owl-carousel">
                    <div class="product">
                            <a href="product"><img src="images/photos/w1.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> 加入购物车</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/w2.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/m1.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/m2.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/w3.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/w4.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/m3.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/m4.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/w5.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/m5.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/w6.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/m6.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
                    <div class="product">
                            <a href="product"><img src="images/photos/w7.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                    </div>
            </div>
</div>
<!-- featured -->

</div>
</div>
</div>
</div>
<!-- slider and feature product-->
<!-- latest products -->
<div class="latest-products">
    <div class="container">
    <h3>Latest Products</h3>
        <div class="row">
            <div class="col-sm-2 col-xs-6">
                <div class="product">
                            <a href="product"><img src="images/photos/m1.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-sm-2 col-xs-6">
                <div class="product">
                            <a href="product"><img src="images/photos/w1.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-sm-2 col-xs-6">
                <div class="product">
                            <a href="product"><img src="images/photos/m2.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-sm-2 col-xs-6">
                <div class="product">
                            <a href="product"><img src="images/photos/w2.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-sm-2 col-xs-6">
                <div class="product">
                            <a href="product"><img src="images/photos/m3.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>
            <div class="col-sm-2 col-xs-6">
                <div class="product">
                            <a href="product"><img src="images/photos/w3.jpg" class="img-responsive"></a>
                            <div class="row title-price">
                                <div class="col-md-8"><h5><a href="product.html">Warm Cloths</a></h5></div>
                                <div class="col-md-4"><span>$ 200</span></div>
                            </div>
                            <a href="product" class="btn btn-default"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                </div>
            </div>            
        </div>
</div>
</div>
<!-- latest products -->
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


</body>
</html>