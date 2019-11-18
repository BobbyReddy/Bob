$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search_veggies.feature");
formatter.feature({
  "line": 1,
  "name": "search for vegetables and add to cart",
  "description": "",
  "id": "search-for-vegetables-and-add-to-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "give the veggie name and search",
  "description": "",
  "id": "search-for-vegetables-and-add-to-cart;give-the-veggie-name-and-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@seleniumTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on greencart page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user searches for \"Cucumber\" vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" results appears",
  "keyword": "Then "
});
formatter.match({
  "location": "veggies_search.user_is_on_greencart_page()"
});
formatter.result({
  "duration": 17663344400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 19
    }
  ],
  "location": "veggies_search.user_searches_for_something_vegetable(String)"
});
formatter.result({
  "duration": 5878994100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "veggies_search.something_results_appears(String)"
});
formatter.result({
  "duration": 176552800,
  "status": "passed"
});
formatter.after({
  "duration": 388956500,
  "status": "passed"
});
});