class Box{
    double height;
    double width;
    double depth;
}
public class Main{ 
public static void main(String[] args){
    System.out.println("Hello World");
    Box majha_dabbu = new Box();

    majha_dabbu.width = 10;
    majha_dabbu.height = 20;
    majha_dabbu.depth = 69;

    System.out.println("आयतन: " + majha_dabbu.width*majha_dabbu.depth*majha_dabbu.height);
}   
}