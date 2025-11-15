package b10.com.example.b10.controller;



import b10.com.example.b10.Models.HelpRequest;
import b10.com.example.b10.service.HelpRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/help")
@CrossOrigin(origins = "http://localhost:3000") // ✅ For your React frontend
public class HelpRequestController {

    @Autowired
    private HelpRequestService service;

    // ✅ Submit new help request
    @PostMapping("/request")
    public HelpRequest submitHelpRequest(@RequestBody HelpRequest request) {
        return service.saveRequest(request);
    }

    // ✅ Optional: fetch all help requests (for admin/volunteer dashboard)
    @GetMapping("/all")
    public List<HelpRequest> getAllHelpRequests() {
        return service.getAllRequests();
    }
}
