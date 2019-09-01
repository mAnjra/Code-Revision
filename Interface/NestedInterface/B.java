package NestedInterface;

public class B implements A.nestedIF {
    // look at how we implement the nested interface we call the class first use '.' and the the nested interface
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true; // x>=0;
    }
}
