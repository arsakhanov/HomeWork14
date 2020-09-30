package com;

import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@ApplicationPath("/webapi")
public class RestApplication extends Application{}
