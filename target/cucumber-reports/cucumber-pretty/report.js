$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyProfile.feature");
formatter.feature({
  "line": 1,
  "name": "My Profile (View Profile, Change Photo, Add Address, Delete Address, Edit, Address \u0026 Delete Address)",
  "description": "",
  "id": "my-profile-(view-profile,-change-photo,-add-address,-delete-address,-edit,-address-\u0026-delete-address)",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user can View profile",
  "description": "",
  "id": "my-profile-(view-profile,-change-photo,-add-address,-delete-address,-edit,-address-\u0026-delete-address);user-can-view-profile",
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
  "name": "user on login dashboard!",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user tap Login button!",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user input username! \"ferysadewaa@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user input password! \"Fery1304\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user tap button!",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user on homepage dashboard!",
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
  "location": "MyProfile_stepDef.userOnLoginDashboard()"
});
formatter.result({
  "duration": 6553816176,
  "error_message": "java.lang.AssertionError:  did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.MyProfilePage.userOnLoginDashboard(MyProfilePage.java:66)\n\tat steps.MyProfile_stepDef.userOnLoginDashboard(MyProfile_stepDef.java:21)\n\tat ✽.Given user on login dashboard!(MyProfile.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ferysadewaa@gmail.com",
      "offset": 22
    }
  ],
  "location": "MyProfile_stepDef.userInputUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fery1304",
      "offset": 22
    }
  ],
  "location": "MyProfile_stepDef.userInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userTapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyProfile_stepDef.userOnHomepageDashboard()"
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
  "line": 18,
  "name": "user can change photo profile",
  "description": "",
  "id": "my-profile-(view-profile,-change-photo,-add-address,-delete-address,-edit,-address-\u0026-delete-address);user-can-change-photo-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user on page Profile",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user tap icon profile",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user on page Account",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user tap profile",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user on page Profile",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user tap symbol cam on icon profile",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user tap take photo",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user tap button take photo",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user tap ok",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user on page Profile",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user click back to Page Account",
  "keyword": "Then "
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageProfile()"
});
formatter.result({
  "duration": 6395471667,
  "error_message": "java.lang.AssertionError: Profile\n did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat pages.MyProfilePage.userOnPageProfile(MyProfilePage.java:165)\n\tat steps.MyProfile_stepDef.userOnPageProfile(MyProfile_stepDef.java:69)\n\tat ✽.Given user on page Profile(MyProfile.feature:19)\n",
  "status": "failed"
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
formatter.match({
  "location": "MyProfile_stepDef.userClickBackToPageAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 32,
  "name": "user can add address",
  "description": "",
  "id": "my-profile-(view-profile,-change-photo,-add-address,-delete-address,-edit,-address-\u0026-delete-address);user-can-add-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user on page Account",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user tap Address List",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user on page My Address",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user tap add Address",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user tap search address column",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user tap search address and input \"jalan kober gang mawar no 2 purwokerto\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user tap address selected from list",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user tap save button on page address",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user on page add address",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user input address name \"My Home At Purwokerto\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user input additional Notes \"Not add Notes\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user click add Address Button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user on page My Address",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user tap back to Page Account from my Addres",
  "keyword": "Then "
});
formatter.match({
  "location": "MyProfile_stepDef.userOnPageAccount()"
});
