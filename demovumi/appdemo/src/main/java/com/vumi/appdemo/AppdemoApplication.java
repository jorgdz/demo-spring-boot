package com.vumi.appdemo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vumi.appdemo.manager.PolicyManager;

@SpringBootApplication(scanBasePackages = "com.vumi.appdemo")
public class AppdemoApplication {

	public static void main(String[] args) throws Exception {
		PolicyManager.init( getBaseFilePath() );
		SpringApplication.run(AppdemoApplication.class, args);
	}

	private static String getBaseFilePath () {
        String path = AppdemoApplication.class.getProtectionDomain()
            .getCodeSource().getLocation().getPath();

        File pathFile = new File(path);

        if( pathFile.isFile() ){

            path = pathFile.getParent();
            if( !path.endsWith(File.separator) ) path += File.separator;

        }

        return path;
    }

}
