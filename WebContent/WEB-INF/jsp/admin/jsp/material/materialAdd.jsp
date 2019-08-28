<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    <%@ include file="/WEB-INF/jsp/admin/top.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#save").click(function(){
				var path = $("#materialUrl").val();
				  if (path.length == 0) {
				      alert("请选择一张图片！");
				      return false;
				  } else {
				      var extStart = path.lastIndexOf('.'),
				          ext = path.substring(extStart, path.length).toUpperCase();
				      if (ext !== '.PNG' && ext !== '.JPG' && ext !== '.JPEG' && ext !== '.GIF'&& ext !== 'BMP') {
				          alert("图片格式不正确！");
				          $("#materialUrl").attr("value","");
				          return false;
				      }
				  }
			});
			
			$("#materialName").change(function(){
				var materialName = $("#materialName").val();
				$.ajax({
					url:"<%=request.getContextPath()%>/materialInsertServlet",
					type:"get",
					data:{"materialInsertName":materialName},
					dataType:"json",//预期的服务器响应的数据类型,处理接收的返回数据
					success:function(mtrNameData){//接收后台的返回数据,0/1。请求后台的servlet 中的方法后，响应回来的值，data就是这个值。然后根据dataType参数进行处理后的数据
						if(mtrNameData.status == 0){
							 $("#msg").hide();
							 $("#save").attr("disabled", false);
						}else{
							$("#msg").show();
							$("#save").attr("disabled", true); 
						}
					} 
				});
			});
		});
	</script>
</head>
<body>
	<div id="rightContent">
         <div class="panel panel-default" >
			 <div class="panel-heading">
				<h4 class="panel-title"><fmt:message key="material.addMaterial"></fmt:message></h4>
			</div>
			
			<div class="panel-body" style="padding-left: 20%;">
				<div class="container-fluid">
					<form class="form-horizontal" action="<%=request.getContextPath()%>/materialHandler/material" method="POST" enctype="multipart/form-data">
						<div class="form-group ">
							<label for="mtrName" class="col-xs-3 control-label"><fmt:message key="material.materialName"></fmt:message>：</label>
							<div class="col-xs-8 ">
								<input type="text" class="form-control input-sm duiqi" id="materialName" name="materialName" placeholder="" style="float:left;" required="required">
								<p id="msg" style="display:none; color:red; margin-top:7px;">* 该用户名已存在</p>
							</div>
						</div>
						<div class="form-group ">
							<label for="mtrUrl" class="col-xs-3 control-label"><fmt:message key="material.materialUrl"></fmt:message>：</label>
							<div class="col-xs-8 ">
								<input type="file" class="input-sm duiqi" id="materialUrl" name="file" placeholder="" style="height:35px;"  multiple="multiple" accept=".jpg">
							</div>
						</div>
						<!-- 按钮 -->
						<div class="modal-footer">
							  <%String refererPage = request.getHeader("REFERER");%>
     						  <input type="button" id="back" name="back" class="button_return" value="<fmt:message key="material.cancel"></fmt:message>" onclick="javascript:window.location='<%=refererPage%>'">
							<input type="submit" id="save" value="<fmt:message key="material.save"></fmt:message>"></input>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>