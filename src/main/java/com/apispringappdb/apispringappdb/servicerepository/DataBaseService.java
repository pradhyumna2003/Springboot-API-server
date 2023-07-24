package com.apispringappdb.apispringappdb.servicerepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.apispringappdb.apispringappdb.data.InputVal;

public class DataBaseService {

    
    private InputVal ip;
    
    
    public DataBaseService(InputVal ip) {
        this.ip=ip;
     
    }
    public int serviceDB(int internalFlag,String dburl) {

       
        





        String url = dburl;
        
        
        Statement statement = null;
        
        
        try(Connection connection = DriverManager.getConnection(url);){ 
            
         
            
            statement = connection.createStatement();
           
                
            String query = "INSERT INTO cylinder_test( time_val , serial_no , cylinder_type, vld_value,old_value,gross_weight,tare_weight,vld_result_flag,old_result_flag,gross_weight_result_flag,carousel,result_flag,st_due_date,remark ) VALUES ("+ip.getTimeVal().toString()+",'"+ip.getSerialNo()+"',"+ip.getCylinderType().toString()+","+ip.getVldValue().toString()+","+ip.getOldValue().toString()+","+ip.getGrossWeight().toString()+","+ip.getTareWeight().toString()+","+ip.getVldResultFlag().toString()+","+ip.getOldResultFlag().toString()+","+ip.getGrossWeightResultFlag().toString()+","+ip.getCarousel().toString()+","+ip.getResultFlag().toString()+",'"+ip.getStDueDate()+"','"+ip.getRemark()+"')";
        
            statement.executeUpdate(query);
            internalFlag=0;
            
            
        } catch (SQLException e) {
            
            internalFlag=1;
        } finally {
                
            try {
                if (statement != null) {
                    statement.close();
                }
                
            } catch (SQLException e) {  
                internalFlag=1;
            }
        }
    


        return internalFlag;
    }
    
}
