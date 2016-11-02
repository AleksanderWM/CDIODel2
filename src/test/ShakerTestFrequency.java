/**
 * @author Morten N
 */
package test;
import main.Shaker;
import static org.junit.Assert.*;
import org.junit.Test;

public class ShakerTestFrequency
{

	@Test
	public void testShaker() 
	{
		//Define attributes for test
		Shaker shaker = new Shaker();
		int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0, shakeValue, controlCount = 0;
		float percentTwo = 0, percentThree = 0, percentFour = 0, percentFive = 0, percentSix = 0, percentSeven = 0;
		float percentEight = 0, percentNine = 0, percentTen = 0, percentEleven = 0, percentTwelve = 0;
		
		//While loop for shaker test - Test for 330000 shakes
		while (controlCount < 330000)
		{
			//Shake the dice from the class shaker
			shaker.setShake();
			shakeValue = shaker.getShake();
			
			
			//Switch statement for control count and shake
			switch (shakeValue)
			{
			case 2: two++; controlCount++; break;
			case 3: three++; controlCount++; break;
			case 4: four++; controlCount++; break;
			case 5: five++; controlCount++; break;
			case 6: six++; controlCount++; break;
			case 7: seven++; controlCount++; break;
			case 8: eight++; controlCount++; break;
			case 9: nine++; controlCount++; break;
			case 10: ten++; controlCount++; break;
			case 11: eleven++; controlCount++; break;
			case 12: twelve++; controlCount++;
			}	
	    }
		
		//Calculate percent for every possible shake
		percentTwo = (float)two/controlCount*100;
		percentThree = (float)three/controlCount*100;
		percentFour = (float)four/controlCount*100;
		percentFive = (float)five/controlCount*100;
		percentSix = (float)six/controlCount*100;
		percentSeven = (float)seven/controlCount*100;
		percentEight = (float)eight/controlCount*100;
		percentNine = (float)nine/controlCount*100;
		percentTen = (float)ten/controlCount*100;
		percentEleven = (float)eleven/controlCount*100;
		percentTwelve = (float)twelve/controlCount*100;
		
		//Printout to confirm result
		System.out.println("Frequency and result of 330000 shakes");
		System.out.println("Total of Two: " + two + " - The frequency is " + percentTwo + "% - Should be around 2.78%");
		System.out.println("Total of Three: " + three + " - The frequency is " + percentThree + "% - Should be around 5.56%");
		System.out.println("Total of Four: " + four + " - The frequency is " + percentFour + "% - Should be around 8.33%");
		System.out.println("Total of Five: " + five + " - The frequency is " + percentFive + "% - Should be around 11.11%");
		System.out.println("Total of Six: " + six + " - The frequency is " + percentSix + "% - Should be around 13.89%");
		System.out.println("Total of Seven: " + seven + " - The frequency is " + percentSeven + "% - Should be around 16.67%");
		System.out.println("Total of Eight: " + eight + " - The frequency is " + percentEight + "% - Should be around 13.89%");
		System.out.println("Total of Nine: " + nine + " - The frequency is " + percentNine + "% - Should be around 11.11%");
		System.out.println("Total of Ten: " + ten + " - The frequency is " + percentTen + "% - Should be around 8.33%");
		System.out.println("Total of Eleven: " + eleven + " - The frequency is " + percentEleven + "% - Should be around 5.56%");
		System.out.println("Total of Twelve: " + twelve + " - The frequency is " + percentTwelve + "% - Should be around 2.78%");
		
		//Test assertEquals on 330000 shakes
		assertEquals(9000,two,500);
		assertEquals(18000,three,600);
		assertEquals(27000,four,800);
		assertEquals(36000,five,1000);
		assertEquals(45000,six,1200);
		assertEquals(54000,seven,1400);
		assertEquals(45000,eight,1200);
		assertEquals(36000,nine,1000);
		assertEquals(27000,ten,800);
		assertEquals(18000,eleven,600);
		assertEquals(9000,twelve,500);
		assertEquals(330000,controlCount);		
	}

}