function validateId() {
    const userId = document.getElementById('userid').value;
    const failureMessage = document.querySelector('.failure-message');
    const successMessage = document.querySelector('.success-message');

    // 정규 표현식: 4~12자, 영문 대소문자, 숫자
    const regex = /^[A-Za-z0-9]{4,12}$/;

    if (regex.test(userId)) {
        successMessage.classList.remove('hide');
        failureMessage.classList.add('hide');
        return true;
    } else {
        failureMessage.classList.remove('hide');
        successMessage.classList.add('hide');
        return false;
    }
}

function validatePw() {
    const password1 = document.getElementById('password1').value;
    const pwFail = document.querySelector('.pw-fail');    
    
    const regex = /^[A-Za-z0-9]{4,12}$/;

    // 비밀번호 형식 유효성 검사
    if (regex.test(password1)) {
        pwFail.classList.add('hide');
        return true;
    } else {
        pwFail.classList.remove('hide');
        return false;
    }
}

function checkPw() {
    const password1 = document.getElementById('password1').value;
    const password2 = document.getElementById('password2').value;
    const pwFail = document.querySelector('.pw-fail');    
    const mismatchMessage = document.querySelector('.mismatchMessage');
    const successMessage = document.querySelector('.successMessage');

    const regex = /^[A-Za-z0-9]{4,12}$/;

    // 비밀번호 형식 유효성 검사
    if (regex.test(password1)) {
        pwFail.classList.add('hide');        
    } else {
        pwFail.classList.remove('hide');        
    }

    // 비밀번호 확인 일치 여부 검사
    if (password1 === password2 && password1 !== "") {
        mismatchMessage.classList.add('hide');
        successMessage.classList.remove('hide');
        return true;
    } else {
        mismatchMessage.classList.remove('hide');
        successMessage.classList.add('hide');
        return false;
    }
}

function validatePhoneNumber() {
    const frontNumber = document.querySelector('input[name="frontnumber"]').value;
    const allowedNumbers = ["010", "011", "017", "018", "019"];
    const frontNumberError = document.querySelector('.frontnumber-error');

    if (allowedNumbers.includes(frontNumber)) {
        frontNumberError.classList.add('hide');
        return true;
    } else {
        frontNumberError.classList.remove('hide');
        return false;
    }
}

function validate() {
    const isIdValid = validateId();
    const isPwValid = validatePw();
    const isPwMatch = checkPw();
    const isPhoneValid = validatePhoneNumber();
    
    /*if (!isIdValid || !isPwValid || !isPwMatch || !isPhoneValid) {
        alert("양식에 맞게 기입하세요")
        return false; 
    }*/
	
	if (!isIdValid) {
		alert("아이디 형식이 맞지 않습니다")
        return false; 
	} else if (!isPwValid) {
		alert("비밀번호 형식이 맞지 않습니다")
       return false; 
	} else if (!isPwMatch) {
		alert("비밀번호가 일치하지 않습니다")
       return false; 		
	} else if (!isPhoneValid) {
		alert("핸드폰 앞번호가 양식에 맞지 않습니다")
       return false; 		
	} else {
		return true;	
	}	
    
}