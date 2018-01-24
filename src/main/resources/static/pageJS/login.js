function checkLogin(){
	if(loginForm.username.value==""){
		alert("请输入账号");loginForm.username.focus();
		return false;
	}
	if(loginForm.password.value==""){
		alert("请输入账号密码");loginForm.password.focus();
		return false;
	}
	var count=0;
	var autho=document.getElementsByName("usertype");
	for(i=0;i<autho.length;i+=1){
		if(autho[i].checked){
			count+=1;
		}
	}
	if(count==0){
		alert("请选择登录方式");
		return false;
	}
}