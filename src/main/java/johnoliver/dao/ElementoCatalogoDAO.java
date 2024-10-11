package johnoliver.dao;

import johnoliver.entities.ElementoCatalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class ElementoCatalogoDAO {
    private final javax.persistence.EntityManager entityManager;

    // Costruttore per EntityManager
    public ElementoCatalogoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Salvo un nuovo elemento nel catalogo
    public void save(ElementoCatalogo elementoCatalogo) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(elementoCatalogo);
        transaction.commit();
        System.out.println("Elemento salvato: " + elementoCatalogo.getTitolo());
    }

    // Trovo un elemento del catalogo per il suo ID (Codice ISBN)
    public ElementoCatalogo findById(String isbn) {
        return entityManager.find(ElementoCatalogo.class, isbn);
    }

    // Ritorno tutti gli elementi del catalogo
    public List<ElementoCatalogo> findAll() {
        TypedQuery<ElementoCatalogo> query = entityManager.createQuery("SELECT e FROM ElementoCatalogo e", ElementoCatalogo.class);
        return query.getResultList();
    }

    // Trovo tutti gli elementi cercando il titolo
    public List<ElementoCatalogo> findByTitle(String title) {
        TypedQuery<ElementoCatalogo> query = entityManager.createQuery("SELECT e FROM ElementoCatalogo e WHERE e.titolo LIKE :title", ElementoCatalogo.class);
        query.setParameter("title", "%" + title + "%");
        return query.getResultList();
    }
}

