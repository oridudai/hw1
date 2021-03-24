package il.ac.tau.cs.sw1.ex1;

public class Assignment1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = Integer.parseInt(args[2]);
			int x2 = x*x;
			int y2 = y*y;
			int z2 = z*z;
			if (x<1 || y<1 || z<1) {
				System.out.println("The input ("+x+", "+y+", "+z+") does not define a valid triangle!");

			}
			else if (x+y<=z || y+z<=x || x+z<=y) {
				System.out.println("The input ("+x+", "+y+", "+z+") does not define a valid triangle!");

			}
			else if(x2+y2 == z2 || y2+z2 == x2 || x2+z2==y2) {
				System.out.println("The input ("+x+", "+y+", "+z+") defines a valid right triangle!");
			
			}
			else {
				System.out.println("The input ("+x+", "+y+", "+z+") defines a valid triangle!");
			}


		}

	}