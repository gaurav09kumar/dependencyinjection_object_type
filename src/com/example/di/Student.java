package com.example.di;

public class Student {
	int id;

	public void setId(int id) {
		this.id = id;
	}

	MathCheat mathCheat;

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
		System.out.println("Hey my Id is : " + id);
	}
}
