import Canddy.*;


public class Present {

public static void main(String[] args)
{
    double price;
    int weiht;

    kitkat kitkat1 = new kitkat("KitKat", 19.9, 10,"qwe");
    chypachyps chypachyps1 = new chypachyps("chypachyps",15,5,"asd");
    chokolad chokolad1 = new chokolad("chokolad",20.5,10,"zxc");
    barbarisk barbarisk1 = new barbarisk("barbarisk",2,1,"QAZ)");
    coffe coffe1= new coffe ("coffe",13.5,100,"wsx") ;



price = kitkat1.price + chypachyps1.price + chokolad1.price + barbarisk1.price +coffe1.price;
weiht = kitkat1.weight+chypachyps1.weight+chokolad1.weight+barbarisk1.weight+coffe1.weight;




System.out.println("цена подарков " + price);
System.out.println("вес подарков " + weiht);
System.out.println("подарки" + "\t"+ kitkat1.brand+ "\t" +chypachyps1.brand+ "\t"+chokolad1.brand+ "\t"+barbarisk1.brand+"\t"+coffe1.brand);

}
}
