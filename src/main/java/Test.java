import java.io.File;

/**
 *
 * Classe che si occupa di testare il programma
 *
 * @author martinimatteo10 - (<a href="https://github.com/martinimatteo10">Github profile</a>)
 */
public class Test {
    public static void main(String[] args) throws Exception {

        File source = new File(TicketBuilder.DEST);
        String path = "src/main/resources/results/";

        // System.currentTimeMillis usato per avere nomi tutti diversi
        String idTicket = "CS" + System.currentTimeMillis();
        String idVoucher = "VO" + System.currentTimeMillis();
        String idVoucherRegalo = "VOR" + System.currentTimeMillis();

        TicketBuilder ticket = new TicketBuilder("Milano", "Roma", "2022-10-10", "2022-10-10", "07:00", "19:00", "Mario", "Rossi", "1/1/2000",idTicket,"50€","1","0","0","0");
        TicketBuilder voucher = new TicketBuilder(idVoucher,"100€");
        TicketBuilder voucherRegalo = new TicketBuilder(idVoucherRegalo,"200€","Tanti Auguri!");

        //creazione dei file pdf, visualizzavili in cartella "results"
        ticket.createPdf();
            TicketBuilder.copy(source, new File(path.concat(idTicket).concat(".pdf")));
        voucher.createPdf();
            TicketBuilder.copy(source, new File(path.concat(idVoucher).concat(".pdf")));
        voucherRegalo.createPdf();
            TicketBuilder.copy(source, new File(path.concat(idVoucherRegalo).concat(".pdf")));


            //Thread che dopo 5 secondi, cancella il file nella cartella temporanea
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(6000);
                    source.delete();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            t.start();

            //Non conosci la tua cartella temporanea? allora esegui questo comando
            //System.out.println(System.getProperty("java.io.tmpdir"));
    }
}
