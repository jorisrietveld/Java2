# Assignment Index 
Assignments for this week:
 - 6.1 t/m 6.7
 - 6.8
 - 6.9 t/m 6.14
 - 6.16 t/m 6.18
 - 6.20 t/m 6.21
 - 6.22 t/m 6.25
 - 6.28 t/m 6.33

# Assignment solutions
 - **Exercise 6.1 Open the project zuul-bad. (This project is called “bad” because its implemen-
	tation contains some bad design decisions, and we want to leave no doubt that this should not
	be used as an example of good programming practice!) Execute and explore the application.
	The project comment gives you some information about how to run it.
	While exploring the application, answer the following questions:**
 - **What does this application do?**
    - Amusing an user.
 - **What commands does the game accept?**
    - `go`
    - `quit`
    - `help`
 - **What does each command do?**
    - `go` Nothing because of errors in the code... But its meant to change the users position on the map.
    - `quit` Nothing because of errors in the code... But is should terminate the game.
    - `help` Nothing because of errors in the code... But it shows the available commands.
 - **How many rooms are in the scenario?**
    - Five: Outside, Theatre, pub, lab and office.
 - **Draw a map of the existing rooms.**
    - Done.
    
 - **Exercise 6.2 After you know what the whole application does, try to find out what each indi-
   vidual class does. Write down for each class its purpose. You need to look at the source code
   to do this. Note that you might not (and need not) understand all of the source code. Often,
   reading through comments and looking at method headers is enough.**
   - Class `Command` Data object representing an command and its arguments.
   - Class `CommandWords` Object storing valid commands.
   - Class `Game` The main entry point of the game and the world generator.
   - Class `Parser` Handles user input.
   - Class `Room` An data object representing an room in the game.
   
 - **Exercise 6.3 Design your own game scenario. Do this away from the computer. Do not
     think about implementation, classes, or even programming in general. Just think about invent-
     ing an interesting game. This could be done with a group of people.**
   - Done, its a game where player must continue to complete boring java 
     assignments without killing himself.
     
 - **Exercise 6.4 Draw (on paper) a map for the game you invented in Exercise 6.3. Open the
     zuul-bad project and save it under a different name (e.g., zuul). This is the project you will use
     for making improvements and modifications throughout this chapter. You can leave off the
     -bad suffix, because it will (hopefully) soon not be that bad anymore. <br><br>
     As a first step, change the createRooms method in the Game class to create the rooms and
     exits you invented for your game. Test!**
     Done see [ZuulBad](ZuulBad)
 - **Exercise 6.5 Implement and use a separate printLocationInfo method in your
     project, as discussed in this section. Test your changes.**
   - Done see [ZuulBad :: Game.java ](ZuulBad/Game.java) and [ZuulBad :: Room.java ](ZuulBad/Room.java) 
     
 - **Exercise 6.6 Make the changes we have described to the Room and Game classes.**
     - Done see [ZuulBad :: Room.java](ZuulBad/Room.java)
 - **Exercise 6.7 Make a similar change to the printLocationInfo method of Game so that
     details of the exits are now prepared by the Room rather than the Game. Define a method in
     Room with the following signature:**
     ```java
     /**
     * Return a description of the room’s exits,
     * for example, "Exits: north west".
     * @return A description of the available exits.
     */
     public String getExitString()
    ```
   - Done see [ZuulBad :: Game.java ](ZuulBad/Game.java) and [ZuulBad :: Room.java ](ZuulBad/Room.java) 

 - 6.8
 - 6.9
 - 6.10
 - 6.11
 - 6.12
 - 6.13
 - 6.14
 - 6.16
 - 6.17
 - 6.18
 - 6.20
 - 6.21
 - 6.22
 - 6.23
 - 6.24
 - 6.25
 - 6.28
 - 6.29
 - 6.30
 - 6.31
 - 6.32
 - 6.33