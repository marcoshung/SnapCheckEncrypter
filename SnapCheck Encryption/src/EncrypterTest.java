import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncrypterTest {

	//checks to ensure dimensions (rows and columns) are correct
	@Test
	void testDimensions() {
		Encrypter test1 = new Encrypter("chillout");
		char[][] grid1 = test1.encrypted;
		assertEquals(grid1.length, 3);
		assertEquals(grid1[0].length, 3);
		
		Encrypter test2 = new Encrypter("feedthedog");
		char[][] grid2 = test2.encrypted;
		assertEquals(grid2.length, 3);
		assertEquals(grid2[0].length, 4);
		
		Encrypter test3 = new Encrypter("haveaniceday");
		char[][] grid3 = test3.encrypted;
		assertEquals(grid3.length, 3);
		assertEquals(grid3[0].length, 4);
		
		Encrypter test4 = new Encrypter("if man was meant to stay on the ground god would have given us roots");
		char[][] grid4 = test4.encrypted;
		assertEquals(grid4.length, 7);
		assertEquals(grid4[0].length, 8);
	}
	
	//tests final message
	@Test
	void testEncodedMessage() {
		Encrypter test1 = new Encrypter("chillout");
		assertEquals(test1.encoded, "clu hlt io");
		
		Encrypter test2 = new Encrypter("feedthedog");
		assertEquals(test2.encoded, "fto ehg ee  dd");
		
		Encrypter test3 = new Encrypter("haveaniceday");
		assertEquals(test3.encoded, "hae and via ecy");
		
		Encrypter test4 = new Encrypter("if man was meant to stay on the ground god would have given us roots");
		assertEquals(test4.encoded, "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn  sseoau");
	}

}
