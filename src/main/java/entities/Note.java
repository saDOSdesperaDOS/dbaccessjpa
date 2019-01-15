package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "notestable")
public class Note implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "tittle")
    private String tittle;
    @Column(name = "textArea")
    private String textArea;


    public Note() {}

    public int getId() {
        return id;
    }

    public String getTextArea() {
        return textArea;
    }

    public String getTittle() {
        return tittle;
    }

    public void  setNoteArg(int id, String tittle, String textArea) {
        this.tittle=tittle;
        this.textArea=textArea;
        this.id=id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTextArea(String textArea) {
        //this.tittle = textArea.substring(0, 10);
        this.textArea = textArea;
    }

    public void setTittle(String tittle) { this.tittle = tittle;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note that = (Note) o;

        if (id != that.id) return false;
        if (tittle != null ? !tittle.equals(that.tittle) : that.tittle != null) return false;
        if (textArea != null ? !textArea.equals(that.textArea) : that.textArea != null) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tittle != null ? tittle.hashCode() : 0);
        result = 31 * result + (textArea != null ? textArea.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "entities.Note{" +
                "textArea='" + textArea + '\'' +
                '}';
    }
}
