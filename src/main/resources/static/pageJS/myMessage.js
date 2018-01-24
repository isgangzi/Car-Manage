$(document).ready(function(){
	createTable();
	$('#').bind('click',searchTable);
})

function searchTable(){
	$('#myMessageTable').bootstrapTable('destroy');
	createTable();
}

function createTable() {
			$('#myMessageTable')
					.bootstrapTable(
							{
								url : '/admin/messages', //请求后台的URL（*）
								method : 'get', //请求方式（*）
								toolbar : '#toolbar', //工具按钮用哪个容器
								striped : true, //是否显示行间隔色
								cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
								/*
								 * 分页相关的内容
								 */
								pagination : true, //是否显示分页（*）
								sortable : false, //是否启用排序
								sortOrder : "asc", //排序方式
								queryParams : getParam,//传递参数（*）
								sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
								pageNumber : 1, //初始化加载第一页，默认第一页
								pageSize : 5, //每页的记录行数（*）
								pageList:[5,10,15],
								strictSearch : true,
								minimumCountColumns : 2, //最少允许的列数
								clickToSelect : true, //是否启用点击选中行
								showRefresh : true, //是否显示刷新按钮
								uniqueId : "id", //每一行的唯一标识，一般为主键列
								cardView : false, //是否显示详细视图
								onLoadError : function(data) {
									$('#myMessageTable')
											.bootstrapTable('removeAll');
								},
								columns : [
										{
											valign : "middle",
											checkbox : true,
										},
										{
											field : 'id',
											title : "序号",
											formatter : function(value, row,
													index) {
												var options = $('#myMessageTable')
														.bootstrapTable(
																'getOptions');
												return options.pageSize
														* (options.pageNumber - 1)
														+ index + 1;
											}
										},
										{
											valign : "middle",
											field : 'createtime',
											title : '消息日期'
										},
										{
											valign : "middle",
											field : 'content',
											title : '消息内容'
										},
										{
											valign : "middle",
											field : 'status',
											title : '消息状态'
										},
										{
											field : "id",
											title : "操作",
											align : "center",
											formatter : function(value, row,
													index) {
												return '<button onclick="resetPass(\''
														+ value
														+ '\')" class="btn btn-primary btn-xs">重置密码</button>'
											}
										} ]
							});
		}


function getParam(params) {
	var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
			pageSize : params.limit, //页面大小
			currentPage : params.offset, //页码
		//teacherName : $("#").val(),
	};
	return temp;
}
