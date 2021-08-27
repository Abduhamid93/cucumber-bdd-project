Feature: User registration

  Scenario: Registering a single user
    Given I am on homepage
    When I click on sign in button
    And I enter a valid email
    Then I should be able to register with the following details
      | First name | Last name | Password | Address               | City       | Zip   | Phone no    |
      | Joe        | Doe       | jdoe1113 | 12 Observatory Circle | Washington | 20000 | 12026666666 |

  
  Scenario Outline: Registering multiple user
    Given I am on homepage
    When I click on sign in button
    And I enter a valid email
    Then I should be able to register with the following details
      | First name   | Last name   | Password   | Address   | City   | Zip   | Phone no   |
      | <first name> | <last name> | <password> | <address> | <city> | <zip> | <phone no> |

    Examples: 
      | first name | last name | password     | address                  | city         | zip   | phone no     |
      | Lindi      | Battersby | yN72ic       | 863 Hovde Center         | Changfeng    | 12342 | 834-836-7898 |
      | Dix        | Lansdowne | CQDhln       | 485 Nancy Place          | Mosrentgen   | 39123 | 955-501-7994 |
      | Celesta    | Kyles     | H6QPVwB      | 42 Briar Crest Court     | Ipoh         | 30532 | 731-113-9441 |
      | Barbey     | Oakton    | maZ5enEgWP1  | 23697 Di Loreto Crossing | Miura        | 89424 | 471-890-3748 |
      | Mei        | Corradi   | 1mYEhK       | 019 Karstens Alley       | Nahavand     | 31231 | 286-815-6432 |
      | Hamel      | Goodinge  | 0aajDezjauut | 806 Sutteridge Trail     | Aborlan      | 53022 | 601-309-6487 |
      | Pace       | Writtle   | 0FgchsP      | 0551 Spohn Crossing      | Bangad       | 84112 | 379-336-0400 |
      | Elke       | Sellwood  | EdjRcTbQYF17 | 07 Grim Trail            | Cayang       | 60122 | 188-771-1224 |
      | Max        | Cayser    | kEcdR3nOZp   | 44077 Sage Road          | Kolonia Town | 12131 | 549-337-8286 |
      | Edith      | Flipek    | 7ByecBn4tDz  | 85 Hayes Court           | Zhetian      | 12123 | 444-910-3117 |
      | Devondra   | Averall   | QlQrXFGn6    | 2505 Quincy Way          | Indralayang  | 42123 | 284-783-9746 |
      | Leeanne    | Stonary   | n00qyAB7J7   | 84 Homewood Junction     | Lalian       | 35470 | 333-338-0589 |
      | Ula        | Avard     | zauM0qPIzZ   | 1 Division Junction      | Siguinon     | 65422 | 719-117-4810 |
      | Sterling   | Yurocjhin | moQfuih17U   | 54 Chive Trail           | Imus         | 41032 | 850-900-3180 |
      | Nilson     | Basillon  | hwhW8tf4n2DW | 97585 Dawn Street        | Bayeux       | 14409 | 284-898-6960 |
