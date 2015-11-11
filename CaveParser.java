public class CaveParser 
{
	private String theJSON;
	
	public CaveParser(String json)
	{
		this.theJSON = json;
	}
	
	
	public JSONObject parse()
	{
		for(int i = 0; i < this.theJSON.length(); i++)
		{
			if(theJSON.charAt(i) == '{')
			{
				System.out.println("JSONObject begin");
			}

			else if(theJSON.charAt(i) == '[')
			{
				System.out.println("JSONArray begin");
			}
			
			else if(theJSON.charAt(i) == '{')
			{
				System.out.println("JSONObject end");
			}
			
			else if(theJSON.charAt(i) == ']')
			{
				System.out.println("JSONArray end");
			}
		}
	}
}