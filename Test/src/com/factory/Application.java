package com.factory;

public class Application
{

    public static void main(String[] args)
    {
        Converter  rpadConvert=new RpadConverter();
        rpadConvert.convertCommon();
        rpadConvert.convertOthers();
    }
}
