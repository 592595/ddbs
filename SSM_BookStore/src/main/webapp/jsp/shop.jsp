<%--
  Created by IntelliJ IDEA.
  User: ljj
  Date: 2019/11/2
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>shop</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicons -->
    <link rel="shortcut icon" href="../images/favicon.ico">
    <link rel="apple-touch-icon" href="../images/icon.png">

    <!-- Google font (font-family: 'Roboto', sans-serif; Poppins ; Satisfy) -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,600,600i,700,700i,800" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">
    <!-- Cusom css -->
    <link rel="stylesheet" href="../css/custom.css">
    <!-- Stylesheets -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/plugins.css">
    <link rel="stylesheet" href="../css/style.css">
    <!-- Modernizer js -->
    <script src="../js/vendor/modernizr-3.5.0.min.js"></script>
</head>
<body class="bg-image--8" style=" background-attachment: fixed;">
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->

<!-- Main wrapper -->
<div class="wrapper" id="wrapper" style="margin: 100px">

    <!-- Header -->
    <header id="wn__header" class="oth-page header__area header__absolute sticky__header ">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-7 col-lg-2">
                    <div class="logo">
                        <a >
                            <img src="../images/logo/logo.png" alt="logo images">
                        </a>
                    </div>
                </div>
                <div class="col-lg-8 d-none d-lg-block">
                    <nav class="mainmenu__nav">
                        <ul class="meninmenu d-flex justify-content-start">
                            <li class="drop with--one--item"><a href="../WEB-INF/pages/public/index.jsp">Home</a></li>
                            <li class="drop"><a href="#">Shop</a></li>
                            <li class="drop"><a href="login.jsp">Login</a></li>
                            <li class="drop"><a href="register.jsp">Register</a></li>
                        </ul>
                    </nav>
                </div>
                <div class="col-md-8 col-sm-8 col-5 col-lg-2">
                    <ul class="header__sidebar__right d-flex justify-content-end align-items-center">
                        <li class="shop_search"><a class="search__active" href="#"></a></li>
                        <li class="wishlist"><a href="#"></a></li>
                        <li class="shopcart"><a class="cartbox_active" href="#"><span class="product_qun">*</span></a></li>
                        <li class="setting__bar__icon"><a class="setting__active " href="#"></a></li>

                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!-- //Header -->
    <!-- Start Search Popup -->
    <div class="box-search-content search_active block-bg close__top">
        <form id="search_mini_form" class="minisearch" action="#">
            <div class="field__search">
                <input type="text" placeholder="Search entire store here...">
                <div class="action">
                    <a href="#"><i class="zmdi zmdi-search"></i></a>
                </div>
            </div>
        </form>
        <div class="close__wrap">
            <span>close</span>
        </div>
    </div>
    <!-- End Search Popup -->

    <!-- Start Shop Page -->
    <section class="page-shop-sidebar left--sidebar bg--white section-padding--lg" style="opacity:85%;width: 1150px;margin-left: 80px;    padding-top: 30px; margin-top: 150px">
        <div class="container" style="padding: 20px;border: 1px #ddd solid;">
            <div class="row">
                <div class="col-lg-12">

                    <div class="tab__container">
                        <div class="shop-grid tab-pane fade show active" id="nav-grid" role="tabpanel">
                            <div class="row">
                                <!-- Start Single Product -->
                                <div class="col-lg-4 col-md-4 col-sm-6 col-12">
                                    <div class="product">
                                        <div class="product__thumb">
                                            <a class="first__img" href="single-product.html"><img src="../images/product/1.jpg" alt="product image"></a>

                                            <ul class="prize position__right__bottom d-flex">
                                                <li>$40.00</li>
                                                <li class="old_prize">$55.00</li>
                                            </ul>
                                          <%--  <div class="action">
                                                <div class="actions_inner">
                                                    <ul class="add_to_links">
                                                        <li><a class="cart" href="cart.html"></a></li>
                                                        <li><a class="wishlist" href="wishlist.html"></a></li>
                                                        <li><a class="compare" href="compare.html"></a></li>
                                                        <li><a data-toggle="modal" title="Quick View" class="quickview modal-view detail-link" href="#productmodal"></a></li>
                                                    </ul>
                                                </div>
                                            </div>--%>
                                        </div>
                                        <div class="product__content">
                                            <h4><a href="single-product.html">Strive Shoulder Pack</a></h4>
                                            <ul class="rating d-flex">
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-lg-4 col-md-4 col-sm-6 col-12">
                                    <div class="product">
                                        <div class="product__thumb">
                                            <a class="first__img" href="single-product.html"><img src="../images/product/1.jpg" alt="product image"></a>

                                            <ul class="prize position__right__bottom d-flex">
                                                <li>$40.00</li>
                                                <li class="old_prize">$55.00</li>
                                            </ul>
                                            <%--  <div class="action">
                                                  <div class="actions_inner">
                                                      <ul class="add_to_links">
                                                          <li><a class="cart" href="cart.html"></a></li>
                                                          <li><a class="wishlist" href="wishlist.html"></a></li>
                                                          <li><a class="compare" href="compare.html"></a></li>
                                                          <li><a data-toggle="modal" title="Quick View" class="quickview modal-view detail-link" href="#productmodal"></a></li>
                                                      </ul>
                                                  </div>
                                              </div>--%>
                                        </div>
                                        <div class="product__content">
                                            <h4><a href="single-product.html">Strive Shoulder Pack</a></h4>
                                            <ul class="rating d-flex">
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-lg-4 col-md-4 col-sm-6 col-12">
                                    <div class="product">
                                        <div class="product__thumb">
                                            <a class="first__img" href="single-product.html"><img src="../images/product/1.jpg" alt="product image"></a>

                                            <ul class="prize position__right__bottom d-flex">
                                                <li>$40.00</li>
                                                <li class="old_prize">$55.00</li>
                                            </ul>
                                            <%--  <div class="action">
                                                  <div class="actions_inner">
                                                      <ul class="add_to_links">
                                                          <li><a class="cart" href="cart.html"></a></li>
                                                          <li><a class="wishlist" href="wishlist.html"></a></li>
                                                          <li><a class="compare" href="compare.html"></a></li>
                                                          <li><a data-toggle="modal" title="Quick View" class="quickview modal-view detail-link" href="#productmodal"></a></li>
                                                      </ul>
                                                  </div>
                                              </div>--%>
                                        </div>
                                        <div class="product__content">
                                            <h4><a href="single-product.html">Strive Shoulder Pack</a></h4>
                                            <ul class="rating d-flex">
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="col-lg-4 col-md-4 col-sm-6 col-12">
                                    <div class="product">
                                        <div class="product__thumb">
                                            <a class="first__img" href="single-product.html"><img src="../images/product/1.jpg" alt="product image"></a>

                                            <ul class="prize position__right__bottom d-flex">
                                                <li>$40.00</li>
                                                <li class="old_prize">$55.00</li>
                                            </ul>
                                            <%--  <div class="action">
                                                  <div class="actions_inner">
                                                      <ul class="add_to_links">
                                                          <li><a class="cart" href="cart.html"></a></li>
                                                          <li><a class="wishlist" href="wishlist.html"></a></li>
                                                          <li><a class="compare" href="compare.html"></a></li>
                                                          <li><a data-toggle="modal" title="Quick View" class="quickview modal-view detail-link" href="#productmodal"></a></li>
                                                      </ul>
                                                  </div>
                                              </div>--%>
                                        </div>
                                        <div class="product__content">
                                            <h4><a href="single-product.html">Strive Shoulder Pack</a></h4>
                                            <ul class="rating d-flex">
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li class="on"><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                                <li><i class="fa fa-star-o"></i></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Single Product -->


                            </div>
                            <ul class="wn__pagination">
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#"><i class="zmdi zmdi-chevron-right"></i></a></li>
                            </ul>
                        </div>
                        <div class="shop-grid tab-pane fade" id="nav-list" role="tabpanel">
                            <div class="list__view__wrapper">
                                <!-- Start Single Product -->
                                <div class="list__view">
                                    <div class="thumb">
                                        <a class="first__img" href="single-product.html"><img src="../images/product/1.jpg" alt="product images"></a>
                                        <a class="second__img animation1" href="single-product.html"><img src="../images/product/2.jpg" alt="product images"></a>
                                    </div>
                                    <div class="content">
                                        <h2><a href="single-product.html">adipiscing</a></h2>
                                        <ul class="rating d-flex">
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                        </ul>
                                        <ul class="prize__box">
                                            <li>$111.00</li>
                                            <li class="old__prize">$220.00</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.</p>
                                        <ul class="cart__action d-flex">
                                            <li class="cart"><a href="cart.html">Add to cart</a></li>
                                            <li class="wishlist"><a href="cart.html"></a></li>
                                            <li class="compare"><a href="cart.html"></a></li>
                                        </ul>

                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="list__view mt--40">
                                    <div class="thumb">
                                        <a class="first__img" href="single-product.html"><img src="../images/product/2.jpg" alt="product images"></a>
                                        <a class="second__img animation1" href="single-product.html"><img src="../images/product/4.jpg" alt="product images"></a>
                                    </div>
                                    <div class="content">
                                        <h2><a href="single-product.html">Voyage Yoga Bag</a></h2>
                                        <ul class="rating d-flex">
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                        </ul>
                                        <ul class="prize__box">
                                            <li>$111.00</li>
                                            <li class="old__prize">$220.00</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.</p>
                                        <ul class="cart__action d-flex">
                                            <li class="cart"><a href="cart.html">Add to cart</a></li>
                                            <li class="wishlist"><a href="cart.html"></a></li>
                                            <li class="compare"><a href="cart.html"></a></li>
                                        </ul>

                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="list__view mt--40">
                                    <div class="thumb">
                                        <a class="first__img" href="single-product.html"><img src="../images/product/3.jpg" alt="product images"></a>
                                        <a class="second__img animation1" href="single-product.html"><img src="../images/product/6.jpg" alt="product images"></a>
                                    </div>
                                    <div class="content">
                                        <h2><a href="single-product.html">Impulse Duffle</a></h2>
                                        <ul class="rating d-flex">
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                        </ul>
                                        <ul class="prize__box">
                                            <li>$111.00</li>
                                            <li class="old__prize">$220.00</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.</p>
                                        <ul class="cart__action d-flex">
                                            <li class="cart"><a href="cart.html">Add to cart</a></li>
                                            <li class="wishlist"><a href="cart.html"></a></li>
                                            <li class="compare"><a href="cart.html"></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="list__view mt--40">
                                    <div class="thumb">
                                        <a class="first__img" href="single-product.html"><img src="../images/product/4.jpg" alt="product images"></a>
                                        <a class="second__img animation1" href="single-product.html"><img src="../images/product/6.jpg" alt="product images"></a>
                                    </div>
                                    <div class="content">
                                        <h2><a href="single-product.html">Strive Shoulder Pack</a></h2>
                                        <ul class="rating d-flex">
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                        </ul>
                                        <ul class="prize__box">
                                            <li>$111.00</li>
                                            <li class="old__prize">$220.00</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.</p>
                                        <ul class="cart__action d-flex">
                                            <li class="cart"><a href="cart.html">Add to cart</a></li>
                                            <li class="wishlist"><a href="cart.html"></a></li>
                                            <li class="compare"><a href="cart.html"></a></li>
                                        </ul>

                                    </div>
                                </div>
                                <!-- End Single Product -->
                                <!-- Start Single Product -->
                                <div class="list__view mt--40">
                                    <div class="thumb">
                                        <a class="first__img" href="single-product.html"><img src="../images/product/5.jpg" alt="product images"></a>
                                        <a class="second__img animation1" href="single-product.html"><img src="../images/product/9.jpg" alt="product images"></a>
                                    </div>
                                    <div class="content">
                                        <h2><a href="single-product.html">Strive Shoulder Pack</a></h2>
                                        <ul class="rating d-flex">
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li class="on"><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                            <li><i class="fa fa-star-o"></i></li>
                                        </ul>
                                        <ul class="prize__box">
                                            <li>$111.00</li>
                                            <li class="old__prize">$220.00</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.</p>
                                        <ul class="cart__action d-flex">
                                            <li class="cart"><a href="cart.html">Add to cart</a></li>
                                            <li class="wishlist"><a href="cart.html"></a></li>
                                            <li class="compare"><a href="cart.html"></a></li>
                                        </ul>

                                    </div>
                                </div>
                                <!-- End Single Product -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Shop Page -->

</div>

<script src="../js/vendor/jquery-3.2.1.min.js"></script>
<script src="../js/popper.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/plugins.js"></script>
<script src="../js/active.js"></script>
</body>
</html>
