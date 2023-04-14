Part 1 - Test cases

-> We should unable to make an appointment for some time slot when user is not loggedin
	. precondition - user should not logged in 
	. land on (https://www.zoomcare.com/schedule url 
	.validate by default we should be on clinic care window and having list of doctor available with the available time slots
	. click on time to schedule an appointment
	. we should redirect to login page where we could login with existing user or we could create a new account

->To verify use current location functionality 
	. Open the location filter and click on use current location.
	. If service is not available in our location then we should get the error message "We're not in your area yet—but we're growing almost as fast as we deliver care!" and still no location should get selected 
	. If service is already available forthe current location it should get selected
	.Also try for the other location options provided in the dropdwn and it should work as expected.

-> We should be able to schedule the appointment on schedule time if user is logged in 
	. precondition - user should not logged in 
	. land on (https://www.zoomcare.com/schedule) url 
	. validate by default we should be on clinic care window and having list of doctor available with the available time slots
	. click on time to schedule an appointment
	. we should not redirect to login page and we should be able to schedule the appointemt on the specified time on which we had clicked

-> We should verify that the search is working fine after filling whole search criteria on the schedule page

	. select the location from the dropdown search should be disabled until we are filling service and date
	. select service and date and search button should get enabled.
	. click on search.
	. for both video care and clinic care the doctor's provided services , location and availablity should be according to the search criteria.


-> we should verify that on clicking clinic-care and video-care back and forth we should get the related list loaded accoringly
	. On clicking clinic-care we should get the list of the doctors accordingly and option should be highlight.
	. Also verify the list in clinic-care should be  of doctors who provide clinic care.
	. On clicking video-care  we should get the list of the doctors accordingly and option should be highlight.
	. Also verify the list in video-care should be  of doctors who provide provide services on video.

-> To verify the location on opening the map from zoomcare should be same as what we are having on the application.
	. Perform a search and get the clinic care list.
	. make a track on the location of clinic and for the same clinic click on location icon.
	. new tab of google map will open with the location marked on map.
	. verify the location on google map is same as that  which is mentioned in clinic care list for same clinic.

-> To perform search on service and verify the clinic which we are getting in the list are providing the same service.
	. Perform search on service and from the list for any clinic click "View Clinical Services".
	. The service which we selected on search should be there 

-> To verify date in search is geting updated and getting triggered on clicking next available date from clinic tuple.
	. Perform a search in which we willl get clinic with the tuple on which it will be there that "Next available date is "
	. click on that next available date and verify search should get updated.



----------------------------------------------------------
Part 2 - Test cases Automated

-> To perform search on service and verify the clinic which we are getting in the list are providing the same service.
	. Perform search on service and from the list for any clinic click "View Clinical Services".
	. The service which we selected on search should be there 

-> To verify the location on opening the map from zoomcare should be same as what we are having on the application.
	. Perform a search and get the clinic care list.
	. make a track on the location of clinic and for the same clinic click on location icon.
	. new tab of google map will open with the location marked on map.
	. verify the location on google map is same as that  which is mentioned in clinic care list for same clinic

-> we should verify that on clicking clinic-care and video-care back and forth we should get the related list loaded accoringly
	. On clicking clinic-care we should get the list of the doctors accordingly and option should be highlight.
	. Also verify the list in clinic-care should be  of doctors who provide clinic care.
	. On clicking video-care  we should get the list of the doctors accordingly and option should be highlight.
	. Also verify the list in video-care should be  of doctors who provide provide services on video.

