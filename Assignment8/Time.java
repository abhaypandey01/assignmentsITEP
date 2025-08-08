import java.util.Scanner;

class Time{
    private int hour;
    private int minute;
    private int second;
    private int day;

    public Time(){}

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public Time add(Time t){
        Time temp = new Time();
        temp.hour = this.hour + t.hour;
        temp.minute = this.minute + t.minute;
        temp.second = this.second + t.second;

        if(temp.hour >= 24){
            temp.day++;
            temp.hour %= 24;
        }

        if(temp.minute >= 24){
            temp.hour++;
            temp.minute %= 60;
        }

        if(temp.second >= 24){
            temp.minute++;
            temp.second %= 60;
        }

        return temp;
    }

    public void add(Time t1, Time t2){
        this.hour = t1.hour + t2.hour;
        this.minute = t1.minute + t2.minute;
        this.second = t1.second + t2.second;

        if(this.hour >= 24){
            this.day++;
            this.hour %= 24;
        }

        if(this.minute >= 24){
            this.hour++;
            this.minute %= 60;
        }

        if(this.second >= 24){
            this.minute++;
            this.second %= 60;
        }
    }

    public void display(){
        System.out.println(day + "\t\t" + hour + "\t\t" + minute + "\t\t" + second);
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour, minute and Seconds (1st): ");
        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();
        int second2 = sc.nextInt();
        Time t1 = new Time(hour2, minute2 , second2);
        System.out.println("Enter hour, minute and Seconds (2nd): ");
        int hour3 = sc.nextInt();
        int minute3 = sc.nextInt();
        int second3 = sc.nextInt();
        Time t2 = new Time(hour3 , minute3 , second3);
        Time t3 = new Time();
        Time t4 = t1.add(t2);
        t3.add(t1, t2);
        System.out.println("Day" + "\t\t" + "Hour" + "\t\t" + "Minute" + "\t\t" + "Second");
        //t3.display();
        t4.display();
    }
}