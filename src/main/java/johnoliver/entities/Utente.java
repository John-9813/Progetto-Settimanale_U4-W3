package johnoliver.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Utente {
    @Id
    @GeneratedValue
    private UUID numeroTessera;
    private String nome;
    private String cognome;
    private String dataDiNascità;

    public Utente() {
    }

    // Generato da intellij perchè non riuscivo a risolvere dei problemi..
    public Utente(String mario, String rossi, LocalDate of, UUID uuid) {
    }

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(UUID numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascità() {
        return dataDiNascità;
    }

    public void setDataDiNascità(String dataDiNascità) {
        this.dataDiNascità = dataDiNascità;
    }
}
