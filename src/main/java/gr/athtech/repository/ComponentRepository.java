package gr.athtech.repository;

import java.util.List;

public interface ComponentRepository<T> {

    int addItem(T t);
    boolean deleteItem(int id);
    T getItemById(int id);
    List<T> getAll();

}
