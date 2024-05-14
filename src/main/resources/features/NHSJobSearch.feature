Feature: NHS Jobs Search Functionality

  @Smoke
  Scenario: Search for a job with preferences and verify sorting by newest date posted
    Given I am a jobSeeker on NHS Jobs website
    When I put my preferences into the Search functionality
    Then I should get a list of jobs which matches my preferences
    And the search results should be sorted by the newest Date Posted