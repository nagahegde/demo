import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonParser jsonParser = new JsonParser();
	    try {
	    	  /* JsonArray jsonArray = (JsonArray) jsonParser.parse(new java.io.FileReader("./input.json"));
	    	  // JsonArray jsonArray = jsonObj.getAsJsonArray(); 
	    	   for(int i=0;i<jsonArray.size();i++) {
	    		    System.out.println(jsonArray.get(i).getAsJsonObject().get("name"));
                    //getting cars
	    		    JsonArray carArray = (JsonArray) jsonArray.get(i).getAsJsonObject().get("cars");
	    		    System.out.println("The name of the cars owned as below:");
	    		    for(int j=0;j<carArray.size();j++) {
	    		    	System.out.println(carArray.get(j));
	    		    }
	    	   } */
	    	System.out.println("Hello World!!!");
	    }catch(JsonSyntaxException sy) {
	    	System.out.println("JSON Syntax Error.");
	    }
	    catch(JsonParseException jp) {
	    	System.out.println("Exception occurred while parsing json file."+jp.getMessage());
	    }
	    catch(Exception e) {
	    	System.out.println("Exception occured while performing json operation."+e.getMessage());
	    }
	}

}
