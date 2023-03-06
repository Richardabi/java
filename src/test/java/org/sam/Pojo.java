package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass1{

	public Pojo() {
		PageFactory.initElements( driver, this);
		}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
}
