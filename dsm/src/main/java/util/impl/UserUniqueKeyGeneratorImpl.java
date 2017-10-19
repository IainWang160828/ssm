package util.impl;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import util.IUserUniqueKeyGenerator;
@Service
public class UserUniqueKeyGeneratorImpl implements IUserUniqueKeyGenerator{

	public String UniqueKeyGenerator() {
		Date date= new Date();
		Random r =new Random();
		String uniqueKey=Long.toString((date.getTime()))+ Math.abs(r.nextInt() % 10);
		return uniqueKey;
	}

}
