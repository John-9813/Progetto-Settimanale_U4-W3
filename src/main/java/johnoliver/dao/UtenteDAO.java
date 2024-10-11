package johnoliver.dao;

import johnoliver.entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class UtenteDAO {
    private final EntityManager entityManager;

    // Costruttore che accetta l'EntityManager per gestire le operazioni di persistenza
    public UtenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Salva un nuovo utente
    public void save(Utente utente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(utente);
        transaction.commit();
        System.out.println("Utente salvato: " + utente.getNome() + " " + utente.getCognome());
    }

    // Cerco un utente per il suo numero di tessera
    public Utente findById(String numeroTessera) {
        return entityManager.find(Utente.class, numeroTessera);
    }

    // Ritorno tutti gli utenti
    public List<Utente> findAll() {
        TypedQuery<Utente> query = entityManager.createQuery("SELECT u FROM Utente u", Utente.class);
        return query.getResultList();
    }
}

