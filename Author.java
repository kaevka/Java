import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        this.name=n;
        this.email=e;
        this.gender=g;
    }
    public Author(String n, String e){
        this.name=n;
        this.email=e;
        this.gender='M';
    }
    public Author(String n){
        this.name=n;
        this.email="";
        this.gender='M';
    }
    public Author(){
        this.name="Lev Tolstoy";
        this.email="lev@mail.ru";
        this.gender='M';
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(String name){
        return name;
    }
    public String getEmail(String email){
        return email;
    }
    public char getGender(char gender){
        return gender;
    }
    public String toString(){
        return this.name+" is "+this.gender+" and "+this.name+"'s email: "+this.email;
    }
    public void Output(){
        System.out.println(name+" is "+gender+" and "+name+"'s email: "+email);
    }
}
