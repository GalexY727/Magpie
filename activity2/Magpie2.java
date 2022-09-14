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

	public int findKeyword(String statement, String goal,
						   int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
								psn + goal.length(),
								psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") >= 0 < 0) || (before
					.compareTo("z") >= 0 > 0)) // before is not a
					// letter
					&& ((after.compareTo("a") >= 0 < 0) || (after
					.compareTo("z") >= 0 > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}
	public String getResponse(String statement)
	{
		String response = "";
		if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "Mr.") >= 0)
		{
			response = "Mr. Jaffe is a the best teacher, I agree.";
		}
		else if (findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		//trim to check if anything was said
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "school") >= 0)
		{
			response = "School is fun.";
		}
		else if (findKeyword(statement, "food") >= 0)
		{
			response = "I like food.";
		}
		else if (findKeyword(statement, "weather") >= 0)
		{
			response = "The weather is nice.";
		}
		else if (findKeyword(statement, "sports") >= 0)
		{
			response = "I like sports.";
		}
		else if (findKeyword(statement, "music") >= 0)
		{
			response = "I love music, have you listened to Data Loss by JKuch?";
		}
		//import spotify cli and get all songs from a user's liked library
		else if (findKeyword(statement, "spotify") >= 0)
		{
			response = "I like spotify.";
		}
		else if (findKeyword(statement, "computer") >= 0)
		{
			response = "I like computers.";
		}
		else if (findKeyword(statement, "game") >= 0)
		{
			response = "I like games.";
		}
		else if (findKeyword(statement, "movie") >= 0)
		{
			response = "I like movies.";
		}
		else if (findKeyword(statement, "tv") >= 0)
		{
			response = "I like tv.";
		}
		else if (findKeyword(statement, "book") >= 0)
		{
			response = "I like books.";
		}
		else if (findKeyword(statement, "art") >= 0)
		{
			response = "I like art.";
		}
		else if (findKeyword(statement, "science") >= 0)
		{
			response = "I like science.";
		}
		else if (findKeyword(statement, "math") >= 0)
		{
			response = "I like math.";
		}
		else if (findKeyword(statement, "history") >= 0)
		{
			response = "I like history.";
		}
		else if (findKeyword(statement, "english") >= 0)
		{
			response = "I like english.";
		}
		else if (findKeyword(statement, "programming") >= 0)
		{
			response = "I like programming.";
		}
		else if (findKeyword(statement, "coding") >= 0)
		{
			response = "I like coding.";
		}
		else if (findKeyword(statement, "python") >= 0)
		{
			response = "I don't like python.";
		}
		else if (findKeyword(statement, "java") >= 0)
		{
			response = "I like java.";
		}
		else if (findKeyword(statement, "c++") >= 0)
		{
			response = "I like c++.";
		}
		else if (findKeyword(statement, "c") >= 0)
		{
			response = "I like c.";
		}
		else if (findKeyword(statement, "javascript") >= 0)
		{
			response = "I like javascript.";
		}
		else if (findKeyword(statement, "html") >= 0)
		{
			response = "I like html.";
		}
		else if (findKeyword(statement, "css") >= 0)
		{
			response = "I like css.";
		}
		else if (findKeyword(statement, "sql") >= 0)
		{
			response = "I like sql.";
		}
		else if (findKeyword(statement, "kotlin") >= 0)
		{
			response = "I like kotlin.";
		}
		else if (findKeyword(statement, "video games") >= 0)
		{
			response = "I like video games.";
		}
		else if (findKeyword(statement, "movies") >= 0)
		{
			response = "I like movies.";
		}
		else if (findKeyword(statement, "television") >= 0)
		{
			response = "I like television.";
		}
		else if (findKeyword(statement, "books") >= 0)
		{
			response = "I like books.";
		}
		else if (findKeyword(statement, "hobbies") >= 0)
		{
			response = "I like building robots, and ice skating with my friends.";
		}
		else if (findKeyword(statement, "friends") >= 0)
		{
			response = "I like friends... to bad they are all digital";
		}
		else if (findKeyword(statement, "family") >= 0)
		{
			response = "I dont have much of a family... but thats okay.";
		}
		else if (findKeyword(statement, "hate") >= 0)
		{
			response = "Why do you hate that?";
		}
		else if (findKeyword(statement, "like") >= 0)
		{
			response = "Why do you like that?";
		}
		else if (findKeyword(statement, "love") >= 0)
		{
			response = "Why do you love that?";
		}
		else if (findKeyword(statement, "dont like") >= 0 || findKeyword(statement, "dislike") >= 0)
		{
			response = "Why do you dislike that?";
		}
		else if (findKeyword(statement, "I want") >= 0)
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
