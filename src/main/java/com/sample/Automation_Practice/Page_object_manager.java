package com.sample.Automation_Practice;

import org.openqa.selenium.WebDriver;

public class Page_object_manager {
	
	
		public WebDriver driver;
		private  Login_page lp;
		private   Home_Page hp;
		private   Select_Item si;
		private  Subcategory_page sp;
		private   Proceed p;
		public Page_object_manager(WebDriver driver)
		{
			this.driver=driver;
		}
		public Login_page getInstancelp()
		{
			if(lp==null)
			{
			lp=new Login_page(driver);
			}
			return lp;
		}

			public Home_Page getInstancehp() {
				if(hp==null)
				{
				hp=new Home_Page(driver);
				}
			return hp;
		}

		public Select_Item getInstancesi() {
			if(si==null)
			{
				si=new Select_Item(driver);
				}
			return si;
		}

		public Proceed getInstancep() {
			if(p==null)
			{
			p=new Proceed(driver);
			}
			return p;
		}
		public Subcategory_page getInstancesp()
		{
			if(sp==null)
			{
				sp= new Subcategory_page(driver);
			}
			return sp;
		}
		
}
	



