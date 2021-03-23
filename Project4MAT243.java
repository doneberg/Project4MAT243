
public class Project4MAT243 {

	public static void main(String[] args) {
	double Pab = .15;
	double Pbc = .3;
	double Pbd = .1;
	double An = 50.0;
	double Bn = 50.0;
	double Cn = 0;
	double Dn = 0;
	double percent = (Pab/100);
		
	
	double Anplus1, Bnplus1, Cnplus1, Dnplus1;
	
	for (int i = 0; i <= 1000; i++)
	{
	Print("A"+ i + " = " + An);
	Print("B" + i + " = " + Bn);
	Print("C"+ i + " = " + Cn);
	Print("D" + i + " = " + Dn);
	
	Anplus1 = An - Math.floor(percent * An * Bn);
	
	Bnplus1 = Bn + Math.floor(percent * An * Bn) - Math.floor((Pbc) * Bn) - Math.floor((Pbd) * Bn);
	
	Cnplus1 = Cn + Math.floor((Pbc) * Bn);
	
	Dnplus1 = Dn + Math.floor((0.1) * Bn);
		
	An	= Anplus1;
	Bn = Bnplus1;
	Cn = Cnplus1;
	Dn = Dnplus1;
	Print("");
	
	}	
	}

	public static void Print(String str)
	{
		System.out.println(str);
	}
}
