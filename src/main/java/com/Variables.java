package com;

import javax.ejb.Local;
import java.util.List;
import java.util.Map;

@Local
public interface Variables {
    Map<String,String> getSystemVariables();
}
