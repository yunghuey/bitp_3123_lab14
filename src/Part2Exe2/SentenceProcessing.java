package Part2Exe2;

public class SentenceProcessing {

	private int size = 65535;

	private String sentence;
	
	public SentenceProcessing(byte[] byteData) {
		
		this.sentence = new String(byteData);
	}
	
	public String getSentence() {
		
		return sentence;
	}
	
	/***
	 * This method calculate the number of punctuation
	 * @return
	 */
	public int countPunctuation() {
		 int count = 0;
		    String punctuationMarks = ".,;:!?\"'()[]{}<>";

		    for (int i = 0; i < sentence.length(); i++) {
		        char ch = sentence.charAt(i);
		        if (punctuationMarks.indexOf(ch) != -1) {
		            count++;
		        }
		    }

		    return count;
	}
	
	/***
	 * This method calculate the number of consonants
	 * @return
	 */
	public int countConsonants() {
	    int count = 0;
	    String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

	    for (int i = 0; i < sentence.length(); i++) {
	        char ch = sentence.charAt(i);
	        if (consonants.indexOf(ch) != -1) {
	            count++;
	        }
	    }

	    return count;
	}
	
	/***
	 * This method calculate the number of vowel
	 * @return
	 */
	public int countVowels() {
	    int count = 0;
	    String vowels = "aeiouAEIOU";

	    for (int i = 0; i < sentence.length(); i++) {
	        char ch = sentence.charAt(i);
	        if (vowels.indexOf(ch) != -1) {
	            count++;
	        }
	    }

	    return count;
	}


	
}
