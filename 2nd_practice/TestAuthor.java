import java.lang.*;
public class TestAuthor {
    public static void main(String[] args){
        Author d1 = new Author("Jane Ostin","jane@mail.ru",'W');
        Author d2 = new Author("Fedor Dostoevskiy","fedor@mail.ru");
        Author d3 =  new Author("Lev Tolstoy");
        d3.setEmail("lev@mail.ru");
        System.out.println(d1);
        d1.Output();
        d2.Output();
        d3.Output();
    }
}
