<%-- 
    Document   : left-sidebar
    Created on : Jan 11, 2024, 1:21:35 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.*" %>
<%@page import = "dal.*" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    //Get all categories
    CategoryDAO categoryDAO = new CategoryDAO();
    List<Category> allCategories = categoryDAO.getAllCategories();
    pageContext.setAttribute("allCategories", allCategories, PageContext.PAGE_SCOPE);
    
    //Get all brands
    BrandDAO brandDAO = new BrandDAO();
    List<Brand> allBrands = brandDAO.getAllBrands();
    pageContext.setAttribute("allBrands", allBrands, PageContext.PAGE_SCOPE);
%>

<!DOCTYPE html>
<div class="left-sidebar">

    <h2>Category</h2>
    <div class="panel-group category-products" id="accordian"><!--category-productsr-->
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                        Sportswear
                    </a>
                </h4>
            </div>
            <div id="sportswear" class="panel-collapse collapse">
                <div class="panel-body">
                    <ul>
                        <li><a href="#">Nike </a></li>
                        <li><a href="#">Under Armour </a></li>
                        <li><a href="#">Adidas </a></li>
                        <li><a href="#">Puma</a></li>
                        <li><a href="#">ASICS </a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordian" href="#mens">
                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                        Mens
                    </a>
                </h4>
            </div>
            <div id="mens" class="panel-collapse collapse">
                <div class="panel-body">
                    <ul>
                        <li><a href="#">Fendi</a></li>
                        <li><a href="#">Guess</a></li>
                        <li><a href="#">Valentino</a></li>
                        <li><a href="#">Dior</a></li>
                        <li><a href="#">Versace</a></li>
                        <li><a href="#">Armani</a></li>
                        <li><a href="#">Prada</a></li>
                        <li><a href="#">Dolce and Gabbana</a></li>
                        <li><a href="#">Chanel</a></li>
                        <li><a href="#">Gucci</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                        Womens
                    </a>
                </h4>
            </div>
            <div id="womens" class="panel-collapse collapse">
                <div class="panel-body">
                    <ul>
                        <li><a href="#">Fendi</a></li>
                        <li><a href="#">Guess</a></li>
                        <li><a href="#">Valentino</a></li>
                        <li><a href="#">Dior</a></li>
                        <li><a href="#">Versace</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <c:forEach items="${allCategories}" var="item">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title"><a href="#">${item.categoryName}</a></h4>
                </div>
            </div>
        </c:forEach>
        <!--/category-products-->

        <div class="brands_products"><!--brands_products-->
            <h2>Brands</h2>
            <div class="brands-name">
                <ul class="nav nav-pills nav-stacked">
                    <c:forEach items="${allBrands}" var="item">
                        <li><a href="#"> <span class="pull-right">(50)</span>${item.brandName}</a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <!--/brands_products-->

        <div class="price-range"><!--price-range-->
            <h2>Price Range</h2>
            <div class="well text-center">
                <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
            </div>
        </div><!--/price-range-->

        <div class="shipping text-center"><!--shipping-->
            <img src="images/home/shipping.jpg" alt="" />
        </div><!--/shipping-->

    </div>
</div>
