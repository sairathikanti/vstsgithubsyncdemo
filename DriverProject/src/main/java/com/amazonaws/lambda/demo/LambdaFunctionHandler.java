package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.sai.demo.Place;
import com.sai.test.Name;

public class LambdaFunctionHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);

        
        
        System.out.println("printing from lambda 1"+Name.getName()+" ");
        System.out.println("printing from lambda 2"+Place.getPlace()+" ");
       // System.out.println("printing from lambda 3"+College.getCollege()+" ");
        // TODO: implement your handler
        return "Hello from Lambda!";
    }

}
