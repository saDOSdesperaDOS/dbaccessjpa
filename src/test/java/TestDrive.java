import crud.NoteService;
import entities.Note;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDrive {

    public static void main(String[] args) {
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        EntityManager em = emf.createEntityManager();
        System.out.println(em.getProperties());*/
        NoteService sqlRequest = new NoteService();
        /*Note note = new Note();
        note.setTittle("noteTittle4");
        note.setTextArea("noteTextArea4");
        sqlRequest.add(note);*/
        sqlRequest.delete(19);

    }
}
