package be.drissamri;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShipmentController {

    @Get("/shipment")
    List<String> list() {
        final ArrayList<String> result = new ArrayList<>();
        result.add("joe de mannen");
        return result;
    }
}
