$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/AutomationDemo/Register2.feature");
formatter.feature({
  "line": 1,
  "name": "For Parameter Automation",
  "description": "",
  "id": "for-parameter-automation",
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
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Reg_stepdef.I_open_chrome()"
});
formatter.result({
  "duration": 2951769008,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "To pass value in test case",
  "description": "",
  "id": "for-parameter-automation;to-pass-value-in-test-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I navigate to url \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I give First Name as \"Rohini\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I give Last Name as \"Bangar\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I give Address as \"Pune,Maharashtra\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Give email_id as \"rohinikhr@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on submit",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.automationtesting.in/Register.html",
      "offset": 19
    }
  ],
  "location": "Reg_stepdef.i_navigate_to_url(String)"
});
formatter.result({
  "duration": 16725335727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rohini",
      "offset": 22
    }
  ],
  "location": "Reg_stepdef.i_give_First_Name_as(String)"
});
formatter.result({
  "duration": 230017367,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangar",
      "offset": 21
    }
  ],
  "location": "Reg_stepdef.i_give_Last_Name_as(String)"
});
formatter.result({
  "duration": 676230111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pune,Maharashtra",
      "offset": 19
    }
  ],
  "location": "Reg_stepdef.i_give_Address_as(String)"
});
formatter.result({
  "duration": 160912411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rohinikhr@gmail.com",
      "offset": 18
    }
  ],
  "location": "Reg_stepdef.give_email_id_as(String)"
});
formatter.result({
  "duration": 292111750,
  "status": "passed"
});
formatter.match({
  "location": "Reg_stepdef.I_click_on_submit()"
});
formatter.result({
  "duration": 126178289,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "to check with multipel test data",
  "description": "",
  "id": "for-parameter-automation;to-check-with-multipel-test-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I navigate to url \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I give First Name as \"\u003cfname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I give Last Name as \"\u003clname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I give Address as \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Give email_id as \"\u003cemail\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "for-parameter-automation;to-check-with-multipel-test-data;",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "address",
        "email"
      ],
      "line": 23,
      "id": "for-parameter-automation;to-check-with-multipel-test-data;;1"
    },
    {
      "cells": [
        "raj",
        "shinde",
        "Nashik",
        "bhsbc"
      ],
      "line": 24,
      "id": "for-parameter-automation;to-check-with-multipel-test-data;;2"
    },
    {
      "cells": [
        "ram",
        "pansare",
        "dhule",
        "dscd"
      ],
      "line": 25,
      "id": "for-parameter-automation;to-check-with-multipel-test-data;;3"
    },
    {
      "cells": [
        "rajul",
        "bangar",
        "mahad",
        "fsvf"
      ],
      "line": 26,
      "id": "for-parameter-automation;to-check-with-multipel-test-data;;4"
    },
    {
      "cells": [
        "rahul",
        "kad",
        "shirur",
        "cds"
      ],
      "line": 27,
      "id": "for-parameter-automation;to-check-with-multipel-test-data;;5"
    }
  ],
  "keyword": "Examples"
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
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Reg_stepdef.I_open_chrome()"
});
formatter.result({
  "duration": 3219382700,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "to check with multipel test data",
  "description": "",
  "id": "for-parameter-automation;to-check-with-multipel-test-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I navigate to url \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I give First Name as \"raj\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I give Last Name as \"shinde\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I give Address as \"Nashik\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Give email_id as \"bhsbc\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Reg_stepdef.I_open_chrome()"
});
formatter.result({
  "duration": 2634537111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.automationtesting.in/Register.html",
      "offset": 19
    }
  ],
  "location": "Reg_stepdef.i_navigate_to_url(String)"
});
