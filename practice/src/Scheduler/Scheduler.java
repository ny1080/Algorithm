package Scheduler;

import java.util.Scanner;

public class Scheduler {
    Scanner sc = new Scanner(System.in);

    Event [] events = new Event[100];
    int n=0;


    public void processCommand(){

        while(true){
            System.out.println("$  ");
            String command = sc.next();
            if(command.equals("addevent")){

                String type= sc.next();
                if(type.equals("oneday")){
                    handledAddOneDayEvent();
                }else if(type.equals("duration")){
                    handledAdddurationEvent();
                }else if(type.equals("deadline")){
                    handledAddDedalineEvent();
                }
            }else if(command.equals("list")){
                    handleList();
            }else if(command.equals("show")){

            }else if(command.equals("exit"))
                break;


        }
    }

    private void handleList() {
        //등록되어있는 모든이벤트 출력 n=지금까지 입력한갯수
        for(int i=0; i<n; i++){
            System.out.println(events[i].toString()); //잘이해가안감
        }
    }

    private void handledAddDedalineEvent() {
    }

    private void handledAdddurationEvent() {
    }

    private void handledAddOneDayEvent() {
        System.out.print("   when:");
        
        String dateString = sc.next();
        MyDate date = parseDataSplit(dateString);

        System.out.print("   title:");
        String title = sc.next();

        OneDayEvent ev = new OneDayEvent(title, date);
        addevent(ev);

        System.out.println( ev.toString());
    }

    private void addevent(OneDayEvent ev) {
        events[n++] = ev;
    }

    private MyDate parseDataSplit(String dateString) {
        String [] tokens = dateString.split("/");

        int year = Integer.parseInt(tokens[0]); //문자열을 정수형으로 바꾸는과정
        int month = Integer.parseInt(tokens[1]);
        int date = Integer.parseInt(tokens[2]);

        MyDate d = new MyDate(year, month , date);
        return d;
    }


    public static void main(String [] args){
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}
