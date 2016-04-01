package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CardController {
	
    @Autowired
    private CardService cardService;
	
	@RequestMapping(method=RequestMethod.GET, value="/service/{id}") 
	public String getCard(@PathVariable String id) {

		cardService.downLoad();
		return "get";
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/service") 
	public int addCard(@RequestBody String body) {
		cardService.upLoad();
		return 2;
	}

	@RequestMapping(method=RequestMethod.PUT, value="/service/{id}") 
	public int updateCard(@RequestBody String body) {
		return 3;
	}	

	@RequestMapping(method=RequestMethod.DELETE, value="/service/{id}") 
	public int removeCard(@PathVariable String id) {
		return 4;
	}
	

}
