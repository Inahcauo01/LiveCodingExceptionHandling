package com.example.demos.exeption;

import java.util.HashMap;
import java.util.Map;

public class FahdException extends Exception{
    private Map<Integer , String> integerStringMap;


    public FahdException(Map<Integer , String> integerStringMap){
        this.integerStringMap = integerStringMap;
    }

    public Map<Integer, String> getIntegerStringMap() {
        return integerStringMap;
    }
}
