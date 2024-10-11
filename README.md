# Progetto-Settimanale_U4-W3

Descrizione scelte diagramma:

Inizialmente avevo creato 4 tabelle; Libri, Riviste, Utente e Prestito.
Cercare di collegarle tra loro mi sembrava di star creando un modo troppo comlicato,
inoltre, molti attributi erano condivisi tra i Libri e le Riviste, pertanto ho creato una tabella Elemento del catalogo,
prendendo anche spunto dalla traccia della quinta slide (a cui non riuscirò ad arrivare in mezza giornata già lo so).

Elemento del catalogo si collega in modo one-to-many ai libri e alle riviste perchè
penso possano esserci più libri e riviste per un singolo catalogo ma non viceversa,
mentre i collegamenti con elemento catalogo, prestito e utente sono one-to-one perchè
si può richiedere un prestito alla volta mi è sembrato di capire. Credo comunque di
aver collegato male i vari fili(?) agli attributi delle tabelle..