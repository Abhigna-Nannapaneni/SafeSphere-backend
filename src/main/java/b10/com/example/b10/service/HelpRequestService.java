package b10.com.example.b10.service;



import b10.com.example.b10.Models.HelpRequest;
import b10.com.example.b10.repository.HelpRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HelpRequestService {

    @Autowired
    private HelpRequestRepository repository;

    public HelpRequest saveRequest(HelpRequest request) {
        return repository.save(request);
    }

    public List<HelpRequest> getAllRequests() {
        return repository.findAll();
    }
}
