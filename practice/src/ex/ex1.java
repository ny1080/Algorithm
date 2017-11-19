package ex;

import java.util.ArrayList;

public class ex1 {
    public static void main(String [] args) throws Exception{

        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("222");
        list.add("333");
        System.out.println(list);

        list.add(0,"111");
        System.out.println(list);

        System.out.println("index="+ list.indexOf("333"));

        list.remove("333");
        System.out.println(list);

        System.out.println(list.remove("333"));

        for (int i=0; i<list.size(); i++){
            list.set(i, i+"");
        }

        System.out.print("{");
        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i)+ " ,");;
        }
        System.out.println("}");
    }
}
