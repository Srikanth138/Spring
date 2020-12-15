package com.nt.comps;

public class IndexBased {
	private int m1,m2,m3;

	private IndexBased(int m1, int m2, int m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "IndexBased [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}	
}
