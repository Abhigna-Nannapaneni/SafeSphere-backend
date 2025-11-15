package b10.com.example.b10.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import b10.com.example.b10.Models.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> { }
