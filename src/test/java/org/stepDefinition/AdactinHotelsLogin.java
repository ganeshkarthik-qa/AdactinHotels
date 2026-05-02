package org.stepDefinition;

import org.pojo.AdactinHotelsPOJO;
import org.util.BaseClass;

import io.cucumber.java.en.*;

public class AdactinHotelsLogin extends BaseClass {

	AdactinHotelsPOJO ad;
	
	@Given("user should be in the adactin hotels login page.")
	public void userShouldBeInTheAdactinHotelsLoginPage() {
	  browserLaunch();
	  implicitWait(10);
	  maxWindow();
	  launchUrl("https://adactinhotelapp.com/index.php");
	}
	
	@When("user should pass valid username and password.")
	public void userShouldPassValidUsernameAndPassword() {
	  
		ad=new AdactinHotelsPOJO();
		sendText(ad.getUserName(),"karthickmg");
		sendText(ad.getPwdBox(), "@MGKarthik317");
	}
	
	@When("user should click the login button.")
	public void userShouldClickTheLoginButton() {
	   btnClick(ad.getLogInBtn());
	}
	
	@When("user should be in the search hotels page.")
	public void userShouldBeInTheSearchHotelsPage() {
	   
	}
	
	@When("user should select the location,hotels,roomtypes,number of rooms using dropdowns.")
	public void userShouldSelectTheLocationHotelsRoomtypesNumberOfRoomsUsingDropdowns() {
	
		dropDown(ad.getLocationDD(), "Adelaide");
		dropDown(ad.getHotelDD(), "Hotel Sunshine");
		dropDown(ad.getRoomTypeDD(), "Super Deluxe");
		dropDown(ad.getRoomNosDD(),"2");
	}
	
	@When("user should enter the check in and check out dates.")
	public void userShouldEnterTheCheckInAndCheckOutDates() {
	ad.getCheckInText().clear();
	sendText(ad.getCheckInText(), "01/05/2026");
	ad.getCheckOutText().clear();
	sendText(ad.getCheckOutText(),"06/05/2026");
	}	
	
	@When("user should select  details of adults per room and children per room using dropdowns.")
	public void userShouldSelectDetailsOfAdultsPerRoomAndChildrenPerRoomUsingDropdowns() {
	  dropDown(ad.getAdultRoomDD(),"4");
	  dropDown(ad.getChildRoomDD(), "2");
	}
	
	@When("user should click on search button.")
	public void userShouldClickOnSearchButton() {
	btnClick(ad.getSearchBtn()); 
	}
	
	@When("user should be in the select hotel page.")
	public void userShouldBeInTheSelectHotelPage() {}
	
	@When("user should validate the details given is correct or not.")
	public void userShouldValidateTheDetailsGivenIsCorrectOrNot() {}
	
	@When("if it is correct then select the hotel.")
	public void ifItIsCorrectThenSelectTheHotel() {
	   btnClick(ad.getRadioBtn());
	}
	
	@When("user should click the continue button.")
	public void userShouldClickTheContinueButton() {
	btnClick(ad.getContinueBtn());
	}
	
	@When("user should be in the book hotel page.")
	public void userShouldBeInTheBookHotelPage() {}
	
	@When("user should enter his\\/her first name,last name and address details for billing.")
	public void userShouldEnterHisHerFirstNameLastNameAndAddressDetailsForBilling() {
	 sendText(ad.getFirstName(),"GaneshKarthick");
	 sendText(ad.getLastName(), "M");
	 sendText(ad.getAddress(), "D67,Periyar nagar,Tiruvanmiyur,Chennai-600041 ");
	}
	
	@When("user should enter credit card number.")
	public void userShouldEnterCreditCardNumber() {
	    sendText(ad.getCreditCardNo(), "1537191209374658");
	}
	
	@When("user should select credit card type,expiry month and expiry year.")
	public void userShouldSelectCreditCardTypeExpiryMonthAndExpiryYear() {
	    dropDown(ad.getCreditCardDD(), "AMEX");
	    dropDown(ad.getCcexpiryMonDD(), "7");
	    dropDown(ad.getCcexpiryYearDD(),"2028");	
	}
	
	@When("user should enter cvv number.")
	public void userShouldEnterCvvNumber() {
	 sendText(ad.getCvvNo(), "953");
	}
	
	@When("user should click book now button.")
	public void userShouldClickBookNowButton() {
	  btnClick(ad.getBookNowBtn());
	}
	
	@When("user should be redirected to bookingconfirm page.")
	public void userShouldBeRedirectedToBookingconfirmPage() {
		orderNo();
		}
	
	@When("user should be in the booking confirm page.")
	public void userShouldBeInTheBookingConfirmPage() {
		
	}
	
	@When("user should click my itinerary button.")
	public void userShouldClickMyItineraryButton() {
	btnClick(ad.getMyItineraryBtn());
	}
	
	@When("user should check whether the hotel is booked or not.")
	public void userShouldCheckWhetherTheHotelIsBookedOrNot() throws InterruptedException {
		sendText(ad.getSearchId(), ordno);
		btnClick(ad.getGoBtn());
		Thread.sleep(3000);
		
	}
	
	@Then("user had booked hotel successfully.")
	public void userHadBookedHotelSuccessfully() {
		System.out.println("user had booked hotel successfully.");
		quitBrowser();
	}
}
