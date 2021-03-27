$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Projects/src/test/java/org/example/myListener/features/WebLogin.feature");
formatter.feature({
  "line": 1,
  "name": "To test Login Functionality",
  "description": "",
  "id": "to-test-login-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasicStepDefination.userIsOnLoginPage()"
});
formatter.result({
  "duration": 227643800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Test login functionality of an Application",
  "description": "",
  "id": "to-test-login-functionality;test-login-functionality-of-an-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user inputs userId as \u0027abcd\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "inputs password as \u00271234\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "hits submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user lands on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u0027abcd\u0027",
      "offset": 22
    }
  ],
  "location": "BasicStepDefination.userInputsUserId(String)"
});
formatter.result({
  "duration": 4764100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u00271234\u0027",
      "offset": 19
    }
  ],
  "location": "BasicStepDefination.inputsPassword(String)"
});
formatter.result({
  "duration": 215700,
  "status": "passed"
});
formatter.match({
  "location": "BasicStepDefination.hitsSubmitButton()"
});
formatter.result({
  "duration": 603000,
  "status": "passed"
});
formatter.match({
  "location": "BasicStepDefination.userLandsOnDashboardPage()"
});
formatter.result({
  "duration": 205900,
  "status": "passed"
});
});