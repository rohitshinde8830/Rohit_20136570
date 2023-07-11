package com;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int isbnno;
    private String bookName;
    private String author;

    public int getIsbnno() {
        return isbnno;
    }

    public void setIsbnno(int isbnno) {
        this.isbnno = isbnno;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book2) {
        bookList.add(book2);
    }

    public boolean isEmpty() {
        return bookList.isEmpty();
    }

    public ArrayList<Book> viewAllBooks() {
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public int countnoofbook(String bname) {
        int count = 0;
        for (Book book : bookList) {
            if (book.getBookName().equals(bname)) {
                count++;
            }
        }
        return count;
    }
}

public class librarymanupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        while (true) {
            System.out.println("1) Add Book");
            System.out.println("2) Display all book details");
            System.out.println("3) Search Book by author");
            System.out.println("4) Count number of books ");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
             

            switch (choice) {
                case 1:
                    Book book = new Book();
                    System.out.print("Enter the isbn no: ");
                    int isbn = sc.nextInt();
                    
                    System.out.print("Enter the book name: ");
                    String bookName = sc.nextLine();
                    
                    System.out.print("Enter the author name: ");
                    String author = sc.nextLine();

                    book.setIsbnno(isbn);
                    book.setBookName(bookName);
                    book.setAuthor(author);

                    l.addBook(book);
                    break;
                    
                case 2:
                	ArrayList <Book> allbooks =l.viewAllBooks();
                	for(Book b:allbooks) {
                		System.out.println("isbn no: "+b.getIsbnno());
                		System.out.println("auther name: "+b.getAuthor());
                		System.out.println("book name: "+b.getBookName());
                	}
                	break;
                case 3:
                	System.out.println("Auther name: ");
                	String AutherName=sc.next();
                	ArrayList<Book> booksByAuthor = l.viewBooksByAuthor(AutherName);
                	for (Book b : booksByAuthor) {
                        System.out.println("isbn no: " + b.getIsbnno());
                        System.out.println("Book name: " + b.getBookName());
                        System.out.println("Author name: " + b.getAuthor());
                	}
                	break;
                    case 5:
                    System.exit(0);
            }
        }
    }
}
