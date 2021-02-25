package com.nt.beans;

public interface WebContainer  {
	
	public   RequestHandler getHandler(); // java 8 featur interface default 
	
	default void  handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::"+data+"---->"+this.hashCode());
		
		//Trandtional Dependency lookup code
		RequestHandler rh=getHandler(); //
		rh.processingRequest(data);
		System.out.println("WebContainer :: request processing completed with data::"+data);
	}
}