public class Main{
    public static void main(String[] args){
        Money a = new Money(10, 50);
        Money b = new Money(5, 56);
        Money c = a.plus(b);//declares c as a reference to an object of type money, at this point c does not refer to an actual(or created) object
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}