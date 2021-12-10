package org.samp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo  extends BaseClass {
	 
	  
	 
	public Pojo() {
		
		 
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement deparatureCity;
	@FindBy(xpath="//Select[@name='toPort']")
	private WebElement destinationCity;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement findFlights;
	@FindBy(xpath="(//div[@class='container'])[2]")
	private WebElement select;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private List<WebElement> charge1;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private List<WebElement> charge2;
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private List<WebElement> charge3;
	@FindBy(xpath="(//input[@type='submit'])[4]")
	private List<WebElement> charge4;
	@FindBy(xpath="(//input[@type='submit'])[5]")
	private List<WebElement> charge5;
	
	
	
	public List<WebElement> getCharge2() {
		return charge2;
	}
	public List<WebElement> getCharge3() {
		return charge3;
	}
	public List<WebElement> getCharge4() {
		return charge4;
	}
	public List<WebElement> getCharge5() {
		return charge5;
	}
	public List<WebElement> getCharge1() {
		
		return charge1;
	}
	public WebElement getDeparatureCity() {
		return deparatureCity;
	}
	public WebElement getDestinationCity() {
		return destinationCity;
	}
	public WebElement getFindFlights() {
		return findFlights;
	}
   public  WebElement getSelect() {
	return select;
   }
	 
	
	
 
	
	
	
	
	

}
