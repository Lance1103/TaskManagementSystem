package fr.efrei.repository;

public interface IRepository<T, ID>{
    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);
}
/*IRepository.java
IRepository interface class
Author: Thabiso Kama
Date: 22 March 2025
 */