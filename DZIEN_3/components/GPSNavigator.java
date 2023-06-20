package marcin.com.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "ul.Złota 6/2, Kraków";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return this.route;
    }
}
