package ch5;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockHelper implements AutoCloseable {
	public ReentrantLock lock;

	public ReentrantLock getLock() {
		return lock;
	}

	@Override
	public void close() throws Exception {
		lock.unlock();
	}
}
