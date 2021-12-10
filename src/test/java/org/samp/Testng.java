package org.samp;


import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testng extends BaseClass {
	
@Test	
private static void lauchbrowser() throws InterruptedException, AWTException {
	driver = launchBrowser();
	  int count=5,counts=5;float b = 0;
	  String text,text1;
	  float[] t=new float[6];
	 
	 getUrl("https://blazedemo.com/");
     maximize();
    
     Pojo p=new Pojo();
     selectVisible(p.getDeparatureCity(),"Boston");
     selectVisible(p.getDestinationCity(),"Berlin");
     elementClick(p.getFindFlights());
   // String text1 = elementText1(p.getCharge1());
  //  System.out.println(text1);
      WebElement select = p.getSelect();
      List<WebElement> findElements = select.findElements(By.tagName("td"));
    
      for (int i = 0; i < findElements.size(); i++) {
    	 
    	 
    	  for (int j = 0; j <findElements.size(); j++) {
    		 
    		  if(j==count) {
				WebElement ele = findElements.get(j);
				  text = ele.getText().replace("$","");
				    b=  Float.parseFloat(text);	
	                t[i]=b;
	          }
    	  }
    	  count=count+6;
    	  
    	 }
      

     for (int i = 0; i < t.length; i++) {
   	  for (int j = i+1; j < t.length; j++) {
    		  if(t[i]>t[j]) {
    			  float temp=t[i];
    			  t[i]=t[j];
    			  t[j]=temp;
               }
		
		}
    	  
		
	}
    // System.out.println(t[1]);
     String str = String.valueOf(t[1]);
     System.out.println(str);
     
     List<WebElement> findElements1 = select.findElements(By.tagName("td"));
     for (int i = 0; i <findElements1.size(); i++) {
    	 
    	 for (int j = 0; j < findElements1.size(); j++) {
    		// System.out.println(j);
    		 
    		 if(j==counts) {
    			 System.out.println(j);
    			 
 				WebElement ele1 = findElements1.get(j);
 				  text1 = ele1.getText().replace("$","");
 				 
 				 // System.out.println(text1);
 				  if(str.equals(text1)) {
 					 System.out.println("sam");
 					 
 					j=j-5;
 					WebElement ele2 = findElements1.get(j);
 					 
					 elementClick(ele2);
 					 break;
 					 
 					 
 				 }
 				    
    		 
    			 
    			 
     
    		 
    			 
    			 
    			 
    		}
    		 
    	 }
    	 counts=counts+6;
     }
      
    	  
		
	
  
	 
      
	 
       
	
        
 
 
	
 
		 
		  
      
				 
				 
				    
}	
 
		 
				
}				
				
				
				
				
	
    	 

      
 	  
     
    	  
		
	
      

 

    	
    

		
	




      
      

    	
    

     
     // int num = Integer.parseInt(replace);
     
    	 
		
	//	System.out.println(num);
		
	//} 
		
	
    	  
  	
    
     
    
     
     
     
    
     
  
  
	


 


