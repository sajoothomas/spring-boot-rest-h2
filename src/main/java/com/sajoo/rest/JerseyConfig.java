package com.sajoo.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.sajoo.endpoint.EmployeeEndpoint;

@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(EmployeeEndpoint.class);
    }
}
