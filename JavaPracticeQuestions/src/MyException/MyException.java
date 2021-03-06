package MyException;

import java.io.IOException;

public class MyException extends IOException {

	private static final long serialVersionUID = 4664456874499611218L;
	
	private String errorCode="Shishir Exception";
	
	public MyException(String message, String errorCode){
		super(message);
		this.errorCode=errorCode;
	}

    private MyException() {
    }


    public String getErrorCode(){
		return this.errorCode;
	}
    public static void main (String args[]) 
    {
        
         MyException mex = new MyException();
        try{
            
                throw new MyException("Throwing new exception","123456");
            
            }
        
        catch(Exception e)
        {
            
           System.out.println(mex.getErrorCode());
            
            }
        
     }

}