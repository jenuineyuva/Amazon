package org.samp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

public class BaseClass {
             public static WebDriver driver;
	public static   WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Sample2\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	//2
	public static  void getUrl(String url) {
	      driver.get(url);
	}
	
	//3
	public void elementSendkeys(WebElement element,String data) {
		 element.sendKeys(data);
	}
	//4
	public static void elementClick(WebElement element) {
		element.click();
	}
	//5
	public String currentUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	//6
	public void title(WebDriver driver) {
		driver.getTitle();
	}
	//7
	public String elementAtrribute(WebElement element,String v) {
	          String attr = element.getAttribute(v);
	          return attr;
	}
	//8
	public String elementText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String elementText1(List<WebElement> element) {
		for (int i = 0; i < element.size(); i++) {
			   WebElement ele = element.get(i);
			   String text2 = ele.getText();
			 
			    return text2;
			
		}
		return null;
		 
		 

	}
	//9
	public void quit() {
		driver.quit();
	}
	//10
	public static void maximize() {
	    driver.manage().window().maximize();

	}
	//11
	public void navigateRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	//12
	public void navigateForward(WebDriver driver ){
		driver.navigate().forward();
		 
	}
	//13
	public void navigateBack(WebDriver driver) {
	    driver.navigate().back();
	}
	//14
	public String elementGettagname(WebElement element) {
		String tagName = element.getTagName();
		return tagName;

	}
	//15
	public int listsize(List<WebElement> element) {
		int size = element.size();
		return size;
	}
	//16
	//Actions
	public void actionMouseover(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();	
	}
	//17
	public void actionDragDrop(WebDriver driver,WebElement src,WebElement tart) {
		 Actions a=new Actions(driver);
		   a.dragAndDrop(src, tart).perform();
	}
	//18
	public void actionDoubleClk(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	//19
	public void actionContextClk(WebDriver driver,WebElement element) {
		 Actions a=new Actions(driver);
		 a.contextClick(element).perform();
	}
	//20
	public void actionKeydown(WebDriver driver,WebElement element) {
		 Actions a=new Actions(driver);
		 a.keyDown(element,Keys.SHIFT).perform();
		  
	}
	//21
	public void actionKeyup(WebDriver driver,WebElement element) {
		 Actions a=new Actions(driver);
		 a.keyUp(Keys.SHIFT).perform();
	}
	//22
	public void actionSpace(WebDriver driver,WebElement element) {
		 Actions a=new Actions(driver);
		 a.keyDown(Keys.SPACE).keyUp(Keys.SPACE).build().perform();
	}
	//23
	public void actionEnter(WebDriver driver) {
		 Actions a=new Actions(driver);
		 a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}
	 
	
	//***********************************Actonsclsed********************notfinishfully
	//Robot
	//24
	public void robotEnter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	//25
	public void robotCopy() throws AWTException {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_C);
	}
	//26
	public void robotPaste() throws AWTException {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
	}
	//27
	
	public void robotTab() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	//28
	public void robotUp() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}
	//29
	public void robotDown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
