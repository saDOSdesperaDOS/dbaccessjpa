package crud;

import entities.Note;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class NoteService {

    EntityManager em = Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();

    public Note add(Note note) {
        em.getTransaction().begin();
        Note noteFromDB = em.merge(note);
        em.getTransaction().commit();
        return  noteFromDB;
    }
    public void delete(int id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }
    public Note get(int id) {
        return em.find(Note.class, id);
    }
}
