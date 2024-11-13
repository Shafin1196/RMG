/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmg;

import java.util.*;

public class Order {
    String orderId,orderDate;
    List<Garment> garments=new ArrayList<>();
    double totalAmount;
    void addGarment(Garment garment){
        garments.add(garment);
    }
    double calculateTotalAmount(){
        for(Garment garment:garments){
         totalAmount+=garment.price;
        }
        return totalAmount;
    }
    void printOrderDetails(){
        for(Garment garment:garments){
            System.out.println(garment.id+"\t"+garment.color+"\t"+garment.name+"\t"+totalAmount);
        }
    }
}
