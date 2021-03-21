package Ex01;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class DateUtil {
    private Date Date_start;
    private Date Date_end;
    private int number_Date;
    static Scanner sc = null;
    static final String DB_url = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String Password = "";
    public DateUtil(){
    }

    @Override
    public String toString() {
        return "DateUtil{" +
                "Date_start=" + Date_start +
                ", Date_end=" + Date_end +
                ", number_Date=" + number_Date +
                '}';
    }

    // Number_date
    public int getNumber_Date() {
        return this.number_Date;
    }

    public void setNumber_Date(int number_Date) {
        this.number_Date = number_Date;
    }

    // Compare Date with Date
    public void subtractionDate(Date date_start,Date date_end){
        if (date_start.compareTo(date_end) < 0){
            int DiffTime = (int)(date_end.getTime() - date_start.getTime());
            this.number_Date = DiffTime / (1000*60*60*24);
        }else{
            this.number_Date=0;
        }
    }
    // Date_start
    public Date getDate_start() {
        return Date_start;
    }
    public void setDate_start(Date date_start) {
        Date_start = date_start;
    }
    // Date_end
    public Date getDate_end() {
        return Date_end;
    }
    public void setDate_end(Date date_end) {
        Date_end = date_end;
    }

    public void inputDate(){
        sc = new Scanner(System.in);
        System.out.println("Input Start Date By format(dd/mm/yyyy): ");
        try {
            setDate_start(new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()));
        } catch (ParseException e) {
            System.out.println("Input Wrong Format");
            e.printStackTrace();
        }

        System.out.println("Input end date by format(dd/MM/yyyy):");
        try {
            setDate_end(new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()));
        }catch (Exception e){
            System.out.println("Input Wrong format");
            e.printStackTrace();
        }
        subtractionDate(getDate_start(),getDate_end());
        createDatabase();
    }

    public void increaseNumberDate(Date date,int numberDay){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(date);
        }catch (Exception e){
            System.out.println("Invalid Format ");
            e.printStackTrace();
        }
        calendar.add(Calendar.DAY_OF_MONTH,numberDay);
        System.out.println("Increase Date: "+ simpleDateFormat.format(calendar.getTime()));
    }

    public void createDatabase(){
        // connect and Create Database using JDBC
        Connection connection = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(DB_url,
                    USER,Password);
            stmt = connection.createStatement();
            String sqlDB = "CREATE DATABASE IF NOT EXISTS 'date_database'; ";
            String sqlTable = "create table IF NOT EXISTS 'Dateutil'(DateId int not null auto_increment primary key," +
                    "date_start DATE, end_date DATE,number_days int)";
            stmt.executeUpdate(sqlDB);
            stmt.executeUpdate(sqlTable);
            System.out.println("DataBase was Created..");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (stmt != null){
                    stmt.close();
                }
            }catch (SQLException sqlException){
            }
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        }

    }
    public void insertData(Date date_start,Date date_end,int number_days){
        // Insert Data into Database
        Connection connection = null;
        java.sql.Date sql_start_date = new java.sql.Date(date_start.getTime());
        java.sql.Date sql_end_date = new java.sql.Date(date_end.getTime());
        System.out.println(sql_start_date.toString());
        System.out.println(sql_end_date.toString());
        if (String.valueOf(number_days) != null || !String.valueOf(date_start).equals(null)){
            try {
                connection = DriverManager.getConnection(DB_url,USER,Password);
                Statement stmt = connection.createStatement();
                stmt.executeUpdate("use 'date_database'");
                stmt.executeUpdate("insert into 'Dateutil'('date_start','end_date','number_days') values(Date'"+ sql_start_date.toString()+"" +
                        "',DATE'" + sql_end_date.toString()+ "'," + number_days+ ");");

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    }
    public void getData() throws SQLException {
        // Get data fromm Database
        Connection connection = null;
        Statement stmt = connection.createStatement();
        try {
            connection = DriverManager.getConnection(DB_url,USER,Password);
            stmt.executeUpdate("use 'date_database'");
            ResultSet result = stmt.executeQuery("select * from Dateutil");
            while (result.next()){
                System.out.println("{id:" + result.getString("DateId")+",startdate:"+ result.getString("date_start")+",enddate:"
            + result.getString("end_date")+ ",numberdays:"+ result.getInt("number_days")+" }");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }








}
