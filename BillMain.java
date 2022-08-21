package staticexample;



public class BillMain {



		public static void main(String[] args) {
			Bill b=new Bill(51,9);
			System.out.println(b);
			Bill b1=new Bill();
			b1.setBillNumber(4567);
			b1.setNoofUnits(56);
			b1.setCostperUnit(7);
			
			System.out.println(b1.getNoofUnits());
			System.out.println(b1.getCostperUnit());

		}

	}
