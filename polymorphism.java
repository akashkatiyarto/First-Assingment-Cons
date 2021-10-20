import java.util.Scanner;
interface item{
    public void read();
    public void show();
}

class Book implements item{
    protected String name;
    protected String author;
    protected String publication;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Name :");
        name=sc.nextLine();
        System.out.print("Enter Author Name :");
        author=sc.nextLine();
        System.out.print("Enter Publication :");
        publication=sc.nextLine();
    }
    public void show(){
        System.out.println("Book Name :"+name);
        System.out.println("Author :"+author);
        System.out.println("Publication :"+publication);
    }
}
class Dvd implements item{
    protected String title;
    protected String director;
    protected String category;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Title :");
        title=sc.nextLine();
        System.out.print("Enter Director Name :");
        director=sc.nextLine();
        System.out.print("Enter Category :");
        category=sc.nextLine();
    }
    public void show(){
        System.out.println("Title :"+title);
        System.out.println("Director :"+director);
        System.out.println("Category :"+category);
    }
}
public class Program
{
    public static void main(String []args){
       item i;
       char x;
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<5;j++){
            System.out.print("Book or DVD <b/d> ");
            x=sc.next().charAt(0);
            if(x=='b'){
                i=new Book();
                i.read();
                i.show();
            }
            else if(x=='d'){
                i=new Dvd();
                i.read();
                i.show();
            }
        }

    }
}


