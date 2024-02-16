Feature: View comments by postID

  @GetCommentsById
  Scenario Outline: View comments by PostID
    When I consume the comments endpoint by "<postId>"
    Then I will be able to view the comments available for the desired PostId

    Examples:
      | postId |
      | 2      |