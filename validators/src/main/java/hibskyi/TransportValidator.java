package hibskyi;

import java.lang.reflect.Field;
import java.util.List;

public class TransportValidator {

    private static final List<String> COLORS =
            List.of("red", "orange", "yellow", "green", "blue", "violet", "white", "black");

    private static final String LICENSE_PLATE_REGEX =
            "^[АВЕКМНОРСТУХABEKMHOPCTYX]{2}\\d{4}[АВЕКМНОРСТУХABEKMHOPCTYX]{2}$";

    public static void validate(Object obj) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(Color.class)) {
                String color = (String) field.get(obj);
                if (color == null || !COLORS.contains(color.toLowerCase())) {
                    throw new IllegalArgumentException("Invalid color value");
                }
            }

            if (field.isAnnotationPresent(PositiveNumber.class)) {
                int number = (int) field.get(obj);
                if (number <= 0) {
                    throw new IllegalArgumentException("Invalid number value");
                }
            }

            if (field.isAnnotationPresent(LicensePlate.class)) {
                String licensePlate = (String) field.get(obj);
                if (licensePlate == null || !licensePlate.matches(LICENSE_PLATE_REGEX)) {
                    throw new IllegalArgumentException("Invalid license plate value");
                }
            }
        }
    }
}
