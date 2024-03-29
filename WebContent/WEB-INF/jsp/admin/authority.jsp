<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>权限管理</title>
</head>
<body>

					<div class="check-div">
						<button class="btn btn-yellow btn-xs" data-toggle="modal"
							data-target="#addChar">添加权限</button>
					</div>
					<div class="data-div">
						<div class="row tableHeader">
							<div class="col-xs-1 ">编码</div>
							<div class="col-xs-4">权限名</div>
							<div class="col-xs-5">描述</div>
							<div class="col-xs-2">操作</div>
						</div>
						<div class="tablebody">
							<div class="row">
								<div class="col-xs-1 ">1</div>
								<div class="col-xs-4">
									</span><span>超级管理员</span>
								</div>
								<div class="col-xs-5">超级管理员具有超级权限</div>
								<div class="col-xs-2">
									<button class="btn btn-success btn-xs" data-toggle="modal"
										data-target="#changeChar">修改</button>
									<button class="btn btn-danger btn-xs" data-toggle="modal"
										data-target="#deleteChar">删除</button>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-1 ">2</div>
								<div class="col-xs-4">
									<span>游客</span>
								</div>
								<div class="col-xs-5">可以查看信息</div>
								<div class="col-xs-2">
									<button class="btn btn-success btn-xs">修改</button>
									<button class="btn btn-danger btn-xs">删除</button>
								</div>
							</div>

						</div>

					</div>
					<!--页码块-->
					<footer class="footer">
						<%@ include file="footer.jsp"%>
					</footer>
					<!--增加权限弹出窗口-->
					<div class="modal fade" id="addChar" role="dialog"
						aria-labelledby="gridSystemModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="gridSystemModalLabel">添加权限</h4>
								</div>
								<div class="modal-body">
									<div class="container-fluid">
										<form class="form-horizontal">
											<div class="form-group ">
												<label for="sName" class="col-xs-3 control-label">权限名：</label>
												<div class="col-xs-6 ">
													<input type="email" class="form-control input-sm duiqi"
														id="sName" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="sLink" class="col-xs-3 control-label">描述：</label>
												<div class="col-xs-6 ">
													<textarea class="form-control input-sm duiqi"></textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="sOrd" class="col-xs-3 control-label">系统资源：</label>
												<div class="col-xs-6">
													<input type="" class="form-control input-sm duiqi"
														id="sOrd" placeholder="">
												</div>
											</div>

										</form>
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-xs btn-white"
										data-dismiss="modal">取 消</button>
									<button type="button" class="btn btn-xs btn-green">保 存</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->

					<!--修改权限弹出窗口-->
					<div class="modal fade" id="changeChar" role="dialog"
						aria-labelledby="gridSystemModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="gridSystemModalLabel">修改权限</h4>
								</div>
								<div class="modal-body">
									<div class="container-fluid">
										<form class="form-horizontal">
											<div class="form-group ">
												<label for="sName" class="col-xs-3 control-label">权限名：</label>
												<div class="col-xs-6 ">
													<input type="email" class="form-control input-sm duiqi"
														id="sName" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="sLink" class="col-xs-3 control-label">描述：</label>
												<div class="col-xs-6 ">
													<textarea class="form-control input-sm duiqi"></textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="sOrd" class="col-xs-3 control-label">系统资源：</label>
												<div class="col-xs-6">
													<input type="" class="form-control input-sm duiqi"
														id="sOrd" placeholder="">
												</div>
											</div>

										</form>
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-xs btn-white"
										data-dismiss="modal">取 消</button>
									<button type="button" class="btn btn-xs btn-green">保 存</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->

					<!--弹出删除权限警告窗口-->
					<div class="modal fade" id="deleteChar" role="dialog"
						aria-labelledby="gridSystemModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
								</div>
								<div class="modal-body">
									<div class="container-fluid">确定要删除该权限？删除后不可恢复！</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-xs btn-white"
										data-dismiss="modal">取 消</button>
									<button type="button" class="btn btn-xs btn-danger">保
										存</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->

</body>
</html>