package johnoliver.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ElementoCatalogo {
    @Id
    @GeneratedValue
    private UUID codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    // Costruttori
    public ElementoCatalogo(UUID codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public ElementoCatalogo() {

    }

    // Generato da intellij perchè non riuscivo a risolvere dei problemi (consiglio i libri o audiolibri)
    public ElementoCatalogo(String number, String LaTrilogiaDiLicanius, int i, int i1, String s, String libro) {
    }

    // Getter e setter vari da generate..
    public UUID getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(UUID codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}
