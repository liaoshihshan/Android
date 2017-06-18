package box;

public class box {
	public static void main(String[] args) {
	  boolean bb = true;
      Object j = null;
      j = "你好";
      //j = false;
      bb = (Boolean)j;
      if(j instanceof Boolean){
    	    System.out.println("eat");
      }
      else{
    	    System.out.println("drink");
      }
	}
}
