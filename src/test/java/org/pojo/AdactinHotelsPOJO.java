package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.util.BaseClass;

public class AdactinHotelsPOJO extends BaseClass {

	public AdactinHotelsPOJO(){
	
	PageFactory.initElements(driver, this);	
}
		
public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwdBox() {
		return pwdBox;
	}

	public WebElement getLogInBtn() {
		return logInBtn;
	}

	public WebElement getLocationDD() {
		return locationDD;
	}

	public WebElement getHotelDD() {
		return hotelDD;
	}

	public WebElement getRoomTypeDD() {
		return roomTypeDD;
	}

	public WebElement getRoomNosDD() {
		return roomNosDD;
	}

	public WebElement getCheckInText() {
		return checkInText;
	}

	public WebElement getCheckOutText() {
		return checkOutText;
	}

	public WebElement getAdultRoomDD() {
		return adultRoomDD;
	}

	public WebElement getChildRoomDD() {
		return childRoomDD;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardDD() {
		return creditCardDD;
	}

	public WebElement getCcexpiryMonDD() {
		return ccexpiryMonDD;
	}

	public WebElement getCcexpiryYearDD() {
		return ccexpiryYearDD;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
	public WebElement getMyItineraryBtn() {
		return myItineraryBtn;
	}

	public WebElement getOrderId() {
		return orderID;
	}
	
	public WebElement getSearchId() {
		return searchID;
	}

	public WebElement getGoBtn() {
		return goBtn;
	}

@FindBy(id="username")
private WebElement userName;

@FindBy(name="password")
private WebElement pwdBox;

@FindBy(name="login")
private WebElement logInBtn;

@FindBy(name="location")
private WebElement locationDD;

@FindBy(id="hotels")
private WebElement hotelDD;

@FindBy(name="room_type")
private WebElement roomTypeDD;

@FindBy(id="room_nos")
private WebElement roomNosDD;

@FindBy(name="datepick_in")
private WebElement checkInText;

@FindBy(id="datepick_out")
private WebElement checkOutText;

@FindBy(name="adult_room")
private WebElement adultRoomDD;

@FindBy(id="child_room")
private WebElement childRoomDD;

@FindBy(id="Submit")
private WebElement searchBtn;

@FindBy(id="radiobutton_0")
private WebElement radioBtn;

@FindBy(id="continue")
private WebElement continueBtn;

@FindBy(id="first_name")
private WebElement firstName;

@FindBy(id="last_name")
private WebElement lastName;

@FindBy(id="address")
private WebElement address;

@FindBy(id="cc_num")
private WebElement creditCardNo;

@FindBy(id="cc_type")
private WebElement creditCardDD;

@FindBy(name="cc_exp_month")
private WebElement ccexpiryMonDD;

@FindBy(id="cc_exp_year")
private WebElement ccexpiryYearDD;

@FindBy(id="cc_cvv")
private WebElement cvvNo;

@FindBy(id="book_now")
private WebElement bookNowBtn;

@FindBy(id="my_itinerary")
private WebElement myItineraryBtn;

@FindBy(id="order_id_text")
private WebElement orderID;

@FindBy(id="order_id_text")
private WebElement searchID;

@FindBy(id="search_hotel_id")
private WebElement goBtn;

}
