
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        String title;
        String auther;
        String publisher;
        String ISBN;
        float price;
        while (true){
            System.out.println("功能列表\n==========");
            System.out.println("1.新增書籍");
            System.out.println("2.查詢書籍");
            System.out.println("3.書籍資訊");
            int function = sc.nextInt();
            switch (function){
                case 1:
                    System.out.println("書名:\t");
                    title = sc.next();
                    System.out.println("作者:\t");
                    auther = sc.next();
                    System.out.println("出版社:\t");
                    publisher = sc.next();
                    System.out.println("ISBN:\t");
                    ISBN = sc.next();
                    System.out.println("價格:\t");
                    price = sc.nextFloat();
                    Book book1 = new Book(title,auther,publisher,ISBN,price);
                    book.add(book1);
                    break;
                case 2:
                    System.out.println("1.以書名查詢");
                    System.out.println("2.以作者查詢");
                    System.out.println("3.以出版社查詢");
                    System.out.println("4.以ISBN查詢");
                    System.out.println("5.以價格查詢");
                    int function1 = sc.nextInt();
                    switch (function1){
                        case 1:
                            System.out.println("請輸入書名:\t");
                            title = sc.next();
                            for (int i = 0;i < book.size() ;i++){
                                String x = book.get(i).getTitle();
                                if (x.equals(title)){
                                    System.out.println("書名:" + book.get(i).getTitle());
                                    System.out.println("作者:" + book.get(i).getAuther());
                                    System.out.println("出版社:" + book.get(i).getPublisher());
                                    System.out.println("ISBN:" + book.get(i).getISBN());
                                    System.out.println("價格:" + book.get(i).getPrice());
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("請輸入作者:\t");
                            auther = sc.next();
                            for (int i = 0;i < book.size() ;i++){
                                String x = book.get(i).getAuther();
                                if (x.equals(auther)){
                                    System.out.println("書名:" + book.get(i).getTitle());
                                    System.out.println("作者:" + book.get(i).getAuther());
                                    System.out.println("出版社:" + book.get(i).getPublisher());
                                    System.out.println("ISBN:" + book.get(i).getISBN());
                                    System.out.println("價格:" + book.get(i).getPrice());
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("請輸入出版社:\t");
                            publisher = sc.next();
                            for (int i = 0;i < book.size() ;i++){
                                String x = book.get(i).getPublisher();
                                if (x.equals(publisher)){
                                    System.out.println("書名:" + book.get(i).getTitle());
                                    System.out.println("作者:" + book.get(i).getAuther());
                                    System.out.println("出版社:" + book.get(i).getPublisher());
                                    System.out.println("ISBN:" + book.get(i).getISBN());
                                    System.out.println("價格:" + book.get(i).getPrice());
                                    break;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("請輸入ISBN:\t");
                            ISBN = sc.next();
                            for (int i = 0;i < book.size() ;i++){
                                String x = book.get(i).getISBN();
                                if (x.equals(ISBN)){
                                    System.out.println("書名:" + book.get(i).getTitle());
                                    System.out.println("作者:" + book.get(i).getAuther());
                                    System.out.println("出版社:" + book.get(i).getPublisher());
                                    System.out.println("ISBN:" + book.get(i).getISBN());
                                    System.out.println("價格:" + book.get(i).getPrice());
                                    break;
                                }
                            }
                            break;
                        case 5:
                            System.out.println("請輸入價格:\t");
                            price = sc.nextInt();
                            for (int i = 0;i < book.size() ;i++){
                                float x = book.get(i).getPrice();
                                if (x == price){
                                    System.out.println("書名:" + book.get(i).getTitle());
                                    System.out.println("作者:" + book.get(i).getAuther());
                                    System.out.println("出版社:" + book.get(i).getPublisher());
                                    System.out.println("ISBN:" + book.get(i).getISBN());
                                    System.out.println("價格:" + book.get(i).getPrice());
                                    break;
                                }
                            }
                            break;

                    }
                    break;
                case 3:
                    System.out.println("你現在有" + book.size() + "本書");
                    break;
                default:
                    break;
            }
        }
    }
}

class Book{
    String title;
    String auther;
    String publisher;
    String ISBN;
    float price;

    Book(String title,String auther,String publisher,String  ISBN,float price){
        setTitle(title);
        setAuther(auther);
        setISBN(ISBN);
        setPublisher(publisher);
        setPrice(price);
//        this.title = title;
//        this.auther = auther;
//        this.publisher = publisher;
//        this.ISBN = ISBN;
//        this.price = price;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0){
            System.out.println("價格不可能為負\t自動設定價格為200");
            this.price = 200;
        }else {
            this.price = price;
        }
    }

    public String getISBN() {

        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN.length() < 13){
            System.out.println("輸入的ISBN碼錯誤");
            this.ISBN = "0000000000000";
        }else {
            this.ISBN = ISBN;
        }
    }

    public String getPublisher() {

        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuther() {

        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}