package com.vumi.appdemo.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.vumi.interfaces.PolicyComponent;

public class PolicyManager {

    private static PolicyManager instance;
    private static final String FILE_NAME = "module.properties";

    private Properties properties;

    private PolicyManager () {
        properties = new Properties();
    }

    public static PolicyManager getInstance () {
        return instance;
    }

    private void loadProperties (String basePath) {

        String filePath = basePath + FILE_NAME;

        try (FileInputStream stream = new FileInputStream(filePath)) {

            properties.load( stream );

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static void init(String basePath) throws Exception {

        instance = new PolicyManager();
        instance.loadProperties(basePath);

        if( instance.properties.isEmpty() ) 
            throw new Exception("No se puede inicializar el componente de pólizas");

    }

    public PolicyComponent getPolicyComponent ( String issue ) {

        String propertyName = (issue == null || issue.isEmpty()) ? "policy" : "policy." + issue.toLowerCase();

        if( !properties.containsKey(propertyName) ) 
            return null;

        PolicyComponent policyComponent = null;
        String classNameComponent = properties.getProperty(propertyName);

        try {

            Class<?> classComponent = Class.forName(classNameComponent);
            if(classComponent != null) {

                Object obj = classComponent.getDeclaredConstructor().newInstance();

                if(obj instanceof PolicyComponent) {
                    policyComponent = (PolicyComponent) obj;
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }


        return policyComponent;

    }
}
