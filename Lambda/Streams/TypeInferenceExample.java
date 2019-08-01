public class TypeInferenceExample {

    public static void main(String[] args){
        // We call the interface,
        // Give it a name
        // apply lambda expression to get length,

        //StringLengthLambda myLambda = (String s) -> s.length();

        //this lambda is of type stringlengthlambda interface
        //so java runtime can tell the type of argument that will be
        //passed, it simply looks at the interface, so we can get rid off
        //String as java can infer the argument will be of type string
        //it can look like this,

        //StringLengthLambda myLambda = (s) -> s.length();

        //also because there is only one argument we dont need to have the brackets around s
        StringLengthLambda myLambda = s -> s.length();

        //we can also pass this sysout - lambda into a method
        //System.out.println(myLambda.getLength("Roy Bairstow"));

        //it can be pass in like this
        printLambda(myLambda);

        //or
        printLambda(s -> s.length());// in this case we wont need the above lambda expression
        //the argument in printLambda takes a lambda expression, but its interface type is from
        //stringlengthlambda so any argument passed into this method has to have the same
        //signature - that is int return type, and pass a string argument

    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Roy Bairstow"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
