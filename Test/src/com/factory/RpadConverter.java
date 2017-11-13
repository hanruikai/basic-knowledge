package com.factory;

public class RpadConverter extends BasicConverter
{

    @Override
    public NetworkDevice convertOthers()
    {
        System.out.println("convert others");
        return new NetworkDevice();
    }

}
