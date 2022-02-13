$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Add_ToDo.feature");
formatter.feature({
  "line": 1,
  "name": "Manage my todo list",
  "description": "In order to remember the things I want to do, as a ToDo MVC user,\r\nI want to manage my todo list",
  "id": "manage-my-todo-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Successful adding of ToDo",
  "description": "",
  "id": "manage-my-todo-list;successful-adding-of-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on ToDo MVC homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user adds a new ToDo in textbox",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks Enter in keyboard",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "new ToDo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_ToDo_MVC_List.user_is_on_ToDo_MVC_homepage()"
});
formatter.result({
  "duration": 2472823300,
  "status": "passed"
});
formatter.match({
  "location": "Add_ToDo_MVC_List.user_adds_a_new_ToDo_in_textbox()"
});
formatter.result({
  "duration": 92783200,
  "status": "passed"
});
formatter.match({
  "location": "Add_ToDo_MVC_List.user_clicks_Enter_in_keyboard()"
});
formatter.result({
  "duration": 49389700,
  "status": "passed"
});
formatter.match({
  "location": "Add_ToDo_MVC_List.new_ToDo_is_displayed()"
});
formatter.result({
  "duration": 3089656900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Successful viewing of ToDo",
  "description": "",
  "id": "manage-my-todo-list;successful-viewing-of-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user clicks \u0027Active\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "list of \u0027Active\u0027 ToDo is/are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_ToDo_MVC_List.user_clicks_Active()"
});
formatter.result({
  "duration": 5203720300,
  "status": "passed"
});
formatter.match({
  "location": "Add_ToDo_MVC_List.list_of_Active_ToDo_is_are_displayed()"
});
formatter.result({
  "duration": 84166200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Successful completing of ToDo",
  "description": "",
  "id": "manage-my-todo-list;successful-completing-of-todo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "there is/are \u0027Active\u0027 ToDo",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks radio button beside the \u0027Active\u0027 Todo",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the active \u0027Active\u0027 ToDo becomes \u0027Completed\u0027 ToDo",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_ToDo_MVC_List.there_is_are_Active_ToDo()"
});
formatter.result({
  "duration": 1949619300,
  "status": "passed"
});
formatter.match({
  "location": "Add_ToDo_MVC_List.user_clicks_radio_button_beside_the_Active_Todo()"
});
formatter.result({
  "duration": 51611700,
  "status": "passed"
});
formatter.match({
  "location": "Add_ToDo_MVC_List.the_active_Active_ToDo_becomes_Completed_ToDo()"
});
formatter.result({
  "duration": 3091569300,
  "status": "passed"
});
});