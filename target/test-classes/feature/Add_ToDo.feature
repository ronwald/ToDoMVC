Feature: Manage my todo list
  In order to remember the things I want to do, as a ToDo MVC user,
	I want to manage my todo list


Scenario: Successful adding of ToDo
Given user is on ToDo MVC homepage
When user adds a new ToDo in textbox
And user clicks Enter in keyboard
Then new ToDo is displayed

Scenario: Successful viewing of ToDo
When user clicks 'Active'
Then list of 'Active' ToDo is/are displayed

Scenario: Successful completing of ToDo
When there is/are 'Active' ToDo
And user clicks radio button beside the 'Active' Todo
Then the active 'Active' ToDo becomes 'Completed' ToDo