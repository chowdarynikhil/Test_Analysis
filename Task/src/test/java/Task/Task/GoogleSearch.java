package Task.Task;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GoogleSearch {
	
	@FindBy(id="lst-ib")
	private WebElement searchengine;
	
	
	
	@FindBy(xpath="//div[@class='sbqs_c']")
	private List<WebElement> alllinks;
	
	
	
	public GoogleSearch(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Enter text
	public void keys(String text)
	{
		searchengine.sendKeys(text);
	}
	
	//to print text and count
	public void text_count() throws InterruptedException
	{
		Thread.sleep(1000);
		int count = alllinks.size();
		System.out.println("Link counts  : "+count);
		System.out.println("Auto Sugestion list : ");
		for(WebElement links : alllinks)
		{
			String list = links.getText();
			System.out.println(list);
		}
		
		
	}
	
	
	
}