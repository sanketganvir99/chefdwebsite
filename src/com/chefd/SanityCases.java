package com.chefd;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SanityCases extends ChefdBaseClass{

	@BeforeClass
	public void launch_chefd(){
		
		Assert.assertTrue(launchChefd(), "Chefd launching failed");
		System.out.println("Chefd launched successfully");
	}
	
	@Test(priority=0)
	public void how_it_works(){
		Assert.assertTrue(howItWorks(), "How It Works fails to function");
		System.out.println("How It Works is functioning successfully");
		
	}
	
	@Test(priority=1)
	public void email_Gifts_Card(){
		Assert.assertTrue(emailGiftsCard(), "Adding Email Gift Card to the cart Failed");
		System.out.println("Email Gift Card added to cart successfully");
		
	}
	
	
	@Test
	public void physical_Gifts_Card(){
		Assert.assertTrue(physicalGiftsCard(), "Adding Physical Gift Card to the cart Failed");
		System.out.println("Physical Gift Card added to cart successfully");
		
	}
	
	
	@Test(priority=2)
	public void add_Receipe_To_cart_from_AllMeals(){
		Assert.assertTrue(addReceipeTocartfromAllMeals(), "Adding Physical Gift Card to the cart Failed");
		System.out.println("Receipe added to cart successfully");
		
	}
	
	@Test(priority=2)
	public void log_in(){
		Assert.assertTrue(addReceipeTocartfromAllMeals(), "Adding Physical Gift Card to the cart Failed");
		System.out.println("Receipe added to cart successfully");
		
	}
	
	
	
	@Test(dependsOnMethods = { "add_Receipe_To_cart_from_AllMeals" }, priority = 3)
	public void regular_Checkout(){
		Assert.assertTrue(regularCheckout(), "Regular Checkout Failed");
		System.out.println("Regular Checkout was successfull");
		
	}
	
	
	
	
	
	
	
}
