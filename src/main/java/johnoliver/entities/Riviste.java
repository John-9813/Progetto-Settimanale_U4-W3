package johnoliver.entities;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Riviste extends ElementoCatalogo {
    private String periodicità;

    public Riviste(UUID codiceISBN) {
        super(codiceISBN);
    }

    public String getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(String periodicità) {
        this.periodicità = periodicità;
    }
}
