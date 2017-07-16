
import data.RestConsumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afr
 */


public class WebApp {
    
    public static void main(String[] args) {
        String key = "5x1x6xf0x5x02xf8xx1x7x8x8xax0x2x";
        String address = "http://food2fork.com/api";
        RestConsumer rc = new RestConsumer(key, address);
        System.out.println("hello webapp");
    }
    
    
}
