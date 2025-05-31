package com.dheerajpatel.main.bean;

public class SalaryInfo extends Object{
	private int baseSal;

	public SalaryInfo(int baseSal)
	{
		this.baseSal = baseSal;
	}

	@Override
	public String toString()
	{
		return " base Salary " + baseSal;
	}

}
