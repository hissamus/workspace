package arrays;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class ArrayJump {
	
	  public static int GetJumpCount(int jump,int fall,int[] walls)
	    {		 
		  int jumpCount=0;
		  for(int wall:walls){
			  if(jump==wall || jump>wall){
				  jumpCount+=1;
			  }
			  else if(jump<wall){
				  int height=0;
				  int wallJumpcount=0;
				  while(!(height>=wall)){
					  height+=jump;					  
					  jumpCount+=1;
					  wallJumpcount+=1;
					  if(height==wall)break;
					  else height -=fall;
				  }
				 // System.out.println("wall-"+wall+"|wall-"+wallJumpcount);
			  }				  
		  }
		  return jumpCount;		    
	    }
	  public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1 = Integer.parseInt(in.nextLine().trim());
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        int ip3_size = 0;
	        ip3_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip3 = new int[ip3_size];
	        int ip3_item;
	        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
	            ip3_item = Integer.parseInt(in.nextLine().trim());
	            ip3[ip3_i] = ip3_item;
	        }
	        output = GetJumpCount(ip1,ip2,ip3);
	        System.out.println(String.valueOf(output));
	    }
	  
	  @Test
	public void testJumpCountWithOneWallSameJumpHeight() throws Exception {
		  int jump=5;
		  int fall=1;
		  int[] walls={5};
		  
		  int count=ArrayJump.GetJumpCount(jump,fall,walls);
		 assertTrue(count==1);
	}
	  
	  @Test
		public void testJumpCountWithTwoWallsSameJumpHeight() throws Exception {
			  int jump=5;
			  int fall=1;
			  int[] walls={5,5};
			  
			  int count=ArrayJump.GetJumpCount(jump,fall,walls);
			 assertTrue(count==2);
		}
	  
	  @Test
		public void testJumpCountWithOneWallJumpHeightLessThanWallHeight() throws Exception {
			  int jump=5;
			  int fall=1;
			  int[] walls={4};
			  
			  int count=ArrayJump.GetJumpCount(jump,fall,walls);
			 assertTrue(count==1);
		}
	  
	  @Test
		public void testJumpCountWithOneWallJumpHeightGreaterThanWallHeight() throws Exception {
			  int jump=5;
			  int fall=1;
			  int[] walls={6};
			  
			  int count=ArrayJump.GetJumpCount(jump,fall,walls);
			 assertTrue(count==2);
		}
	  
	@Test
	public void testJumpCountWithTwoWallsJumpHeightGreaterThanWallHeight() throws Exception {
		int jump = 5;
		int fall = 1;
		int[] walls = { 6,6 };

		int count = ArrayJump.GetJumpCount(jump, fall, walls);
		assertTrue(count == 4);
	}
	
	@Test
	public void testJumpCountWithTwoWallsJumpHeightOneSmallOneBigThanWallHeight() throws Exception {
		int jump = 5;
		int fall = 1;
		int[] walls = { 4,6 };

		int count = ArrayJump.GetJumpCount(jump, fall, walls);
		assertTrue(count == 3);
	}
	
	@Test
	public void testJumpCountWithTwoWallsJumpHeightBothSmallThanWallHeight() throws Exception {
		int jump = 5;
		int fall = 1;
		int[] walls = { 4,4 };

		int count = ArrayJump.GetJumpCount(jump, fall, walls);
		assertTrue(count == 2);
	}
	
	@Test
	public void testRandom() throws Exception {
		/*4 1 5 6 9 11 4 5*/
		
		int jump = 4;
		int fall = 1;
		int[] walls = { 6 ,9, 11, 4 ,5 };//2,3,3,1,2

		int count = ArrayJump.GetJumpCount(jump, fall, walls);
		assertTrue(count == 12);
	}
}
