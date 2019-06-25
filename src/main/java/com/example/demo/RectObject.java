package com.example.demo;

import java.util.HashSet;

public class RectObject {
	public int x;
	public int y;

	public RectObject(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*@Override public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}*/

	//@Override public boolean equals(Object obj) {
	//	if (this == obj) {
	//		return true;
	//	}
	//	if (obj == null) {
	//		return false;
	//	}
	//	if (getClass() != obj.getClass())
	//		return false;
	//	final RectObject other = (RectObject)obj;
	//	if (x != other.x)
	//		return false;
	//	if (y != other.y) {
	//		return false;
	//	}
	//	return true;
	//}

	/*
	* equals()方法比较的结果相等时，他们无法被同时存储进set集合中，
	* 如果他们进HashSet集合中时，由于他们hashCode()方法的返回值不同，
	* 第二个对象首先按照哈希码计算可能被放进与第一个对象不同的区域中，这样不可能与第一个对象进行equals()比较了，也就可能被存进HashSet集合中了
	* */
	public static void main(String[] args) {
		HashSet<RectObject> set = new HashSet<>();
		RectObject r1 = new RectObject(3,3);
		RectObject r2 = new RectObject(5,5);
		RectObject r3 = new RectObject(3,3);
		set.add(r1);
		set.add(r2);
		set.add(r3);
		set.add(r1);
		System.out.println("size:" + set.size());
	}
}
