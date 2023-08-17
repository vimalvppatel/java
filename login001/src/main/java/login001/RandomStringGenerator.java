package login001;


import java.util.Random;

public class RandomStringGenerator {

private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

public static String generateRandomString(int length) {
Random random = new Random();
StringBuilder sb = new StringBuilder(length);
for (int i = 0; i < length; i++) {
int randomIndex = random.nextInt(CHARACTERS.length());
char randomChar = CHARACTERS.charAt(randomIndex);
sb.append(randomChar);
}
return sb.toString();
}

public static void main(String[] args) {
int desiredLength = 10;
String randomString = generateRandomString(5);
System.out.println("Random String: " + randomString);
}
}
	
  


