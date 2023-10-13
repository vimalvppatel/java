package AutomationLearing;

public class AutomationLerning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          // System.out.println("Vimal Patel");
		  
		   int a = 10;
		   int b = 20;
		   int c = a+b;
		   System.out.println(c);
		  
		   int a1 = 100/2;          
           int b1 = 500*2;   
           int c1 = a1 + b1 ;
           System.out.println(c1);
		
		
		   String v = "Vimal";
		   String p = "Patel";
	       String s = v + " "+ p;
		   System.out.println(s);
		
		   int a11 = 100;
		   int b11 = 200;
		   boolean c11 = a11 <=b11;
		   System.out.println(c11);
		
           int a111 = 7 ;
           int b111 = ++a111 * 5 ;
           System.out.println(b111);
        
        String a1111 = "Vimal Patel";
        System.out.println(a1111.toUpperCase());
        System.out.println(a1111.toLowerCase());
        System.out.println(a1111.length());
        System.out.println(a1111.startsWith("Vi"));
        System.out.println(a1111.endsWith("e"));
        System.out.println(a1111.replace("P","V"));
        System.out.println(a1111.indexOf("e"));
        System.out.println(a1111.getClass());
         
        
       
        int x = 10;
        int y = 20;                  
        if (x>y) {
        	System.out.println("TRUE");
        }
         else  {
        	System.out.println("FALSE");
          }
        
        
       for (int i1 = 0; i1<100; i1++) {
    	   System.out.println(i1);
         } 
       
       
       while (x>y){
    	   System.out.println("You are able to vote");
         }
           System.out.println("You are not able to vote");
           
           
         int day = 5;
         switch (day) {
           case 1 :
        	    System.out.println("Monday");
        	    break;
        	   
           case 2 :
        	    System.out.println("Tuesday");
        	    break;
        	    
           case 3 :
        	    System.out.println("Wednesday");
        	    break;
        	    
           case 4 :
        	    System.out.println("Thursday");
        	    break;
        	    
           case 5 :
        	    System.out.println("Friday");
        	    break;
        	    
           case 6 :
        	    System.out.println("Saturday");
        	    break;
        	    
           case 7 :
        	    System.out.println("Sunday");
        	    break;
        	}
           
            int i = 0;       
            while(i<=21) { 
        	  System.out.println(i);
            i++;
	        }
          
            int N = 10;
            for(N=0; N<10; N++) {
            	if (N==5) {
            		break;
            	  }
            	System.out.println(N);
            }
            
            
            String[] cars = {"volvo","Maruti","OD", "Hundai", "RangRover", "Discovery"};
            String[] names = {"Vimal", "Patel","From", "Sanawad"};
            System.out.println(names[0] + " " + cars[5]);
            
            for(int i1 = 0; i1<cars.length; i1++) {
            	System.out.println(cars[i1]);
          }
            
         int[][] myNum ={{1,2,3,4},{5,6,7,8,9,10}};
         System.out.println(myNum[1][3]);
       	 System.out.println(myNum.length);
       	 int r = 0;
       	 for (int r1= 0;r1<myNum.length;r1++) {
       	 for (int j =0; j<myNum.length; j++) {
       	 int j1 = 0;
		System.out.println(myNum[r1][j1]);
	}
}
       	 
       	 
	}}
