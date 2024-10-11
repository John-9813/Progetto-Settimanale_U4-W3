package johnoliver.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    private UUID idPrestito;

    @OneToOne
    private Utente utente;

    @OneToOne
    private ElementoCatalogo elementoPrestato;

    // https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html (dove ho cercato per usare LocalDate) e preso spunto dalla soluzione dell'esercizio di ieri
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    public Prestito() {
        this.dataRestituzionePrevista = this.dataInizioPrestito.plusDays(30);
    }
}