//*******************Robotclsed***************notfinshed fully
	//Javascriptexecutor
	//30
	public void scrollDown(WebDriver driver,WebElement element) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("argument[0].scrollIntoView(true)",element);

	}
	//31
	public void scrollUp(WebDriver driver,WebElement element) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("argument[0].scrollIntoview(false)",element);

	}
	//32
	public void sendKeysJavascript(WebDriver driver,WebElement element,String str) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("argument[0].setAttribute('value','str')",element);	 
		 
	}
	//33
	public void clickJavaScript(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()",element);

	}
	//34

    public String getAttributejavascript(WebDriver driver,WebElement element) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 Object obj = js.executeScript("return arguments[0].getAttribute('value')",element);
		 String str =(String)obj;
		 return str;
	}	
    //**************************JavaScriptclsed*******************
    //Screenshot(adding commons jar 2.7)to fileutilsclass
    //35
    public File screenshot(WebDriver driver,String path) {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File des=new File(path);
		 if(true) {
		 return src;
		 }
	 
		 return des;
		 
    }
    //alert
    //36
    public void alertAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();	

	}
    //37
    public void alertDismiss(WebDriver driver) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
    //38
    
    public String alertText(WebDriver driver) {
		 Alert alert=driver.switchTo().alert();
		 String text = alert.getText();
		 return text;
	}
    //***************alertclsed****************
    //Frames
    //39
    public void framesId(WebDriver driver,String id) {
		 driver.switchTo().frame(id);
	}
    //40
    public void framesString(WebDriver driver,String str) {
		 driver.switchTo().frame(str);
	}
    //41
    public void frmaewebelement(WebDriver driver,WebElement element) {
		 driver.switchTo().frame(element);

	}
    //42
    public void frameIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);

	}
    //******************frames clsd*******************
    //dropdown//select//options
    //43
    public void selectIndex(WebElement element,int i) {
    	Select s=new Select(element);
    	s.selectByIndex(i);
	}
    //44
     public void selectValue(WebElement element,String str) {
    	 Select s=new Select(element);
     	  s.selectByValue(str);
	}
     //45
     public static void selectVisible(WebElement element,String str) {
    	 Select s=new Select(element);
     	 s.selectByVisibleText(str);
	}
     //46
     public boolean selectmultiple(WebElement element) {
    	 Select s=new Select(element);
     	   boolean mul = s.isMultiple();
     	   return mul;
	}
     //47
     public String[] selectOption(WebElement element) {
    	 Select s=new Select(element);
    	 String[] str=new String[100];
    	 List<WebElement> options = s.getOptions();
    	 for(int i=0;i<options.size();i++) {
    		 WebElement webElement = options.get(i);
    		 String text = webElement.getText();
    		 str[i]=text;
    		 
    	 }
		return str;  	 

	}
     //48
     public String[] selectGetattr(WebElement element) {
    	 Select s=new Select(element);
    	 String[] str=new String[100];
    	 List<WebElement> options = s.getOptions();
    	 for (int i = 0; i < options.size(); i++) {
    		 WebElement webElement = options.get(i);
    		 String text = webElement.getAttribute("value");
    		 str[i]=text;
			
		}
    	 return str;

	}
     //49
     public String[] selectGetoption(WebElement element) {
    	 Select s=new Select(element);
    	 String[] str=new String[100];
    	 List<WebElement> all = s.getAllSelectedOptions();
    	 for (int i = 0; i<all.size()  ; i++) {
    		 WebElement webElement = all.get(i);
    		 String text = webElement.getText();
    		 str[i]=text;
			
		}
    	 return str;
	}
     //50
     public String[] selectGetattri(WebElement element) {
    	 Select s=new Select(element);
    	 String[] str=new String[100];
    	 List<WebElement> all = s.getAllSelectedOptions();
    	 for (int i = 0; i<all.size()  ; i++) {
    		 WebElement webElement = all.get(i);
    		 String text = webElement.getAttribute("value");
    		 str[i]=text;
			
		}
    	 return str;

	}
     //51
     public void deselectVisible(WebElement element,String str) {
    	 Select s=new Select(element);
     	 s.deselectByVisibleText(str);
     }
     //52
     public void deselectValue(WebElement element,String str) {
    	 Select s=new Select(element);
     	 s.deselectByValue(str);
     }
     //53
     public void deselectIndex(WebElement element,int i) {
    	 Select s=new Select(element);
     	 s.deselectByIndex(i);
     }
     //54
     public void deselectAll(WebElement element,String str) {
    	 Select s=new Select(element);
     	 s.deselectAll();
     }
     //***************************selectclsed**************
     //WindowsHandling
      public static String inVoke(WebDriver driver) {
    	String parid = driver.getWindowHandle();
    	  return  parid;
	}
      public void windowsHandles(WebDriver driver) {
    	  String inVoke = BaseClass.inVoke(driver);
		 Set<String> windowHandles = driver.getWindowHandles();
		 for (String str : windowHandles) {
			 if(!inVoke.equals(str)) {
				 driver.switchTo().window(str);
			 }	 
			
		}
		 

	}
     public void multipleWindows(WebDriver driver,int i) {
     BaseClass.inVoke(driver); 
   	 Set<String> wH = driver.getWindowHandles();
   	 List<String> list=new ArrayList<>();
   	 list.addAll(wH);
   	  driver.switchTo().window(list.get(i));
		
	}
     public void multiplesetWindows(WebDriver driver,String str) {
    	 BaseClass.inVoke(driver); 
       	 Set<String> wH = driver.getWindowHandles();
       	 for (String x: wH) {
       		 driver.switchTo().window(x);
       		 String title=driver.getTitle();
       		 if (title.contains(str)) {
       			 //unused*********************	
			}
			
		}

	}
     
     
   	 
 
   		 
	}
   	 
		

	
     
     
     
     
     
    
    
    
    
    




	


