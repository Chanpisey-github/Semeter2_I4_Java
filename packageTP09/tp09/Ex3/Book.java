package tp09.Ex3;

import tp09.Ex1.FieldUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private  String title,isbn,author,category,publishDate;
    private String arability,description;
    ArrayList<Book> listOfBook = new ArrayList<>();

    public Book(){

    }
    private Book(String title,String isbn,String author,String category,String publishDate,String arability,String description){

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", arability='" + arability + '\'' +
                ", description='" + description + '\''+
                '}';
    }
    public void  inputData(){

    Scanner sc = new Scanner(System.in);
    Book book = new Book();
        System.out.print("Input the Book's title: ");
        book.setTitle(sc.nextLine());
        System.out.print("Input the Book's ISBN: ");
        book.setIsbn(sc.nextLine());
        System.out.print("Input the Author: ");
        book.setAuthor(sc.nextLine());
        System.out.print("Input the category: ");
        book.setCategory(sc.nextLine());
        System.out.print("Input the Publish Date: ");
        book.setPublishDate(sc.nextLine());
        System.out.print("Input Arability: ");
        book.setArability(sc.nextLine());
        System.out.print("Input Description: ");
        book.setDescription(sc.nextLine());


        listOfBook.add(book);
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        FieldUtil.checkNullOrEmptyOrBlank(title,"Title");
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        FieldUtil.checkNullOrEmptyOrBlank(isbn,"ISBN");
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        FieldUtil.checkNullOrEmptyOrBlank(author,"Author");
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        FieldUtil.checkNullOrEmptyOrBlank(category,"Category");
        this.category = category;
    }

    public String getArability() {
        return arability;
    }

    public void setArability(String arability) {
        FieldUtil.checkNullOrEmptyOrBlank(arability,"Arability");
        this.arability = arability;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        FieldUtil.checkNullOrEmptyOrBlank(publishDate,"Publish Date");
        this.publishDate = publishDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void Display(){
        for (Book book : listOfBook){
            System.out.print(book+"\n");
        }
    }
}


