function createText() {
	var temp = document.getElementById("register_re");
	if (isChecked("re")) {
		temp.style.display = "block";
	} else {
		temp.style.display = "none";
		var tempInput = document.getElementById("recommender");
		var tempInput2 = document.getElementById("recommender2");
		tempInput.value = "";
		tempInput2.value = "";
	}
}
function changeRecommander(tempInput) {
	var tempInputValue = tempInput.value;
	var tempInput2 = document.getElementById("recommender");
	tempInput2.value = tempInputValue;
}
function changeText(){
	var temp = document.getElementById("retext");
	if(isChecked("re")){
		temp.style.display="table-cell";
	}else{
		temp.style.display="none";	
	}
	
	   
}

function validateRegisterForm(form) {
	var nickName = form.nickName.value;
	var passwd = form.passwd.value;
	var passwdre = form.passwdre.value;
	var email = form.email.value;
	var passwdQuestion = form.passwdQuestion.value;
	var passwdAnswer = form.passwdAnswer.value;
	var gender=form.gender.value;
	var provinceCity=form.provinceCity.value;
	var age=form.age.value;
	var phone=form.phone.value;
	var address=form.address.value;
	var authCode=form.authCode.value;
	if (isEmpty(nickName)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	if (isEmpty(passwd)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	if (isEmpty(email)) {
		alert("\u5bf9\u4e0d\u8d77\uff0cE\u2014mail\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	if (isEmpty(passwdQuestion)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u63d0\u793a\u95ee\u9898\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	if (isEmpty(passwdAnswer)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u63d0\u793a\u7b54\u6848\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	
	if(isEmpty(authCode)){
		alert("验证码不能为空");
		return false;
	}else {
		return true;
	}

}





function validateModifyForm(form) {
	var nickName = form.nickName.value;
	var passwd = form.passwd.value;
	var email = form.email.value;
	var passwdQuestion = form.passwdQuestion.value;
	var passwdAnswer = form.passwdAnswer.value;
	var provinceCity=form.provinceCity.value;
	var phone=form.phone.value;
	var address=form.address.value;
	if (isEmpty(oldPasswd)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u65e7\u5bc6\u7801\u4e0d\u53ef\u4e3a\u7a7a");
		return false;
	}
	if (isEmpty(newPasswd)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u65b0\u5bc6\u7801\u4e0d\u53ef\u4e3a\u7a7a");
		return false;
	}
	if (isEmpty(passwdQuestion)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u63d0\u793a\u95ee\u9898\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	if (isEmpty(passwdAnswer)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u63d0\u793a\u7b54\u6848\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		return false;
	}
	if (!isEmail(email)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u60a8\u8f93\u5165E\u2014mail\u65e0\u6548\uff01");
		return false;
	}
	
	
}
function checkGetPasswdForm(form) {
	var userName = form.userName.value;
	var passwdQuestion = form.passwdQuestion.value;
	var passwdAnswer = form.passwdAnswer.value;
	if (/^\s*$/.test(userName)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u7528\u6237\u540d\u4e0d\u53ef\u4ee5\u4e3a\u7a7a\uff01");
		return false;
	}
	if (/^\s*$/.test(passwdQuestion)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u63d0\u793a\u95ee\u9898\u4e0d\u53ef\u4ee5\u4e3a\u7a7a\uff01");
		return false;
	}
	if (/^\s*$/.test(passwdAnswer)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u63d0\u793a\u7b54\u6848\u4e0d\u53ef\u4ee5\u4e3a\u7a7a\uff01");
		return false;
	}
}
function checkLoginForm(form) {
	var userName = form.userName.value;
	var passwd = form.passwd.value;
	if (/^\s*$/.test(userName)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u7528\u6237\u540d\u4e0d\u53ef\u4ee5\u4e3a\u7a7a\uff01");
		return false;
	}
	if (/^\s*$/.tesst(passwd)) {
		alert("\u5bf9\u4e0d\u8d77\uff0c\u5bc6\u7801\u4e0d\u53ef\u4ee5\u4e3a\u7a7a\uff01");
		return false;
	}
}

