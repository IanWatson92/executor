package iw.executor;

import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import java.util.logging.Logger;
import java.util.logging.Level;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Service {

	private Logger _logger;

	private final ExecutorService pool;
	
	public Service() {
		_logger = Logger.getLogger(this.getClass().getName());

		pool = Executors.newFixedThreadPool(3);

		long threadId = Thread.currentThread().getId();
		System.out.println("Service thread id " + threadId);

		pool.execute(new Runnable() {
			public void run() {
				long threadAsyncId = Thread.currentThread().getId();
				System.out.println("Run in different thread");
				System.out.println("Async thread id " + threadAsyncId);
			}
		});

		pool.execute(new Runnable() {
			public void run() {
				long threadAsyncId = Thread.currentThread().getId();
				System.out.println("Run in different thread");
				System.out.println("Async thread id " + threadAsyncId);
			}
		});

		pool.execute(new Runnable() {
			public void run() {
				long threadAsyncId = Thread.currentThread().getId();
				System.out.println("Run in different thread");
				System.out.println("Async thread id " + threadAsyncId);
			}
		});

		pool.execute(new Runnable() {
			public void run() {
				long threadAsyncId = Thread.currentThread().getId();
				System.out.println("Run in different thread");
				System.out.println("Async thread id " + threadAsyncId);
			}
		});

		pool.execute(new Runnable() {
			public void run() {
				long threadAsyncId = Thread.currentThread().getId();
				System.out.println("Run in different thread");
				System.out.println("Async thread id " + threadAsyncId);
			}
		});

		pool.execute(new Runnable() {
			public void run() {
				long threadAsyncId = Thread.currentThread().getId();
				System.out.println("Run in different thread");
				System.out.println("Async thread id " + threadAsyncId);
			}
		});

		pool.shutdown();

	}

	public static void main(String[] args) {
		Service service = new Service();
		
    }
}
