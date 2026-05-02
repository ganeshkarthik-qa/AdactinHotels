Feature:
	to validate the Adactin hotel bookings functionality.
		
Scenario:
	Validating adactin hotels bookings by providing valid input and valid password.

Given user should be in the adactin hotels login page.

When user should pass valid username and password.

And user should click the login button.

And  user should be in the search hotels page.

And user should select the location,hotels,roomtypes,number of rooms using dropdowns.

And user should enter the check in and check out dates.

And user should select  details of adults per room and children per room using dropdowns.

And user should click on search button.
	
And user should be in the select hotel page.

And user should validate the details given is correct or not.

And if it is correct then select the hotel.

And user should click the continue button.
	
And user should be in the book hotel page.

And user should enter his/her first name,last name and address details for billing.

And user should enter credit card number.

And user should select credit card type,expiry month and expiry year.

And user should enter cvv number.

And user should click book now button.

And user should be redirected to bookingconfirm page.

And user should be in the booking confirm page.

And user should click my itinerary button.

And user should check whether the hotel is booked or not.

Then user had booked hotel successfully.