$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyProfile.feature");
formatter.feature({
  "line": 1,
  "name": "Prodia Mobile",
  "description": "",
  "id": "prodia-mobile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user can View profile",
  "description": "",
  "id": "prodia-mobile;user-can-view-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on login dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user tap Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user input username \"ferysadewaa@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user input password \"Fery1304\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user tap button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user on homepage dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user tap icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user on page Account",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user tap profile",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user on page Profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin_stepDef.userOnLoginDashboard()"
});
formatter.result({
  "duration": 12937014911,
  "error_message": "java.lang.AssertionError:  did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.SIgninpage.userOnLoginDashboard(SIgninpage.java:30)\n\tat steps.Signin_stepDef.userOnLoginDashboard(Signin_stepDef.java:24)\n\tat ✽.Given user on login dashboard(MyProfile.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "Signin_stepDef.userTapLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ferysadewaa@gmail.com",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fery1304",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userTapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userOnHomepageDashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapIconProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "user can change photo profile, edit addres and delete addres",
  "description": "",
  "id": "prodia-mobile;user-can-change-photo-profile,-edit-addres-and-delete-addres",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user on login dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user tap Login button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user input username \"ferysadewaa@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user input password \"Fery1304\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user tap button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user on homepage dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user tap icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user on page Account",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user tap profile",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user on page Profile",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user tap symbol cam on icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user tap take photo",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user tap button take photo",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user tap ok",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user on page Profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin_stepDef.userOnLoginDashboard()"
});
formatter.result({
  "duration": 6044811284,
  "error_message": "java.lang.AssertionError:  did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.SIgninpage.userOnLoginDashboard(SIgninpage.java:30)\n\tat steps.Signin_stepDef.userOnLoginDashboard(Signin_stepDef.java:24)\n\tat ✽.Given user on login dashboard(MyProfile.feature:18)\n",
  "status": "failed"
});
formatter.match({
  "location": "Signin_stepDef.userTapLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ferysadewaa@gmail.com",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fery1304",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userTapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userOnHomepageDashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapIconProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapSymbolCamOnIconProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapTakePhoto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapButtonTakePhoto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 35,
  "name": "user can add address, edit addres and delete addres",
  "description": "",
  "id": "prodia-mobile;user-can-add-address,-edit-addres-and-delete-addres",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user on login dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user tap Login button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user input username \"ferysadewaa@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user input password \"Fery1304\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user tap button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user on homepage dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user tap icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user on page Account",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user tap Address List",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user on page My Address",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user tap add Address",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user tap search address and input \"jalan kober gang mawar no 2 purwokerto\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user tap address selected from list",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user tap save button on page address",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user on page add address",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user input address name \"My Home At Purwokerto\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user input additional Notes \"Not add Notes\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user click add Address Button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user on page My Address",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin_stepDef.userOnLoginDashboard()"
});
formatter.result({
  "duration": 8968410428,
  "error_message": "java.lang.AssertionError:  did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.SIgninpage.userOnLoginDashboard(SIgninpage.java:30)\n\tat steps.Signin_stepDef.userOnLoginDashboard(Signin_stepDef.java:24)\n\tat ✽.Given user on login dashboard(MyProfile.feature:36)\n",
  "status": "failed"
});
formatter.match({
  "location": "Signin_stepDef.userTapLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ferysadewaa@gmail.com",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fery1304",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userTapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userOnHomepageDashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapIconProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 57,
  "name": "user can edit addres and delete addres",
  "description": "",
  "id": "prodia-mobile;user-can-edit-addres-and-delete-addres",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "user on login dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "user tap Login button",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "user input username \"ferysadewaa@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user input password \"Fery1304\"",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user tap button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "user on homepage dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user tap icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "user on page Account",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user tap Address List",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "user on page My Address",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "user tap other option",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "user tap Edit Address",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "user on page edit address",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "user input address name \"My Kost At Jakarta\"",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "user tap address detail",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "user tap search address and input \"Aufa Residence\"",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "user tap address selected from list",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "user tap save button on page address",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "user input additional Notes \"EDIT\"",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user save buton on edit address",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user on page My Address",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin_stepDef.userOnLoginDashboard()"
});
formatter.result({
  "duration": 32737914,
  "error_message": "java.lang.AssertionError:  did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.SIgninpage.userOnLoginDashboard(SIgninpage.java:30)\n\tat steps.Signin_stepDef.userOnLoginDashboard(Signin_stepDef.java:24)\n\tat ✽.Given user on login dashboard(MyProfile.feature:58)\n",
  "status": "failed"
});
formatter.match({
  "location": "Signin_stepDef.userTapLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ferysadewaa@gmail.com",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fery1304",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userTapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userOnHomepageDashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapIconProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 82,
  "name": "user can delete addres",
  "description": "",
  "id": "prodia-mobile;user-can-delete-addres",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 81,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "user on login dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 84,
  "name": "user tap Login button",
  "keyword": "When "
});
formatter.step({
  "line": 85,
  "name": "user input username \"ferysadewaa@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "user input password \"Fery1304\"",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "user tap button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "user on homepage dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "user tap icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "user on page Account",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "user tap Address List",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "user on page My Address",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "user tap other option",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "user tap Delete Address",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "user tap yes,delete address option",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "user on page My Address",
  "keyword": "And "
});
formatter.match({
  "location": "Signin_stepDef.userOnLoginDashboard()"
});
formatter.result({
  "duration": 47000525,
  "error_message": "java.lang.AssertionError:  did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.SIgninpage.userOnLoginDashboard(SIgninpage.java:30)\n\tat steps.Signin_stepDef.userOnLoginDashboard(Signin_stepDef.java:24)\n\tat ✽.Given user on login dashboard(MyProfile.feature:83)\n",
  "status": "failed"
});
formatter.match({
  "location": "Signin_stepDef.userTapLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ferysadewaa@gmail.com",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fery1304",
      "offset": 21
    }
  ],
  "location": "Signin_stepDef.userInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userTapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signin_stepDef.userOnHomepageDashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapIconProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});