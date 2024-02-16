Feature: View comments by postID

  @GetCommentsById
  Scenario: View comments by PostID
    When I consume the comments endpoint by ID
    Then I will be able to view the comments available for the desired PostId