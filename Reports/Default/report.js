$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scholastic/CreateNewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Create a new Teacher Account in Taxable State",
  "description": "",
  "id": "create-a-new-teacher-account-in-taxable-state",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 5147970839,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User can create a new teacher account in taxable state using zip code",
  "description": "",
  "id": "create-a-new-teacher-account-in-taxable-state;user-can-create-a-new-teacher-account-in-taxable-state-using-zip-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I click on create an account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select Teacher/Administrator",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on next1 button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select Mr. as title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \u0027fa\u0027 as first name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \u0027ch\u0027 as last name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \u0027xk9b@gmail.com\u0027 as my email",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \u0027ab12345\u0027 as my password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \u0027776-515-6788\u0027 as mobile number",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I checked terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \u002710012\u0027 as zip code",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select school \u0027Scholastic+book+clubs\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select \u0027Teacher (by Grade)\u0027 as role",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select 1st as Grade",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select \u002710\u0027 as number of student",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select GRL as preferred reading level",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on continue to site button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I minimize bar",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify class same class code is present on home page as well as on My account page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I verify Teacher Name is displayed as expected",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I verify School address is selected as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnCreateAccount()"
});
formatter.result({
  "duration": 480149826,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.selectTeacher()"
});
formatter.result({
  "duration": 189490474,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnnextButton()"
});
formatter.result({
  "duration": 498851525,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.selectTitle()"
});
formatter.result({
  "duration": 419864649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fa",
      "offset": 9
    }
  ],
  "location": "CreateNewAccTaxableSD.enterFirstName(String)"
});
formatter.result({
  "duration": 198784495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch",
      "offset": 9
    }
  ],
  "location": "CreateNewAccTaxableSD.enterlastName(String)"
});
formatter.result({
  "duration": 124178484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xk9b@gmail.com",
      "offset": 9
    }
  ],
  "location": "CreateNewAccTaxableSD.enterEmail(String)"
});
formatter.result({
  "duration": 249294934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab12345",
      "offset": 9
    }
  ],
  "location": "CreateNewAccTaxableSD.enterPassword(String)"
});
formatter.result({
  "duration": 184113126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "776-515-6788",
      "offset": 9
    }
  ],
  "location": "CreateNewAccTaxableSD.enterMobNo(String)"
});
formatter.result({
  "duration": 135472160,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.checkBoxforTerms()"
});
formatter.result({
  "duration": 113334135,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnNextButton()"
});
formatter.result({
  "duration": 103791956,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10012",
      "offset": 9
    }
  ],
  "location": "CreateNewAccTaxableSD.enterZipCode(String)"
});
formatter.result({
  "duration": 606475210,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnSearch()"
});
formatter.result({
  "duration": 102761991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Scholastic+book+clubs",
      "offset": 17
    }
  ],
  "location": "CreateNewAccTaxableSD.selectSchool(String)"
});
formatter.result({
  "duration": 12436608905,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnNextButton()"
});
formatter.result({
  "duration": 79964137,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teacher (by Grade)",
      "offset": 10
    }
  ],
  "location": "CreateNewAccTaxableSD.selectTeacherByGrade(String)"
});
formatter.result({
  "duration": 28241537973,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d88.0.4324.182)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027MacBook-Pro-5.home\u0027, ip: \u0027fd4b:8d38:69ba:1:1cf0:321d:6646:7678%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /var/folders/0x/m7q9c0sx5vg...}, goog:chromeOptions: {debuggerAddress: localhost:53140}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1bca1ee5753dd218c36a6f1242054183\n*** Element info: {Using\u003did, value\u003d//select[@id\u003d\u0027dwfrm_myrole_primaryrole\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat Pages.BasePage$1.apply(BasePage.java:30)\n\tat Pages.BasePage$1.apply(BasePage.java:28)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\n\tat Pages.BasePage.findElementUsingFluentWait(BasePage.java:28)\n\tat Pages.BasePage.selectFromDropdownUsingVisibleText(BasePage.java:75)\n\tat Pages.Scholastic.LandingPage.selectRole(LandingPage.java:129)\n\tat StepDefinition.Scholastic.CreateNewAccTaxableSD.selectTeacherByGrade(CreateNewAccTaxableSD.java:88)\n\tat ✽.And I select \u0027Teacher (by Grade)\u0027 as role(Scholastic/CreateNewAccount.feature:22)\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.selectStudentGrade()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 10
    }
  ],
  "location": "CreateNewAccTaxableSD.selectNoOfStudents(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnNextButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.selectPreferredReadingLevel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.clickOnContinue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.minimizeBar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.verifyClassCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.verifyTeacherName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewAccTaxableSD.verifySchoolAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 23006,
  "status": "passed"
});
});