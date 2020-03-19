package SeleniumSessions;

public class CustomCSS {

	public static void main(String[] args) {

		//1. id --> #id
		//2. class --> .class
		
		// #username
		// input#username
		// .form-control.private-form__control.login-email
		// .login-email
		// input.login-email
		// input.form-control.private-form__control.login-email
		// #username.login-email
		// input#username.login-email
		// input.login-email#username
		
		// htmaltag[prop='value']
		// input[id='username']
		// input[id='username'][type='email']
		
		//contains the text in css:
		// input[id*='user']
		// input[id*='name']
		
		//starting the text:
		// input[id^='user']
		
		//ending the text:
		// input[id$='name']
		
		// div.private-form__input-wrapper input#username
		// div.private-form__input-wrapper > input#username
		// ul.l-nav-list.nav-main-menu li.nav-main-item
		
		//comma in css:
		// div.private-form__input-wrapper, input#username
		//input#username, input#password
		
		//first-of-type in css:
		// ul.footer-nav li:first-of-type
		
		// ul.footer-nav li:last-of-type
		
		// ul li:first-of-type a
		// ul li:last-of-type a
		
		//nth-of-type
		// ul li:nth-of-type(n) -- all elements
		// ul li:nth-of-type(1) -- 1st element
		
		//sibling of element:
		// div.private-form__input-wrapper + div
		// ul li:nth-of-type(3) + li a
		
		//not operator in css:
		// input.form-control.private-form__control:not(.login-password)
		// input.form-control.private-form__control:not(#password)
		
	}

}
