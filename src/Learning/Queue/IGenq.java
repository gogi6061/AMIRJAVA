package Learning.Queue;

abstract interface IGen<T> {
    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;

}
