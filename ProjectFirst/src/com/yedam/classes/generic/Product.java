package com.yedam.classes.generic;

public class Product<T, M> { // T,M은 제네릭 표현입니다.
	T kind;
	M model;

	public void setKind(T kind) {
		this.kind = kind;
	}

	public T getkind() {
		return this.kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public M getModel() {
		return this.model;
	}
}
