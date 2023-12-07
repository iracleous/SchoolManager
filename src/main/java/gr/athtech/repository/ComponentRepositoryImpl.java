package gr.athtech.repository;

import java.util.List;

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
}
