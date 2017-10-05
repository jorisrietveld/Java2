# Assignments Index
Assignments for this week:
 - 7.1 to 7.34

# Assignment Solutions
 - **Exercise 7.1 Add several comments to the sales item while keeping an eye on the inspector 
   for the comments list. Make sure the list behaves as expected (that is, its size should increase). 
   You may also like to inspect the elementData field of the ArrayList object.**
   - Nope it doesnt increase. see [SalesClass](OnlineShopJunit/SalesItem.java)
   
 - **Exercise 7.2 Check that the showInfo method correctly prints the item information, including the comments. 
    Try this both for items with and without comments.**
    - Done see: [The test method](OnlineShopJunit/SalesItemTest.java)
    
 - **Exercise 7.3 Check that the getNumberOfComments method works as expected**
    - Done see: [The test method](OnlineShopJunit/SalesItemTest.java)
  
 - **Exercise  7.4 Now check that duplicate authors are correctly handled—i.e., that further comments by the same author  
    are rejected. When trying to add a comment with an author name for whom a comment already exists, the addComment method  
    should  return false**
    . - Yes, Done see: [The test method](OnlineShopJunit/SalesItemTest.java)
    
 - **Exercise 7.5 Perform boundary checking on the rating value. That is, create comments not 
     only with medium ratings, but also with top and bottom ratings. Does this work correctly?**
     - No, Done see: [The test method](OnlineShopJunit/SalesItemTest.java)
     
 - **Exercise 7.6 Good boundary testing also involves testing values that lie just beyond the valid 
     range of data. Test 0 and 6 as rating values. In both cases, the comment should be rejected  
     ( addComment should return false, and the comment should not be added to the comment list).**
     - No, fixed see: [The sales item](OnlineShopJunit/SalesItem.java)
     
 - **Exercise  7.7 Test the upvoteComment and downvoteComment methods. Make sure that the vote balance is correctly counted.**
     
 - **Exercise 7.8 Use the  upvoteComment and downvoteComment methods to mark some comments  as  more  or  less  helpful.  
    Then  test  the findMostHelpfulComment method. This method should return the comment that was voted most helpful. 
    You will notice that the method  returns  an  object  reference.  You  can  use  the Inspect function  in  the  
    method  result dialog to check whether the correct comment was returned. Of course, you will need to know 
     which is the correct comment in order to check whether you get the right result!**
     -
 - **Exercise 7.9 Do boundary testing of the findMostHelpfulComment method. That is, call this method when the comments 
    list is empty (no comments have been added). Does this work as expected?**
    
 - **Exercise 7.10 The tests in the exercises above should have uncovered two bugs in our  
     code. Fix them. After fixing these errors, is it safe to assume that all previous tests will still work 
     as before? Section 7.4 will discuss some of the testing issues that arise when software is cor-
     rected or enhanced.**
     
 - **Exercise 7.11 Which of the test cases mentioned in the previous exercises are positive tests and which are negative? Make a table of each category. Can you think of further positive tests? Can you think of further negative ones?**
 
 - **Exercise 7.12 Run the tests in your project, using the Run Tests button. You should see a window similar to Figure 7.4, summarizing the results of the tests.**
 
 - **Exercise 7.13 Create a test class for the Comment class in the online-shop-junit project.**
 
 - **Exercise 7.14 What methods are created automatically when a new test class is created?**
 
 - **Exercise 7.15 Create a test to check that addComment returns false when a comment from the same author already exists.**
 
 - **Exercise 7.16 Create a test that performs negative testing on the boundaries of the rating range. That is, test the values 0 and 6 as a rating (the values just outside the legal range). We expect these to return false , so assert false in the result dialog. You will notice that one of these actually (incorrectly) returns true . This is the bug we uncovered earlier in manual test- ing. Make sure that you assert false anyway. The assertion states the expected result, not the actual result.**
 - **Exercise 7.17 Run all tests again. Explore how the Test Result dialog displays the failed test. Select the failed test in the list. What options do you have available to explore the details of the failed test?**
 - **Exercise 7.18 Create a test class that has Comment as its reference class. Create a test that checks whether the author and rating details are stored correctly after creation. Record separate tests that check whether the upvote and downvote methods work as expected.**
 - **Exercise 7.19 Create tests for SalesItem that test whether the findMostHelpfulCom- ment method works as expected. Note that this method returns a Comment object. During your testing, you can use the Get button in the method result dialog to get the result object onto the object bench, which then allows you to make further method calls and add assertions for this object. This allows you to identify the comment object returned (e.g., by checking its author). You can also assert that the result is null or not null , depending on what you expect.**
 - **Exercise 7.20 Add further automated tests to your project until you reach a point where you are reasonably confident of the correct operation of the classes. Use both positive and nega- tive tests. If you discover any errors, be sure to record tests that guard against recurrence of these errors in later versions.**
 - **Exercise 7.21 Make sure the classes in the project are compiled, and then create a CalcEngineTester object within BlueJ. Call the testAll method. What is printed in the terminal window? Do you believe the final line of what it says?**
 - 7.22
 - 7.23
 - 7.24
 - 7.25
 - 7.26
 - 7.27
 - 7.28
 - 7.29
###7.30
 - 7.31
 - 7.32
 - 7.33
 - 7.34