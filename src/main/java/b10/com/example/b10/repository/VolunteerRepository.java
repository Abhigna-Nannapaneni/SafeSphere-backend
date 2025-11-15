package b10.com.example.b10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import b10.com.example.b10.Models.Volunteer;   // ✅ corrected import
import java.util.Optional;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    Optional<Volunteer> findByEmail(String email);
}
