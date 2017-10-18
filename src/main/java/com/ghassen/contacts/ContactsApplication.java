package com.ghassen.contacts;

import com.ghassen.contacts.dao.ContactRepository;
import com.ghassen.contacts.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ContactsApplication implements CommandLineRunner{

    @Autowired //injection des dependences
    private ContactRepository contactRepository;

    public static void main(String[] args) {
        SpringApplication.run(ContactsApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        contactRepository.save(new Contact("Ghassen","Elloumi",df.parse("29/05/1994"),"ghassen.elloumi@enis.tn",55377640,"ghassen.jpg"));
        contactRepository.save(new Contact("Sirine","Elloumi",df.parse("20/08/1996"),"sirine.elloumi@enis.tn",55377640,"sirine.jpg"));

        contactRepository.findAll().forEach(c -> {
            System.out.println(c.getNom());
        });

    }
}
