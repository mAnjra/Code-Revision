class Box{
    double width;
    double height;
    double depth;

    //Contructor that takes object as argument
    Box(Box ob){
        width = ob.width;//ob here is the object thats passed thourghs value and all boxes are made out of three variables 
        height = ob.height;//if i were to comment out depth for instance, then the myclone object will not work as intended
        depth = ob.depth;
    }

    //constructor used when all dimensions specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth; 
    }

    //contructor used when dimensions not specified
    Box(){
        width  = -1;
        height = -1;
        depth  = -1; //-1 represents uninitialised box
    }

    //constructor used when cube is created
    Box(double len){
        width = height = depth = len;
    }
    
    //return computed volume of box
    double volume(){
        return width * height * depth;
    }
}

class BoxMain{
    public static void main(String[] args){
        //Creating boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        //get volume for first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1: "+vol);

        //get volume for second  box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2: "+vol);

        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube: "+vol);

        //get volume for clone
        vol = myclone.volume();
        System.out.println("Volume of myclone: "+vol);

    }
}