/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author Ahmad Muzakhy
 */
import java.util.HashMap;

public class CobaMap1841720116zakhy {
     public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        
        hMapItem.put("1", "Shampo");
        hMapItem.put("2", "Biskuit");
        hMapItem.put("3", "Sabun");
        System.out.println(hMapItem);
        System.out.format("Banyaknya item: %d\n\n",hMapItem.size());
       
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap\n",mObject);
        System.out.format("Hashmap Item Total : %d\n",hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n",hMapItem.size());
        
    }
}
