# Assignment index 
Assignments for this week:
 - 5.1 to 5.38
 - 5.40 to 4.43
 - 5.46 to 5.70
 - 5.72
 - 5.73
  
# Assignment solutions
 - **5.1 look around**
   - Done 
 
 - **5.2 Investigate the String documentation. Then look at the documentation for some other classes.**
   - **What is the structure of class documentation?**
     - The name of the class
     - An general explanation about the class.
   - **Which sections are common to all class descriptions?**
     An general description about the class, throws info, return types and arguments.
   - **What is their purpose?**
     - Explaining the Java API
   - **The common structure of all class documentation is:**
     - Documentation about the classes attributes: An description and type.
     - Documentation about the classes methods: overloads, return types and what arguments they take.
     - Documentation about the classes Constructors and destructors: an Description, overloads, and what arguments they take.
     
 - **5.3 Look up the startsWith method in the documentation for String. There are two versions. Describe in your own words what they do and the differences between them.**
   - Both take an string as first argument, the optional integer argument shifts the index from witch the 
   sequence gets matched.
   
 - **5.4 Is there a method in the String class that tests whether a string ends with a given suffix? 
       If so, what is it called and what are its parameters and return type?**
   - Jep, 
   ```java 
   String.endsWith( surfix ) 
   ```
   
 - **5.5 Is there a method in the String class that returns the number of characters in the string? 
       If so, what is it called and what are its parameters?**
   - Jep, 
     ```java 
     String.length() 
     ```
   
 - **5.6 If  you  found  methods  for  the  two  tasks  above,  how  did  you  find  them?  Is  it  easy or hard to find methods you are looking for? Why?**
    - Intellij auto complete and crtl+Q
 - **5.7 Find the trim method in the String class’s documentation. Write down the signature of that method. Write down an example call to that method on a String variable called text.**
   - The signature of the trim method: public String trim()
     ```java
     String text = "  Some Text!  ";
     System.out.println( text.trim() );
     ```
 - **5.8 Implement this improvement in your version of the tech-support1 project. Test it to confirm that it is tolerant of extra space around the word ‘bye’.** 
   - Done see file [see file](main/SupportSystem.java), line 43
 
 - **5.9 Improve the code of the SupportSystem class in the tech-support1 project so that case in the input is ignored. Use the String class’s toLowerCase method to do this. Remember that this method will not actually change the String it is called on, but result in the creation of a new one being created with slightly different contents.** 
   - Done see file [see file](main/SupportSystem.java), line 43
 
 - **5.10 Find the equals method in the documentation for class String . What is the return type of this method?**
   - ```java
     boolean
     ```
 
 - **5.11 Change your implementation to use the equals method instead of startsWith .**
   - Done see file [see file](main/SupportSystem.java), line 45
 
 - **5.12 Find the class Random in the Java class library documentation. Which pack- age is it in? What does it do? How do you construct an instance? How do you generate a random number? Note that you will probably not understand everything that is stated in the documentation. Just try to find out what you need to know.**
   - Random is in package: `java.util.Random`
   - It gets pseudo-random bytes.
   
 - **5.13 Write a small code fragment (on paper) that generates a random integer number using this class.**
   - Getting an random integer: 
    ```java 
    (new Random()).nextInt();
    // Or
    Random qbit = new Random();
    random.nextLong();
    ```
    
 - **5.14 Write some code (in BlueJ) to test the generation of random numbers. To do this, create a new class called RandomTester . You can create this class in the tech-support1 project, or you can create a new project for it—it doesn’t matter. In class RandomTester , implement two methods: printOneRandom (which prints out one random number) and printMultiRandom(int howMany) (which has a parameter to specify how many num- bers you want, and then prints out the appropriate number of random numbers).**  
   ```java
   public class nsa
   {
      Random onwillekeurig = new java.util.Random();
   
      public void printRand()
      {
           System.out.printf( "Pseudo-random number generated: %d", onwillekeurig.nextInt() );
      }
   }
   ```
   
 - 5.15 **Find the nextInt method in class Random that allows the target range of random numbers to be specified. What are the possible random numbers that are generated when you call this method with 100 as its parameter?**
     ```java
     public void randomTester()
     {
         return (new Random()).nextInt(6)+1;
     }
     ```
 - 5.16 **Write a method in your RandomTester class called throwDice that re- turns a random number between 1 and 6 (inclusive).**
     ```java
     public void getResponse()
     {
         int rNum = (new Random()).nextInt(3);
         string response = (rNum == 2) ? "maybe" : rNum ? "no" : "yes";
     }
     ```
 - 5.17 **Write a method called getResponse that randomly returns one of the strings "yes" , "no" , or "maybe" .**
    ```java
    public void getResponse()
    {
        int rNum = (new Random()).nextInt(3);
        string response = (rNum == 2) ? "maybe" : rNum ? "no" : "yes";
    }
    ```
 - 5.18 **Extend your getResponse method so that it uses an ArrayList to store an arbitrary number of responses and randomly returns one of them.**
    ```java
    public void getResponse()
    {
        ArrayList response = new ArrayList<>() {{
            add("Some response");
            add("Some other response");
            add("Tunderdome 25 Years of hardcore!!!"); 
        }}
        int rNum = (new Random()).nextInt(3);
        return response.get( nNumb );
    }
    ```
 - 5.19 **Add a method to your RandomTester class that takes a parameter max and generates a random number in the range 1 to max (inclusive).**
    ```java
    public void getResponse()
    {
        ArrayList response = new ArrayList<>() {{
            add("Some response");
            add("Some other response");
            add("Tunderdome 25 Years of hardcore!!!"); 
        }}
        int rNum = (new Random()).nextInt(3);
        return response.get( nNumb );
    }
    ```
 - 5.20 **Add a method to your RandomTester class that takes two parameters, min and max , and generates a random number in the range min to max (inclusive). Rewrite the body of the method you wrote for the previous exercise so that it now calls this new method to generate its result. Note that it should not be necessary to use a loop in this method.**
    ```java
    public int getRandomNumber( int min, int max )
    {
        Random rand = new Random();
        return ( rand.nextInt( max-min ) + min )
    }
    ```
 - 5.21 **Implement in your version of the tech-support system the random-response solution discussed here.**
   - Done see file [see file](main/SupportSystem.java)

 - 5.22 **What happens when you add more (or fewer) possible responses to the responses list? Will the selection of a random response still work properly? Why or why not?**
   - Doesn't matter because the random generator gets the size of the array list.

 - 5.23 **What is a HashMap ? What is its purpose and how do you use it? Answer these questions in writing, and use the Java library documentation of Map and HashMap for your responses. Note that you will find it hard to understand everything, as the documentation for these classes is not very good. We will discuss the details later in this chapter, but see what you can find out on your own before reading on.**
   - An collection (associate array). You use named keys to store an value, like joris => 21.
 
 - 5.24 **HashMap is a parameterized class. List those of its methods that depend on the types used to parameterize it. Do you think the same type could be used for both of its parameters?**
   Anny object, Yep that is possible.
   
 - 5.25 **How do you check how many entries are contained in a map?**
     ```java
     Map<String, Integer> someMap = new Map<>();
     someMap.size();    
     ```
     
 - 5.26 **Create a class MapTester (either in your current project or in a new project).In it, use a HashMap to implement a phone book similar to the one in the example above. (Remember that you must import java.util.HashMap .) In this class, implement two methods:**
    ```java 
    public void enterNumber(String name, String number);
    public String lookupNumber(String name);
    ```
    - Done see file [see file](main/PhoneBook.java)

 
 - 5.27 **What happens when you add an entry to a map with a key that already ex- ists in the map?**
   - It will override the current value.
 
 - 5.28 **What happens when you add an entry to a map with two different keys?**
   - You get 2 reference's.
   
 - 5.29 **How do you check whether a given key is contained in a map? (Give a Java code example.)**
     ```java
    HashMap<String, String> someMap = new HashMap<>();
    someMap.containsKey("someKey");
     ```
 - 5.30 **What happens when you try to look up a value and the key does not exist in the map?**
    You get `null` back. You could use `getOrDefault( key, defaultReturnValue )` if you want something different.
 
 - 5.31 **How do you check how many entries are contained in a map?**
     ```java
    HashMap<String, String> someMap = new HashMap<>();
    someMap.size();
     ```
 
 - 5.32 **How do you print out all keys currently stored in a map?**
    ```java
    HashMap<String, String> someMap = new HashMap<>();
    someMap.keySet().forEach( System.out::println );
    ```
  
 - 5.33 **Implement the changes discussed here in your own version of the TechSupport system. Test it to get a feel for how well it works.**
   - Done see file [see file](main/SupportSystem.java)
 - 5.34 **What are the similarities and differences between a HashSet and an ArrayList ? Use the descriptions of Set , HashSet , List , and ArrayList in the library documentation to find out, because HashSet is a special case of a Set and ArrayList is a special case of a List .**
 
 - 5.35 **The split method is more powerful than it first seems from our example. How can you define exactly how a string should be split? Give some examples.**
 
 - 5.36 **How would you call the split method if you wanted to split a string at either space or tab characters? How might you break up a string in which the words are sepa- rated by colon characters (:)?**
 
 - 5.37 **What is the difference in the result of returning the words in a HashSet compared with returning them in an ArrayList ?**
 
 - 5.38 **What happens if there is more than one space between two words (e.g., two or three spaces)? Is there a problem?**
  
 - 5.42 **Implement the final changes discussed above in your own version of the program**
 
 - 5.41 **Add more word/response mappings into your application. You could copy some out of the solutions provided and add some yourself.**
 
 - 5.42 **Ensure that the same default response is never repeated twice in a row.**
 
 - 5.43 **Sometimes two words (or variations of a word) are mapped to the same response. Deal with this by mapping synonyms or related expressions to the same string so that you do not need multiple entries in the response map for the same response.**
 
 - 5.46 **Use BlueJ’s Project Documentation function to generate documentation for your TechSupport project. Examine it. Is it accurate? Is it complete? Which parts are useful? Which are not? Do you find any errors in the documentation?**
 
 - 5.47 **Find examples of javadoc key symbols in the source code of the TechSupport project. How do they influence the formatting of the documentation?**
 
 - 5.48 **Find out about and describe other javadoc key symbols. One place where you can look is the online documentation of Oracle’s Java distribution. It contains a document called javadoc – The Java API Documentation Generator (for example, at http:// download.oracle.com/javase/6/docs/technotes/tools/windows/javadoc. html). In this document, the key symbols are called javadoc tags .**
 
 - 5.49 **Properly document all classes in your version of the TechSupport project**
 
 - 5.50 **Create a DrawDemo object and experiment with its various methods. Read the DrawDemo source code and describe (in writing) how each method works.**
 
 - 5.51 **Create a Pen object interactively using its default constructor (the construc- tor without parameters). Experiment with its methods. While you do this, make sure to have a window open showing you the documentation of the Pen class (either the editor window in Documentation view or a web-browser window showing the project documentation). Refer to the documentation to be certain what each method does.**
 
 - 5.52 **Interactively create an instance of class Canvas and try some of its meth- ods. Again, refer to the class’s documentation while you do this.**
 
 - 5.53 **Find some uses of the color constants in the code of class DrawDemo .**
 
 - 5.54 **Write down four more color constants that are available in the Color class. Refer to the class’s documentation to find out what they are.**
 
 - 5.55 **Create a canvas. Using the canvas’s methods interactively, draw a red circle near the center of the canvas. Now draw a yellow rectangle.**
 
 - 5.56 **How do you clear the whole canvas?**
 
 - 5.57 **In class DrawDemo , create a new method named drawTriangle . This method should create a pen (as in the drawSquare method) and then draw a green triangle.**
 
 - 5.58 **Write a method drawPentagon that draws a pentagon.**
 
 - 5.59 **Write a method drawPolygon(int n) that draws a regular polygon with n sides (thus, n=3 draws a triangle, n=4 draws a square, etc.).**
 
 - 5.60 **Write a method called spiral that draws a spiral (see Figure 5.6).**
 
 - 5.61 **Add a method to your DrawDemo class that produces a picture on the can- vas directly (without using a pen object). The picture can show anything you like, but should at least include some shapes, different colors, and text. Use code completion in the process of entering your code.**
 
 - 5.62 **Change the method bounce in class BallDemo to let the user choose how many balls should be bouncing.**
 
 - 5.63 **Which type of collection ( ArrayList , HashMap , or HashSet ) is most suita- ble for storing the balls for the new bounce method? Discuss in writing, and justify your choice.**
 
 - 5.64 **Change the bounce method to place the balls randomly anywhere in the top half of the screen.**
 
 - 5.65 **Write a new method named boxBounce . This method draws a rectan- gle (the “box”) on screen and one or more balls inside the box. For the balls, do not use BouncingBall , but create a new class BoxBall that moves around inside the box, bounc- ing off the walls of the box so that the ball always stays inside. The initial position and speed of the ball should be random. The boxBounce method should have a parameter that specifies how many balls are in the box.**
 
 - 5.66 **Give the balls in boxBounce random colors**
 
 - 5.67 **In class BouncingBall , you will find a definition of gravity (a simple inte- ger). Increase or decrease the gravity value; compile and run the bouncing ball demo again. Do you observe a change**
 
 - 5.68 **Write constant declarations for the following:** 
   - **A public variable that is used to measure tolerance, with the value 0.001.**
   - **A private variable that is used to indicate a pass mark, with the integer value of 40.**
   - **A public character variable that is used to indicate that the help command is 'h' .**
 
 - 5.69 **Take a look at the LogEntry class in the weblog-analyzer project from Chapter 4. How have constants been used in that class? Do you think that this is a good use of constants?**
 
 - 5.70 **Suppose that a change to the weblog-analyzer project meant that it was no longer necessary to store year values in the dataValues array in the LogEntry class. How much of the class would need to be altered if the month value were now to be stored at index 0 , the day value at index 1 , and so on? Do you see how the use of named constants for spe- cial values simplifies this sort of process?**
 
 - 5.72 **There is a rumor circulating on the Internet that George Lucas (the creator of the Star Wars movies) uses a formula to create the names for the characters in his stories (Jar Jar Binks, ObiWan Kenobi, etc.). The formula—allegedly—is this: Your Star Wars first name: 1 Take the first three letters of your last name. 2 Add to that the first two letters of your first name. Your Star Wars last name: 1 Take the first two letters of your mother’s maiden name. 2 Add to this the first three letters of the name of the town or city where you were born. And now your task: Create a new BlueJ project named star-wars . In it create a class named NameGenerator . This class should have a method named generateStarWarsName that generates a Star Wars name, following the method described above. You will need to find out about a method of the String class that generates a substring.**
 
 - 5.73 **Assume that we want to swap the values of two integer variables, a and b. To do this, we write a method public void swap(int i1, int i2) { int tmp = i1; i1 = i2; i2 = tmp; } Then we call this method with our a and b variables: swap(a, b); Are a and b swapped after this call? If you test it, you will notice that they are not! Why does this not work? Explain in detail.**