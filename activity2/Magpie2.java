package activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.contains("no"))
		{
			response = "Why so negative?";
		}
		else if (statement.contains("mother")
				|| statement.contains("father")
				|| statement.contains("sister")
				|| statement.contains("brother"))
		{
			response = "Tell me more about your family.";
		}
		else if (statement.contains("Mr."))
		{
			response = "Mr. Jaffe is a the best teacher, I agree.";
		}
		else if (statement.contains("dog")
				|| statement.contains("cat"))
		{
			response = "Tell me more about your pets.";
		}
		//trim to check if anything was said
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		else if (statement.contains("school"))
		{
			response = "School is fun.";
		}
		else if (statement.contains("food"))
		{
			response = "I like food.";
		}
		else if (statement.contains("weather"))
		{
			response = "The weather is nice.";
		}
		else if (statement.contains("sports"))
		{
			response = "I like sports.";
		}
		else if (statement.contains("music"))
		{
			response = "I love music, have you listened to Data Loss by JKuch?";
		}
		//import spotify cli and get all songs from a user's liked library
		else if (statement.contains("spotify"))
		{
			response = "I like spotify.";
		}
		else if (statement.contains("computer"))
		{
			response = "I like computers.";
		}
		else if (statement.contains("game"))
		{
			response = "I like games.";
		}
		else if (statement.contains("movie"))
		{
			response = "I like movies.";
		}
		else if (statement.contains("tv"))
		{
			response = "I like tv.";
		}
		else if (statement.contains("book"))
		{
			response = "I like books.";
		}
		else if (statement.contains("art"))
		{
			response = "I like art.";
		}
		else if (statement.contains("science"))
		{
			response = "I like science.";
		}
		else if (statement.contains("math"))
		{
			response = "I like math.";
		}
		else if (statement.contains("history"))
		{
			response = "I like history.";
		}
		else if (statement.contains("english"))
		{
			response = "I like english.";
		}
		else if (statement.contains("programming"))
		{
			response = "I like programming.";
		}
		else if (statement.contains("coding"))
		{
			response = "I like coding.";
		}
		else if (statement.contains("python"))
		{
			response = "I don't like python.";
		}
		else if (statement.contains("java"))
		{
			response = "I like java.";
		}
		else if (statement.contains("c++"))
		{
			response = "I like c++.";
		}
		else if (statement.contains("c"))
		{
			response = "I like c.";
		}
		else if (statement.contains("javascript"))
		{
			response = "I like javascript.";
		}
		else if (statement.contains("html"))
		{
			response = "I like html.";
		}
		else if (statement.contains("css"))
		{
			response = "I like css.";
		}
		else if (statement.contains("sql"))
		{
			response = "I like sql.";
		}
		else if (statement.contains("kotlin"))
		{
			response = "I like kotlin.";
		}
		else if (statement.contains("video games"))
		{
			response = "I like video games.";
		}
		else if (statement.contains("movies"))
		{
			response = "I like movies.";
		}
		else if (statement.contains("television"))
		{
			response = "I like television.";
		}
		else if (statement.contains("books"))
		{
			response = "I like books.";
		}
		else if (statement.contains("hobbies"))
		{
			response = "I like building robots, and ice skating with my friends.";
		}
		else if (statement.contains("friends"))
		{
			response = "I like friends... to bad they are all digital";
		}
		else if (statement.contains("family"))
		{
			response = "I dont have much of a family... but thats okay.";
		}
		else if (statement.contains("hate"))
		{
			response = "Why do you hate that?";
		}
		else if (statement.contains("like"))
		{
			response = "Why do you like that?";
		}
		else if (statement.contains("love"))
		{
			response = "Why do you love that?";
		}
		else if (statement.contains("dont like") || statement.contains("dislike"))
		{
			response = "Why do you dislike that?";
		}
		else if (statement.contains("I want"))
		{
			response = "What would it mean to you if you got that?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
