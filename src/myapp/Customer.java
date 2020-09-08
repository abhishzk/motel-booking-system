package myapp;

class Customer {
	public int id;
	public String name;
	public String cont;

	public Customer(int i, String n, String c) {
		id = i;
		name = n;
		cont = c;
	}

	public String readName() {
		return name;
	}

	public int readID() {
		return id;
	}

	public String readPerson() {
		return "\nID : " + id + ", Name : " + name + ", Contact : " + cont;
	}
}
