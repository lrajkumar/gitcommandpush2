package JavaRegex;



public class SplitWord {
	   public static void main(String args[])
	    {
	        String str = "Geekssss,2,raja,4,rani";
	        String[] arrOfStr = str.split("\\d");
	  
	        for (String a : arrOfStr)
	            System.out.println(a);
	    }
	}



