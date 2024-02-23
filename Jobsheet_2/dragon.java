package Jobsheet_2;

public class dragon {
    
    int x,y,width = 10,height = 10;
    String perintah = "Over";

    void moveLeft(){
        x -= 1;
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        detectCollision(x,y);
    }

    void moveRight(){
        x += 1;
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        detectCollision(x,y);
    }

    void moveUp(){
        y -= 1;
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        detectCollision(x,y);
    }

    void moveDown(){
        y += 1;
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        detectCollision(x,y);
    }

    void detectCollision(int x, int y){
        if (x > 10 || x < 1 || y > 10 || y < 1) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }
}
