package day6;

import javax.smartcardio.Card;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialisation {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("/home/zodiac-141/IdeaProjects/card.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            CardDetails card1=new CardDetails(1234567891234567L,"Faraan",2002,5,38);
            CardDetails card2=new CardDetails(1234567891234567L,"Ahmed",2003,6,83);
            CardDetails card3=new CardDetails(1234567891234567L,"Hashmi",2004,10,113);
            oos.writeObject(card1);
            oos.writeObject(card2);
            oos.writeObject(card3);
            oos.close();
            fos.close();
            System.out.println("Object serialised");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
