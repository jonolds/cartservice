package edu.uark.commands;

public interface ResultCommandInterface<T>
{
	T execute();
}

interface VoidCommandInterface
{
	void execute();
}