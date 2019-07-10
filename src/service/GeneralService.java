package service;

public interface GeneralService<T> {
    T[] findAll();
    void find(int index);
    void add(T t);
    void replace(T t, int index);
    void remove(int index);
}
