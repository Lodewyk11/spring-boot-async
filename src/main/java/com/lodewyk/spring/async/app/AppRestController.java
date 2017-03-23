package com.lodewyk.spring.async.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

	@Autowired
	private WorkerBean worker;
	
	@RequestMapping("/longProcess")
    public String longProcess() {

        System.out.println("Starting long process...");
        worker.call();
        
        
        System.out.println("Done!");
        return "{success: 1}";

    }
}
