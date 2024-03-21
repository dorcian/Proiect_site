package controller;

import model.Trip;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class TripController {


    
    @GetMapping("/index")
    public String getIndexPage(Model model) {
        // Assuming you have a method in TripRepository to get trips
        List<Trip> trips = List.of(new Trip()); // Replace this with appropriate method call
        model.addAttribute("trips", trips);
        return "index"; // This corresponds to index.html in src/main/resources/templates
    }

    @GetMapping("/")
    public String getHomePage() {
        return "home"; // This corresponds to home.html in src/main/resources/templates
    }
}
