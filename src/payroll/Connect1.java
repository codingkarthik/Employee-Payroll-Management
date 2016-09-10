/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
import com.mongodb.*;
/**
 *
 * @author Karthikeyan
 */
public class Connect1 {
    public DBCollection connect(String CollectionName){
        try{
        MongoClient mc=new MongoClient("localhost",27017);
        DB d=mc.getDB("db1");
        DBCollection dbc=d.getCollection(CollectionName);
        return dbc;
        
    }catch(Exception e){
    return null;}
            
            }
}
