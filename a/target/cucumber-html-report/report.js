$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ShoppingCart.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping cart on an e-commerce website",
  "description": "",
  "id": "shopping-cart-on-an-e-commerce-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in and sign out",
  "description": "",
  "id": "shopping-cart-on-an-e-commerce-website;sign-in-and-sign-out",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open automationpractice website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I sign in",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I sign out",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCart.i_open_automationpractice_website()"
});
formatter.result({
  "duration": 9733381914,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCart.i_sign_in()"
});
formatter.result({
  "duration": 2808300342,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027ADITYA-LAPTOP\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\aditya.p\\AppData\\Local\\Temp\\scoped_dir1932_31061}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d67.0.3396.99, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 426da2995c016ac42ecf91ed086715e2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:100)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat modules.SignInAction.Execute(SignInAction.java:21)\r\n\tat step_definitions.ShoppingCart.i_sign_in(ShoppingCart.java:47)\r\n\tat ✽.And I sign in(features/ShoppingCart.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ShoppingCart.i_sign_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("features/seleniumframework.feature");
formatter.feature({
  "line": 1,
  "name": "Access seleniumframework.com website",
  "description": "Use selenium java with cucumber-jvm and navigate to website",
  "id": "access-seleniumframework.com-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Print title, url",
  "description": "",
  "id": "access-seleniumframework.com-website;print-title,-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open seleniumframework website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I validate title and URL",
  "keyword": "Then "
});
formatter.match({
  "location": "BlankStepDefs.i_open_seleniumframework_website()"
});
formatter.result({
  "duration": 11710550796,
  "status": "passed"
});
formatter.match({
  "location": "BlankStepDefs.i_print_title_and_URL()"
});
formatter.result({
  "duration": 52244063,
  "status": "passed"
});
});