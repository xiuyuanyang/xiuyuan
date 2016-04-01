package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("CardService")
public class CardServiceImp implements CardService{

    @Autowired
    CardMapper cardMapper;
	
	public String downLoad() {
		// TODO Auto-generated method stub
		return null;
	}

	public int upLoad(String jsonCard) {
		// TODO Auto-generated method stub
		return 0;
	}

}
