import java.util.Scanner;
public class Library
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
