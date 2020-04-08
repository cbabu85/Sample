Feature: Login to Facebook page

  Scenario: Successful login to Facebook with specified credentials

    When I successfully login to Facebook with email "jasecuframework@gmail.com" and password "Jasecu12"
    Then Facebook Welcome Page is successfully displayed

  Scenario: Successful login to Facebook with default credentials

    When I successfully login to Facebook with default credentials
    Then Facebook Welcome Page is successfully displayed
