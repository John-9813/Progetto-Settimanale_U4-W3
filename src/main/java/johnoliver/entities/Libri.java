package johnoliver.entities;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Libri extends ElementoCatalogo {
    private String autore;
    private String genere;

    public Libri(UUID codiceISBN) {
        super(codiceISBN);
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
