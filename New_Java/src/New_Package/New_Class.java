package New_Package;

class Old_Class{
	int i=10;
}

class New_Class extends Old_Class{
	int i=20;
	
	void Nitesh(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main (String [] args) {
	New_Class n=new New_Class();
	n.Nitesh(30);
	}
}