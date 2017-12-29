import Canddy.*;


public class Present {

public static void main(String[] args)
{
    double price ;
    int weiht;

    kitkat kitkat1 = new kitkat("KitKat", 19.9, 10,"qwe");
    chypachyps chypachyps1 = new chypachyps("chypachyps",15,5,"asd");
    chokolad chokolad1 = new chokolad("chokolad",20.5,10,"zxc");
    barbarisk barbarisk1 = new barbarisk("barbarisk",2,1,"QAZ)");
    coffe coffe1= new coffe ("coffe",13.5,100,"wsx") ;



price = kitkat1.getPrice() + chypachyps1.getPrice() + chokolad1.getPrice() + barbarisk1.getPrice() +coffe1.getPrice();
weiht = kitkat1.getWeight()+chypachyps1.getWeight()+chokolad1.getWeight()+barbarisk1.getWeight()+coffe1.getWeight();




System.out.println("цена подарков " + price);
System.out.println("вес подарков " + weiht);
System.out.println("подарки" + "\t"+ kitkat1.getBrand()+ "\t" +chypachyps1.getBrand()+ "\t"+chokolad1.getBrand()+ "\t"+barbarisk1.getBrand()+"\t"+coffe1.getBrand());

}
}
