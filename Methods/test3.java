public class test3
{
    public static int answer;
    public static void main(String[] args){
        int number = 1;
        number = addThree(number);//java is pass by value, so we have to assign it again if we wanted
        //edit the above varible using a method.
        addThree(number);
        System.out.println("Main prgramme value is: "+number);
        int sumValue = sum(3, 2);
        //sumvalue now holds 9
        System.out.println("Sum value is: "+sumValue);
        answer = least(3, 4);
        
        answer = greatest(2, 5);
        System.out.println("The least number is: "+ answer);
        System.out.println("The greatest number is: " + answer);
    }
 
public static int addThree(int number){
    System.out.println("The method value is: " + number);

    return number = number +3;
    //return number+= 3
    //return number;

}

//remember a return method must have a return statement like above, for example the 
//one below is wrong
/*
public static String rString(){
    System.out.println("I am not returning anything here");
}
*/

public static int sum(int first, int second){
    return first + second;
}

public static int least(int first, int second){
    if(first<second){
        return first;
    }else{
        return second;
    }
}

public static int greatest(int first, int second){
    if(first>second){
        return first;
    }else {
        return second;
    }
}


}
