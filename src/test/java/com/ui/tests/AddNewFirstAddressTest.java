package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.AddressPage;
import com.ui.pages.MyAccountPage;
import com.ui.pojo.AddressPOJO;
import com.utility.FakeAddressUtility;

public class AddNewFirstAddressTest extends TestBase {

	private MyAccountPage myAccountPage;
	private AddressPOJO address;
	
	
	@BeforeMethod(description="Valid First Time user logs into the application")
	public void setUp() {
	
		myAccountPage = homePage.goToLoginPage().doLoginWith("fekake3041@ofacer.com", "admin123");
		address = FakeAddressUtility.getfakeAdrress();
		
	}
	
	
	
	@Test()
	public void addNewAddress() {
		String newAddress = myAccountPage.goToAddAddressPage().saveAddress(address);
		Assert.assertEquals(newAddress, address.getAddressAlias().toUpperCase());
	}
	
	
	
}
