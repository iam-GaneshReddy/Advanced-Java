package Youtube.abhishekverma.Concurrency.demo2;

import java.util.concurrent.locks.Lock;

public class CounterServiceImpl implements CounterService{
    private int count;
    private Lock lock;

    public CounterServiceImpl(Lock lock) {
        super();
        this.lock = lock;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void incrementCount() {
        lock.lock();
        ++count; // count = count + 1
        lock.unlock();
    }
}
