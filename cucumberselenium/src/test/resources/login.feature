Feature: test login

Scenario: Login with valid data

Given user open the application
When user enters un and psd
Then user click ok 
And Verify login success 

