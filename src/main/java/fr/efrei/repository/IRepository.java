//230136982 - Faranani Khangale
package fr.efrei.repository;

public interface IRepository<T,ID> {

    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

}
