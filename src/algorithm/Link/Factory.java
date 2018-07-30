package algorithm.Link;

public class Factory {
    private Factory(){}
    public static Link getLinkInstance(){
        return new LinkImpl();
    }
}
