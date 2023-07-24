package com.apispringappdb.apispringappdb; 

import org.springframework.web.bind.annotation.RestController;
import com.apispringappdb.apispringappdb.data.InputVal;
import com.apispringappdb.apispringappdb.response.ResponseService;
import com.apispringappdb.apispringappdb.servicerepository.DataBaseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AppController {
      

    @Value("${db_url}")
    private String dburl;
    
    @PostMapping(value="appSpring/val/inputVal")
    public ResponseEntity<ResponseService> postMethodName (@RequestBody InputVal ip) {
        
    int internalFlag=1;
   try{
    if(ip.getFlag()==0){
        
        DataBaseService dbs=new DataBaseService(ip);
        internalFlag=dbs.serviceDB(internalFlag,dburl);
    }
}catch(Exception e)
{
    internalFlag=1;
}

 ResponseService rp=new ResponseService(); 
if(internalFlag==1){
    rp.setResponse("Input error");
    return new ResponseEntity<>(rp, HttpStatus.BAD_REQUEST);
}else{
    rp.setResponse("Success");
    return new ResponseEntity<>(rp, HttpStatus.OK);
}

}
}

