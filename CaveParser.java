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
			if(theJSON.indexOf('{') != -1)
			{
				System.out.println("JSONObject begin");
			}
			
		}
		
		for(int i = 0; i < this.theJSON.length(); i++)
		{
			if(theJSON.indexOf('[') != -1)
			{
				System.out.println("JSONArray begin");
			}
		}
		
		for(int i =0; i < this.theJSON.length(); i++)
		{
			if(theJSON.indexOf('}') != -1)
			{
				System.out.println("JSONObject end");
			}
		}
		
		for(int i = 0; i < this.theJSON.length(); i++)
		{
			if(theJSON.indexOf(']') != -1)
			{
				System.out.println("JSONArray end");
			}
		}
	}
}