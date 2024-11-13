/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmg;

import java.util.*;
public class Inventory {
    List<Garment>garments=new ArrayList<>();
    void addGarment(Garment garment){
        garments.add(garment);
    }
    void removeGarment(String id){
        garments.removeIf(garment -> garment.id.equals(id));
    }
    Garment findGarment(String id){
        for(Garment garment:garments){
            if(garment.id.equals(id)){
                return garment;
            }
        }
        return null;
    }
}
