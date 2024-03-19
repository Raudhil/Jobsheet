package minggu5;

public class carMain {
    public static void main(String[] args) {
        
        car sm = new car(8);

        sm.top_acc[0] = 6816;
        sm.top_acc[1] = 3921;
        sm.top_acc[2] = 4360;
        sm.top_acc[3] = 4058;
        sm.top_acc[4] = 6255;
        sm.top_acc[5] = 3700;
        sm.top_acc[6] = 4180;
        sm.top_acc[7] = 4180;
        
        System.out.println("Top acceleration tertingginya adalah " + sm.topSpeed(sm.top_acc, 7 , 0));
        System.out.println("Top acceleration terendahnya adalah " + sm.bottomSpeed(sm.top_acc, 7 , 0));

        car sm2 = new car(8);

        sm2.top_power[0] = 728;
        sm2.top_power[1] = 575;
        sm2.top_power[2] = 657;
        sm2.top_power[3] = 609;
        sm2.top_power[4] = 703;
        sm2.top_power[5] = 553;
        sm2.top_power[6] = 609;
        sm2.top_power[7] = 631;

        int average = sm2.averageSpeed(sm2.top_power);

        System.out.println("Rata rata top powernya adalah " + average);

        
        

        

        

        
    }
}
