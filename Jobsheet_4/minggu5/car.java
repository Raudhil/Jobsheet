package minggu5;

public class car {
    public int top_acc[];
    public int top_power[];
    public int top;
    public int bottom;

    public car(int speed){
        this.top_acc = new int[speed];
        this.top_power = new int[speed];
    }

    int topSpeed(int top_ac[],int l,int r){
        if (l == r) {
            top =  top_ac[l];
        } else if (top_ac[l] > top_ac[r]) {
            topSpeed(top_ac, l, r + 1);
        } else {
            topSpeed(top_ac, l - 1, r);
        }

        return top;
    }

    int bottomSpeed(int bot_ac[],int l,int r){
        if (l == r) {
            bottom =  bot_ac[r];
        } else if (bot_ac[l] < bot_ac[r]) {
            bottomSpeed(bot_ac, l, r + 1);
        } else{
            bottomSpeed(bot_ac, l - 1, r);
        }

        return bottom;
    }

    int averageSpeed(int power_ac[]){
        int sum = 0;
        for (int i = 0; i < power_ac.length; i++) {
            sum += power_ac[i];
            if (i == power_ac.length - 1) {
                sum = sum/power_ac.length;
            }
        }
        return sum;
    }
}
