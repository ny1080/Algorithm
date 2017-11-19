package Scheduler;

public class OneDayEvent extends Event {

    public MyDate date; //이부분 왜 new연산자 안쓰는지?

    public OneDayEvent(String title, MyDate date){
        super(title);
        this.date = date;
    }

    public String toString() {
        return title + "," + date.toString();
    }
}
