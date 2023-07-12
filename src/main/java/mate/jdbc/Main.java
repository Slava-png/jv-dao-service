package mate.jdbc;

import mate.jdbc.lib.Injector;
import mate.jdbc.model.Driver;
import mate.jdbc.service.DriverService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.jdbc");

    public static void main(String[] args) {
        DriverService driverService = (DriverService) injector.getInstance(DriverService.class);

        Driver driver = new Driver(1L, "Alex", "0000");
        driverService.create(driver);

        driverService.update(new Driver(8L, "Harry", "2983"));
        System.out.println(driverService.delete(8881L));
        driverService.getAll().forEach(System.out::println);

        driverService.get(2L);
        driverService.get(10L);
    }
}
