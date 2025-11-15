package b10.com.example.b10.service;

import b10.com.example.b10.Models.Volunteer;
import b10.com.example.b10.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository repository;

    public Volunteer register(Volunteer volunteer) {
        // ✅ TEMPORARY FIX: Allow duplicate emails for demo
        System.out.println("DEMO: Registering - " + volunteer.getEmail());
        
        // Check if email exists, but don't throw error
        if (repository.findByEmail(volunteer.getEmail()).isPresent()) {
            System.out.println("DEMO: Email exists but allowing for demo");
        }
        
        return repository.save(volunteer);
    }

    public Volunteer login(String email, String password) {
        Optional<Volunteer> user = repository.findByEmail(email);
        
        if (user.isEmpty()) {
            throw new RuntimeException("Email not found");
        }
        
        if (!user.get().getPassword().equals(password)) {
            throw new RuntimeException("Incorrect password");
        }
        
        return user.get();
    }
}