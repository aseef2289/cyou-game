/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 11, 2021
* Description:
* This is a program a Choose Your Own Adventure Game
* It takes place during a hurricane in Guatemala
* The user must answer questions in order to get back to Canada
* There are only two possible outcomes that lead to Canada
* It is text based
* Uses nested if else statements
* Uses switch case statements
*/

import java.util.Scanner;

//needed to get user input via keyboard
class Main {
  public static void main(String[] args) {

    //variable declaration and initializing
    // Scanner is called keyedInput and initliazed once
    Scanner keyedInput = new Scanner(System.in);
    //Strings to store all the user's responses after each question
    String responseOne;
    String responseTwo;
    String responseThree;
    String responseFour;
    String responseFive;
    String responseSix;
    String responseSeven;
    String responseEight;
    String responseNine;

    //Constant message to show user when game ends   
    final String GAME_END = "The game is over.";
    //Constant message to show user when they input invalid response
    final String VALID_RESPONSE = "Please enter a valid response next time.";

    //First question
    System.out.println("You are on vacation in Guatemala when suddenly a hurricane strikes!");
    System.out.println("You hear loud rumbling...");
    System.out.print("Would you like to wake up? (yes/no) ");
    responseOne = keyedInput.nextLine();
    

    switch (responseOne)
    	{
        //Actions if user responds with yes
    		case "yes":
	    		{
            //New question for user
		    		System.out.println("Your neighbor is offering to take you to safety.");
		    		System.out.print("Will you go with him? (yes/no) ");
            //stores user input
		    		responseTwo = keyedInput.nextLine();
            //actions if user responds with yes 
		    		if (responseTwo.equals("yes"))
	    		{
            //New question for user
	    				System.out.print("Will you buy a ticket to Canada for $10,000 from a scalper?" + 
	    					" (yes/no) ");
                //stores user input 
	    			responseThree = keyedInput.nextLine();
            //actions if user responds with yes 
	    			if (responseThree.equals("yes"))
	    				{
                //New question for user
	    					System.out.println("You have $500 left.");
	    					System.out.print("Will you buy another one for your neighbor? (yes/no) ");
                //stores user input 
	    					responseFour = keyedInput.nextLine();
                //actions if user responds with yes
	    					if (responseFour.equals("yes"))
	    						{
                    //final message for user 
	    							System.out.println("You can't afford it. You gain bad karma. "
	    									+ "The plane crashes in the hurricane.");
                    //end of game message 
	    							System.out.println(GAME_END);
	    						}
                //actions if user responds with no
	    					else if (responseFour.equals("no"))
	    						{
                    //final message for user 
	    							System.out.println("You gain bad karma. "
	    									+ "The plane crashes in the hurricane.");
                      //end of game message for user 
	    							System.out.println(GAME_END);
	    						}
                //actions if user inputs an invalid response
	    					else
	    						{
                    //message if user inputs an invalid response
	    							System.out.println(VALID_RESPONSE);
                    //closes input 
	                  keyedInput.close();
	    						}
	    				}
            //actions if user responds with no
	    			else if (responseThree.equals("no"))
	    				{
                //New question for user
		    				System.out.println("You leave the airport and try to go back home");
		    				System.out.print("Will you go back to bed? (yes/no) ");
                //stores user input 
		    				responseNine = keyedInput.nextLine();
                //actions if user responds with yes 
		    				if (responseNine.equals("yes"))
		    					{
                    //final message for user 
		    						System.out.println("You die in your sleep as your house collapses.");
                    //end of game message for user
		    						System.out.println(GAME_END);
		    					}
                //actions if user responds with no
		    				else if (responseNine.equals("no"))
		    					{
                    //final message for user
		    						System.out.println("You hear strong winds and rattling");
		    						System.out.println("You die as your house collapses");
                    //end of game message for user 
                    System.out.println(GAME_END);
		    					}
                //actions if user inputs an invalid response
		    				else
								{
                  //message if user inputs an invalid response
									System.out.println(VALID_RESPONSE);
                  //input closes
	                keyedInput.close();
								}
	    				}
            //actions if user inputs an invalid response
	    			else
	    				{
                //message if user inputs an invalid response
	    					System.out.println(VALID_RESPONSE);
                //input closes
	              keyedInput.close();
	    				}
	    			}
	    		//actions if user responds with no
	    		else if (responseTwo.equals("no"))
	    			{
              //New question for user
	    				System.out.println("You survive for 3 days but are really hungry");
	    				System.out.print("Will you eat bread or beans? (bread/beans) ");
              //stores user input
	    				responseSeven = keyedInput.nextLine();
              //actions if user responds with bread 
	    				if (responseSeven.equals("bread"))
	    					{
                  //final message for user 
	    						System.out.println("You died from the copious amounts of mold on the bread.");
                  //end of game message for user 
	    						System.out.println(GAME_END);
	    					}
              //actions if user responds with beans 
	    				else if (responseSeven.equals("beans"))
	    					{
                  //new question for user
	    						System.out.println("You survive another day. Weather clears up. "
	    								+ "Will you find a way out of Guatemala");
	    						System.out.println("You go to the airport...");
	    						System.out.print("Will you buy a ticket for $10,000 from scalper? "
	    								+ "(yes/no) ");
                  //stores user input 
	    						responseEight = keyedInput.nextLine();
                  //actions if user responds with yes 
	    						if (responseEight.equals("yes"))
	    							{
                      //final message for user 
	    								System.out.println("You only have $500 left but you "
	    										+ "make it home safely");
                      //end of game message for user 
	    								System.out.println(GAME_END);
	    							}
                  //actions if user responds with no
	    						else if (responseEight.equals("no"))
	    							{
                      //final message for user 
	    								System.out.println("You find a ticket for a reasonable "
	    										+ "price the next day and make it home safley.");
                      //end of game message for user
	    								System.out.println(GAME_END);
	    							}
                  //actions if user inputs an invalid response
	    						else 
	    						{
                    //message if user inputs an invalid response
	    							System.out.println(VALID_RESPONSE);
                    //input closes 
	                  keyedInput.close();
	    						}
	    					}
	    			}
          //actions if user inputs an invalid response
	    		else 
					{
            //message if user inputs an invalid response
						System.out.println(VALID_RESPONSE);
            //input closes
	          keyedInput.close();
					}
          //no need to check for other cases
		    	break;
	    			
	    	}   
    	
	    	//actions if user responds with no	
    		case "no":
    		{
            //new question for user
        		System.out.println("The hurricane makes a beam fall on your leg. Its broken now.");
        		System.out.print("Will you go to the hospital? (yes/no) ");
            //stores user input
        		responseFive = keyedInput.nextLine();
            //actions if user responds with yes 
        		if (responseFive.equals("yes"))
        		{
              //new question for user 
        			System.out.println("You ask you neighbor for help and he takes you to the hospital.");
        			System.out.print("Would you like to amputate your leg? (yes/no) ");
              //stores user input 
        			responseSix = keyedInput.nextLine();
              //actions if user responds with yes 
        			if (responseSix.equals("yes"))
        				{
                  //new question for user
        					System.out.println("The surgery was unsuccessful you "
        							+ "must be transported to Canada");
        					System.out.print("Will leave Guatemala for a surgery? (yes/no) ");
                  //stores user input 
        					responseSeven = keyedInput.nextLine();
                  //actions if user responds with yes 
        					if (responseSeven.equals("yes"))
        						{
                      //final message for user
        							System.out.println("The plane crashes from heavy winds. You die.");
                      //end of game message for user
        							System.out.println(GAME_END);
        						}
                  //actions if user responds with no 
        					else if (responseSeven.equals("no"))
        						{
                      //final message for user
        							System.out.println("You cannot receive any more treatment. "
        									+ "You lose too much blood. You die.");
                      //end of game message for user
        							System.out.println(GAME_END);
        						}
                  //actions if user inputs an invalid response
        					else
    						  {
                    //message if user inputs an invalid response
    						  	System.out.println(VALID_RESPONSE);
                    //input closes
                    keyedInput.close();
    						  }
        				}
              //actions if user responds with no
        			else if (responseSix.equals("no"))
        				{
                  //final message for user
        					System.out.println("You bleed out and die");
                  //end of game message for user
        					System.out.println(GAME_END);
        				}
              //actions if user inputs an invalid response
        			else
        				{
                  //message if user inputs an invalid response
        					System.out.println(VALID_RESPONSE);
                  //input closes 
                  keyedInput.close();
        				}
        		}
            //actions if user responds with no
        		else if (responseFive.equals("no"))
        			{
                //final message for user
        				System.out.println("You bleed out and die");
                //end of game message for user
        				System.out.println(GAME_END);
        			}
            //actions if user inputs an invalid response
        		else
        			{
                //message if user inputs an invalid response
        				System.out.println(VALID_RESPONSE);
                //input closes
                keyedInput.close();
        			}
            //no need to check for other cases
        		break;
        	}
        //actions if user inputs an invalid response
        default: 
        	{
            //message if user inputs an invalid response
        		System.out.println(VALID_RESPONSE);
            //input closes
        		keyedInput.close();
        	}
    	}	
    //input closes for whole program
    keyedInput.close();
  }//end of main method
}//end of class method