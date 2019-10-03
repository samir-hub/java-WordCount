package wordCountApp;

public class Words
{
	// fields (attributes)
	private String[] word;


	// constructor
	public Words(String[] word)
	{
		this.word = word;
		
	}

	// methods (behaviors)
	// getters and setters
	public String[] getWord()
	{
		return word;
	}

	public void setWord(String[] word)
	{
		this.word = word;
	}

	
    @Override
    public String toString()
    {
        String rtnStr = "word: " + word + "\n";
        return rtnStr;
    }
}


