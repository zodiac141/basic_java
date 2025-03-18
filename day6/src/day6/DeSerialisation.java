package day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialisation {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("/home/zodiac-141/IdeaProjects/card.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            CardDetails card;
          Object obj;
          while((obj=ois.readObject())!=null) {
              card = (CardDetails) obj;
              System.out.println("Card Number :" + card.getCardNumber());
              System.out.println("Card Holder Name :" + card.getCardHolderName());
              System.out.println("Month :" + card.getMonth());
              System.out.println("Year :" + card.getYear());
              System.out.println("CVV :" + card.getCvv());
              System.out.println("-----");
          }
          ois.close();
          fis.close();
        }
        catch (IOException  | ClassNotFoundException e){
           // e.printStackTrace();
          }
        }
    }

