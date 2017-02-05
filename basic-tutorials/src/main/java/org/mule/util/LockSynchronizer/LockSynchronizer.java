package org.mule.util.LockSynchronizer;

import java.util.concurrent.Semaphore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LockSynchronizer {

	private static final int MAX_PERMIT_NUMBER =1;
	private static final Logger log = LogManager.getLogger(LockSynchronizer.class);
	private Semaphore semaphore;
	
	public void lock(){
		try{
		getLock().acquire();
			
		}catch(InterruptedException e){
			e.printStackTrace();
	}
	}
	public void unlock(){
		getLock().release();
	}
	
	public Semaphore getLock(){
		if(semaphore == null){
			this.semaphore = new Semaphore(MAX_PERMIT_NUMBER);
		}
		return this.semaphore;
		}
		
	}
	

