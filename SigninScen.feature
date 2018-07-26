Feature: Login

  Scenario Outline: Login to facebook
    Given i enter facebook
    When i enter email<email>
    When i enter password<email>
    When i click login
    Then i should see login page

    Examples: 
      | email           |  | password     |
      | "nan@yahoo.com" |  | "asdas12334" |
      | "nan@google.com" |  | "asda987" |
      | "pran@gmail.com" |  | "zyxvuw987" |
      
