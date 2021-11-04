public interface IEntityRepository<T> {
    void add(T entity); //entity genelde veritabanı nesnesi anlamina gelir.
    void delete(T entity);
    void update(T entity);
} //artik bu interface bu tiplerin tamami için çalisacaktir.
