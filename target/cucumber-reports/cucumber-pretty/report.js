$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchSalary.feature");
formatter.feature({
  "line": 2,
  "name": "As Deel user I want to search for salaries",
  "description": "",
  "id": "as-deel-user-i-want-to-search-for-salaries",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.before({
  "duration": 2893238900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As Deel user I want to search a salary for a specific role inside a country",
  "description": "",
  "id": "as-deel-user-i-want-to-search-for-salaries;as-deel-user-i-want-to-search-a-salary-for-a-specific-role-inside-a-country",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SearchSalaryInCountry"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Deel salary page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select QA Engineer as role",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select Canada as country",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on search",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Chart results for role QA Engineer in country Canada should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SalaryPageStepsDefinition.i_am_on_deel_salary_website()"
});
formatter.result({
  "duration": 3173982100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA Engineer",
      "offset": 9
    }
  ],
  "location": "SalaryPageStepsDefinition.select_role(String)"
});
formatter.result({
  "duration": 365015500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Canada",
      "offset": 9
    }
  ],
  "location": "SalaryPageStepsDefinition.select_country(String)"
});
formatter.result({
  "duration": 249827200,
  "status": "passed"
});
formatter.match({
  "location": "SalaryPageStepsDefinition.click_on_search()"
});
formatter.result({
  "duration": 146777500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA Engineer",
      "offset": 23
    },
    {
      "val": " Canada",
      "offset": 45
    }
  ],
  "location": "SalaryPageStepsDefinition.right_chart_displayed(String,String)"
});
formatter.result({
  "duration": 1217167800,
  "status": "passed"
});
formatter.after({
  "duration": 1470179300,
  "status": "passed"
});
});