

![visitor badge](https://visitor-badge.glitch.me/badge?page_id=martinimatteo10.ticketbuilder&left_text=Visite%20Totali&right_color=brightgreen)

----

# TicketBuilder
TicketBuilder for https://github.com/IngSW-unipv/Progetto-D22.git

Il programma si occupa di generare dei biglietti in formato PDF per il nostro progetto universitario.

I biglietti creati, verranno salvati nella cartella `src/main/resources/results`, ma il programma è adattabile a qualsiasi esigenza.

I biglietti generati si basano su dei template pdf modificabili, da noi creati.

## Informazioni:
1. Il programma è stato scritto in Java.
2. Il programma utilizza una libreria esterna: `itextpdf`
3. Quando viene creato un biglietto, viene inizialmente salvato nella cartella di file temporanei di sistema.
4. Il programma, una volta terminata la generazione dei biglietti, cancella il file temporaneo tramite un thread (6 secondi dopo).
5. Nella classe `Test` vengono create 3 tipologie di biglietto.
6. Per vedere i campi modificabili dei pdf, consultare la cartella `src/main/resources/assets/placeholders`, nella quale sono presenti i template pdf, con i relativi nomi dei placeholder.

## Setup:
1. Aggiungi la libreria che si trova in `lib` al progetto.

    Se usi intellij:
    1. Seleziona il progetto.
    2. Clicca su `file` e seleziona `Project Structure...`
    3. Clicca su `Dependencies` (Nella schermata che si apre, si trova sotto al nome del progetto).
    4. Clicca su `+` e seleziona `1 JARs orDirectories...`
    5. Seleziona la libreria `itextpdf` e clicca su `OK`.
    6. Attiva la checkbox nella riga appena comparsa e clicca su `OK`.


2. Eseguire `src/main/java/Test.java` per generare le 3 tipologie di biglietti in formato pdf.

