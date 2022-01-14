package Facade;

public class FacadeTestStart {
    public static void main(String[] args) {
       GlonasInfo glonasInfo = new GlonasInfo();
       RestaurantRating restaurantRating = new RestaurantRating();
       BookingTable bookingTable = new BookingTable();
       MakingRoute makingRoute = new MakingRoute();

       FacadeRestaurantSearchInterface searchRestaurant = new FacadeRestaurantSearchInterface(glonasInfo,
               restaurantRating, bookingTable, makingRoute);

       //Пользователь включает поиск ресторана
        searchRestaurant.launchingRestaurantSearch();

    }
}
