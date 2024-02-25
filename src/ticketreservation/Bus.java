package ticketreservation;
import java.util.ArrayList;
import java.util.List;

public class Bus {

    //2-plaka ve koltuk no
    public String plateNumber;

    public List<String> seats = new ArrayList<>();//koltuk no

    public Bus(String plaka){
        this.plateNumber = plaka;
        for (int i = 1; i < 33; i++) {
            this.seats.add(String.valueOf(i)); //String'listin içine Integer koyabilmemiz için bu metodu kullanıyoruz.

        }

    }
}

