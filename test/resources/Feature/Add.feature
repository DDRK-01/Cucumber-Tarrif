
Feature: Add the user informations

  Scenario: 
    #Given launch the browser
    #And click the wanted button
    #When I complete fill the details
   # |456|55|48|49|51|55|58|
    #And some other action like submit
    
    #Then check next page displayed or not
   
    Scenario: 
    #Given launch the browser
    # click the wanted button
    #When I complete fill the details now
    #|Rent|456|
    #|Local|55|
    #|National|48|
    #|SMS|49|
    #|Charge|51|
    #|Inter|55|
    #|Pack|58|
    #And some other action like submit
    
    #Then check next page displayed or not
    Scenario: 
   # Given launch the browser
   # And click the wanted button
   # When I complete fill the details now in twoD
   # |Rent|Local|National|SMS|Charge|Inter|Pack|
   # |145|24|25|36|48|51|52|
   # |146|25|35|37|49|52|53|
   #  |147|29|37|38|50|57|52|
   #   |148|28|39|40|42|56|59|
   # And some other action like submit
    
   # Then check next page displayed or not
    
    Scenario: 
   # Given launch the browser
   # And click the wanted button
   # When I complete fill the details now in twoD list
    

    #|145|24|25|36|48|51|52|
   # |146|25|35|37|49|52|53|
     
    #And some other action like submit
    
    #Then check next page displayed or not
     Scenario Outline: 
    Given launch the browser
    And click the wanted button
    When I complete fill the details now in twoD lists "<Rent>","<Local>","<National>","<SMS>","<Charge>","<Inter>","<Pack>",
    And some other action like submit
    
    Then check next page displayed or not
    
    Examples:
    
    |Rent|Local|National|SMS|Charge|Inter|Pack|
    |145|24|25|36|48|51|52|
    |146|25|35|37|49|52|53|
     

  

  