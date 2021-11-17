interface SI
{
	public double si(double p,double r,double t);
}
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SI s=(var p,var r,var t)->p*r*t/100;
		System.out.println(s.si(2000, 3, 1));
	}

}