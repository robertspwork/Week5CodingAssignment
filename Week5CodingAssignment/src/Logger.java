
public interface Logger {

	void Log(String str);
	void Error(String str);
	
}

class AsteriskLogger implements Logger {
	  public void Log(String str){
	    System.out.println("***" + str + "***"); 
	    
	  }
	  public void Error(String string){
	    String c = "***" + "Error: " + string + "***"; 

	    String astr = "";
	    for (int i =  0; i < c.length(); i++) astr += "*";
	    System.out.println(astr +  "\n" + c +  "\n" + astr);
	  }
	}

class SpacedLogger implements Logger {
	public void Log(String str){
		  
	    for (int i=0; i<str.length(); i++){ 
	      char curr = str.charAt(i); 
	      System.out.print(curr + " "); 
	    }
	  }
	  
	  public void Error(String str){
	    System.out.print("Error: ");
	    for (int i=0; i<str.length(); i++){ 
	      char curr = str.charAt(i);
	      System.out.print(curr + " ");
	    }
	  }
	}