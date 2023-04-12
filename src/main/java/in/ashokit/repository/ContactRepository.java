package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
	public List<Contact> findByActiveSw(String status);
   
}
