/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


/**
 *
 * @author 
 */
public class RestConsumer {
    private String key = "";
    private String address = "";
    
    public RestConsumer(String key, String address){
        this.key = key;
        this.address = address;
        String url = address+"/search?key="+this.key+"&q=shredded%20chicken";
        System.out.println(url);
        
        // TODO: 
        // 1. check that url is correct
        // 2. perform a web request to that url
        // 3. save result as JSON or XML and print contents
    }
    
}
