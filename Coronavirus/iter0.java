package Coronavirus;
import java.io.*;

class iter0 {
public String name;
public int id;
iter0(String name,int id)
{
	this.name=name;
	this.id=id;
}
public boolean equals(Object obj)//"Object" is a class and obj is a reference(bcs reference object class ka hota hai)
{
	if(this==obj)
		return true;
	if(obj==null || obj.getClass()!=this.getClass())
		return false;
	iter0 objiter=(iter0)obj;
	return (objiter.name == this.name && objiter.id == this.id);
}
public int hashcode()
{
	return (this.id);
}
}
