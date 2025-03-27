package mobilestore;

import java.util.ArrayList;
import java.util.HashMap;


public class MobileStore {
    public HashMap<String, ArrayList<String>> mobiles = new HashMap<>();


    public void addMobile(String company, String model) {
              if (mobiles.containsKey(company)) {
            ArrayList<String> modelList = mobiles.get(company);
            if (!modelList.contains(model)) {
                modelList.add(model);
                System.out.println("Mobile " + model + " added successfully for the company: " + company);
            } else {
                System.out.println("Mobile " + model + " already exists for the company: " + company);
            }
        } else {
            ArrayList<String> modelList = new ArrayList<>();
            modelList.add(model);
            mobiles.put(company, modelList);
            System.out.println("Mobile " + model + " added successfully for the new company: " + company);
        }
    }


    public void searchMobile(String company) {

        if (mobiles.containsKey(company)) {
            ArrayList<String> modelList = mobiles.get(company);
            if (modelList.isEmpty()) {
                System.out.println("No models available for the company: " + company);
            } else {
                System.out.println("Models for " + company + " are: ");
                for (String model : modelList) {
                    System.out.println(model);
                }
            }
        } else {
            System.out.println("Company not found.");
        }
    }


    public void buyMobile(String company, String model) {
        if (mobiles.containsKey(company)) {
            ArrayList<String> modellist = mobiles.get(company);
            if (modellist.contains(model)) {
                modellist.remove(model);
                System.out.println("model has been sold successfully for the company: " + company);

                if (modellist.isEmpty()) {
                    mobiles.remove(company);
                    System.out.println("no more models left for : " + company);
                }
            } else {
                System.out.println("model not found for the company: " + company);
            }
        }
    }

    public static void main(String[] args) {
        MobileStore store = new MobileStore();


        store.addMobile("Nokia", "Nokia 3310");
        store.addMobile("Nokia", "Nokia 3315");
        store.addMobile("Samsung", "Samsung galaxy");
        store.addMobile("Apple", "Iphone16");
        store.searchMobile("Nok");
        store.buyMobile("Nokia", "Nokia 3310");
        store.buyMobile("Nokia", "Nokia 3310");
    }
}