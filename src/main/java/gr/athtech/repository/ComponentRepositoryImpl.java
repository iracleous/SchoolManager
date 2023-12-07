package gr.athtech.repository;

import java.util.List;

/*
Hibernate library as implementation of ORM wiil be used
The database will be H2, embedded SQL database


 */

public class ComponentRepositoryImpl<T> implements ComponentRepository<T> {
    @Override
    public int addItem(T t) {
        return 0;
    }

    @Override
    public boolean deleteItem(int id) {
        return false;
    }

    @Override
    public T getItemById(int id) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public boolean updateItem(T t) {
        return false;
    }
}
