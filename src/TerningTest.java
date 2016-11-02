import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TerningTest {

		@Test
		public void test() {
			Shaker test = new Shaker();
			
			//Initials+er variable
			boolean end1 = false;
			boolean end2 = false;
			boolean end3 = false;
			boolean end4 = false;
			boolean end5 = false;
			boolean end6 = false;
			int en = 0;
			int to = 0;
			int tre = 0;
			int fire = 0;
			int fem = 0;
			int seks = 0;
			int i = 0;
			
			//Dice roll, 60000 times, every eye is counted
			while(i<60000)
			{
				test.getDie1().setRoll();
				switch (test.getDie1().getRoll())
				{
				case 1 : en++;
				break;
				case 2 : to++;
				break;
				case 3 : tre++;
				break;
				case 4 : fire++;
				break;
				case 5 : fem++;
				break;
				case 6 : seks++;
				break;
				}
				i++;
				
				//Boolean deceleration. Deviation of 400 from 10000 allowed:
			}
			if(en>9600 && en<10400) 
			{
				end1 = true;
			}
			else 
			{
				end1 = false;
			}
			
			if(to>9600 && to<10400) 
			{
				end2 = true;
			}
			else 
			{
				end2 = false;
			}
			
			if(tre>9600 && tre<10400) 
			{
				end3 = true;
			}
			else 
			{
				end3 = false;
			}
			
			if(fire>9600 && fire<10400) 
			{
				end4 = true;
			}
			else 
			{
				end4 = false;
			}
			
			if(fem>9600 && fem<10400) 
			{
				end5 = true;
			}
			else 
			{
				end5 = false;
			}
			
			if(seks>9600 && seks<10400) 
			{
				end6 = true;
			}
			else 
			{
				end6 = false;
			}
			
				//Testing and printing of results
				System.out.println("en = " + en);
				Assert.assertTrue(end1);
				System.out.println("to = " + to);
				Assert.assertTrue(end2);
				System.out.println("tre = " + tre);
				Assert.assertTrue(end3);
				System.out.println("fire = " + fire);
				Assert.assertTrue(end4);
				System.out.println("fem = " + fem);
				Assert.assertTrue(end5);
				System.out.println("seks = " + seks);
				Assert.assertTrue(end6);
			
		}

	}
