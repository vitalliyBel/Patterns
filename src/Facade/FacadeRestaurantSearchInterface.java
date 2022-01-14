package Facade;

public class FacadeRestaurantSearchInterface {

    private GlonasInfo glonasInfo;
    private RestaurantRating restaurantRating;
    private BookingTable bookingTable;
    private MakingRoute makingRoute;

    public FacadeRestaurantSearchInterface(GlonasInfo glonasInfo, RestaurantRating restaurantRating,
                                           BookingTable bookingTable, MakingRoute makingRoute){
        this.glonasInfo = glonasInfo;
        this.restaurantRating = restaurantRating;
        this.bookingTable = bookingTable;
        this.makingRoute = makingRoute;
    }

    public void launchingRestaurantSearch (){
        glonasInfo.downloadInfoFromSatellite();
        restaurantRating.ratingAssessment();
        bookingTable.automaticBooking();
        makingRoute.creatingRoute();
    }

}
