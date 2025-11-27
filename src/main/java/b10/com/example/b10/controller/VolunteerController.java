package b10.com.example.b10.controller;



import b10.com.example.b10.Models.Volunteer;
import b10.com.example.b10.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for volunteer registration and login.
 */
@RestController
@RequestMapping("/api/volunteer")
@CrossOrigin(origins = "*") // ✅ allows React frontend to connect
public class VolunteerController {

    @Autowired
    private VolunteerService service;

    // ✅ Register a new volunteer
    @PostMapping("/signup")
    public Volunteer signup(@RequestBody Volunteer volunteer) {
        return service.register(volunteer);
    }

    // ✅ Volunteer login
    @PostMapping("/login")
    public Volunteer login(@RequestBody Volunteer volunteer) {
        return service.login(volunteer.getEmail(), volunteer.getPassword());
    }
    @GetMapping("/test")
public String test() {
    return "BACKEND IS WORKING! Time: " + System.currentTimeMillis();
}
}
