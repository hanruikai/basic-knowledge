package com.factory;

public abstract class BasicConverter implements Converter
{
    @Override
    public void convertCommon(){
        
        System.out.println("conveter common attributes");
    }
    
    @Override
    public abstract NetworkDevice convertOthers();

}
