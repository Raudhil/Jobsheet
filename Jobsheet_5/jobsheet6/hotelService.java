package Jobsheet_5.jobsheet6;

public class hotelService {
    
    hotel [] rooms = new hotel[5];
    int id;

    void tambah(hotel H){
        if (id < rooms.length) {
            rooms[id] = H;
            id++;
        } else{
            System.out.println("Hotel Penuh!");
        }
    }

    void tampilAll(){
        for (hotel m : rooms) {
            m.tampil();
            System.out.println("================================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxmin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxmin].bintang) {
                    idxmin = j;
                }
            }
            hotel tmp = rooms[idxmin];
            rooms[idxmin] = rooms[i];
            rooms[i] = tmp;
        }
    }

}
