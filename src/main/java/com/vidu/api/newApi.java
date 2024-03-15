package com.vidu.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newApi {
	
	
	@GetMapping("/test3")
	public String testApi() {
		
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//		driver.get("https://live.nowgoal13.com/");
//	   driver.manage().window().maximize();
//	   List<Long> ids = driver.findElements(By.xpath("//tr[@class='tds']")).stream()
//				.map(element1 -> element1.getAttribute("id")).map(e -> e.substring(4, e.length())).map(e -> Long.parseLong(e))
//				.collect(Collectors.toList());
		return "that bai" ;
	}

}
