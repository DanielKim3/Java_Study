function validate() {
	 const id = document.getElementById('userid');
	 const pw = document.getElementById('password1');
	 const pwCheck = document.getElementById('password2');
	 const phoneNumber = document.getElementById('frontNumber');
	 const email = document.getElementById('email');
	 
	 const reg1 = /^[A-Za-z0-9]{4,12}$/;
 	 const reg3 = /^(010|011|017|018|019)/;
	 const reg4 = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
	 	
	 
	if(!id.value){
		alert("아이디를 입력하세요");
		return false;
	}
	
	if(!reg1.test(id.value)) {
			alert("아이디 형식에 맞지 않습니다");
			return false;
		}
	
	if(!reg1.test(pw.value)) {
		alert("비밀번호 형식에 맞지 않습니다");
		return false;
	}
	
	if(pw.value !== pwCheck.value) {
			alert("비밀번호가 일치하지 않습니다");
			return false;
		}
	
	if(!reg3.test(phoneNumber.value)) {
		alert("전화번호 앞자리 형식에 맞지 않습니다");
		return false;
	}
	
	if(!reg4.test(email.value)){
		alert("이메일 형식에 맞지 않습니다"); 
 		return false; 
 	}	
}