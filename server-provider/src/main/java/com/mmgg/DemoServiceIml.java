package com.mmgg;

public class DemoServiceIml implements DemoService {
    @Override
    public String getProtocol() {
        return "hello:protocol";
    }
}
