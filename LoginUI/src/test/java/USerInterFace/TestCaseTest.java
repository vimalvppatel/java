package USerInterFace;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseTest {

  @Test (priority=0,description="This is login test")
  public void login () {
  
	  {
		  System.out.println ("Login is successfuly");
	     }
		  
	  }

  @Test (priority=1,description="This is logout test")
  public void logout () {
   
	  {
		  System.out.println ("Logout is successfuly");
	     }
      }
	  
	  @Test (priority=2,description="This is button")
	  public void button() {
	  
		  {
			  System.out.println ("button is present");
			  
		     }
		   
	      }

	  
     @Test (priority=3,description ="Check password")

       public void passwword() {
    	   {
    		  System.out.println("Password is valid");
    
             }
    	   
           }
      
      @Test (priority=4, description ="Db is connected") 
     
         public void Db() {
    	  
    	    System.out.print("Now Db is connected");
      }    	  
      
      
      @Test (priority =5, description="Db is disconnected")
        
          public void Db2() {
    	  
    	  System.out.print("Now Db is disconnected");
    	  
    }
      
      
      @Test (priority=6, description = "All data is proper aligned")
          public void layout () {
    	  
    	  System.out.println("Layout is proper");
         }
    	
      
      @Test (priority=7, description = "Validation issue")
       
         public void validation () {
    	  
    	  System.out.print("Validation message is not appearing");
 
          }
      
      @Test (priority =8, description = "vimal patel")
          
        public void vimal () {
    	  
    	  System.out.println ("I am vimal patel");
    	  
      }
       
      
      
      
      
    
  
          @AfterMethod
      public void image () {
    	  
    	   System.out.println("after");
    	   
        }
      
          @BeforeMethod
          public void image11 () {
        	  
        	   System.out.println("bbbbbbbfter");
        	   
            }
          
      
       
      }

      
        
     
     
     
    



   
	  
	  
	  

  
