package Ex01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    int choice;
    public static void main(String[] args)throws  Exception{
        Scanner sc = new Scanner(System.in);
        DateUtil dateUtil =new DateUtil();

        dateUtil.inputDate();
        System.out.println("Input Date to increase number day(dd/mm/yyyy):");
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        dateUtil.increaseNumberDate(date, dateUtil.getNumber_Date());
        dateUtil.getData();

        System.out.println("Display: "+ dateUtil.toString());

    }
}

