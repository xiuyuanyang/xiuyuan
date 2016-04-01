package hello;

import java.util.List;

public interface CardMapper {

    int create(MyCard card);
    int delete(int id);
    int modify(MyCard card);
     
    MyCard findById(int id);
    MyCard findByUser(MyCard card);
    List<MyCard> findAll();
    List<MyCard> findAll(MyCard card);
     
    int count();
	
}
