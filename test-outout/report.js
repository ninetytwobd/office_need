$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6424939417,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login",
  "description": "",
  "id": "login-functionality;verify-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter user name and password and click signin button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify user login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_am_in_login_page()"
});
formatter.result({
  "duration": 764195575,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enter_user_name_and_password_and_click_signin_button()"
});
formatter.result({
  "duration": 2204343966,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.verify_user_login_successfully()"
});
formatter.result({
  "duration": 681935905,
  "status": "passed"
});
formatter.after({
  "duration": 783484986,
  "status": "passed"
});
});