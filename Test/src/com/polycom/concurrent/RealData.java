package com.polycom.concurrent;

public class RealData implements Data
{
    
    protected  String  result;  
    
    public RealData(String para){  
        StringBuffer sb= new StringBuffer();  
        for(int i=0;i<10;i++){  
            sb.append(para);  
            try{  
                Thread.sleep(5000);  
            }catch(Exception e){  
                  
            }  
            result= sb.toString();  
        }  
    }  

    @Override
    public String getResult()
    {
        return result;
    }

    @Override
    public void setResult(RealData data)
    {
        return;
    }

}
