package johnoliver;

import johnoliver.dao.ElementoCatalogoDAO;
import johnoliver.dao.UtenteDAO;
import johnoliver.entities.ElementoCatalogo;
import johnoliver.entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {

        // Crea l'EntityManagerFactory per la connessione al database
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d13");
        EntityManager entityManager = emf.createEntityManager();

        // Creazione DAO
        ElementoCatalogoDAO elementoCatalogoDAO = new ElementoCatalogoDAO(entityManager);
        UtenteDAO utenteDAO = new UtenteDAO(entityManager);

        // Creazione di un nuovo utente
        Utente utente = new Utente("John", "Oliveira", LocalDate.of(1998, 5, 15), UUID.randomUUID());
        utenteDAO.save(utente);

        // Creazione di un nuovo elemento del catalogo
        ElementoCatalogo libro;
        libro = new ElementoCatalogo("1234567890", "La trilogia di Licanius", 2021, 13, " James Islington", "Libro");
        elementoCatalogoDAO.save(libro);

        // Non faccio in tempo a fare il resto..

        // Chiusura dell'EntityManager e entityManagerFactory
        entityManager.close();
        emf.close();
    }
}
