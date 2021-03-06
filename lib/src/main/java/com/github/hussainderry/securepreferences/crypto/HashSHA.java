package com.github.hussainderry.securepreferences.crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Hussain Al-Derry <hussain.derry@gmail.com>
 * @version 0.1
 * */
public class HashSHA {

    /**
     * Hashes the given data using SHA-256
     * @param data the byte data to be hashed
     * @return hashed byte array containing the hash
     * */
    public static byte[] hashUsingSHA256(byte[] data){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(data);
        }catch(NoSuchAlgorithmException e){
            throw new IllegalStateException("Unable to hash!");
        }
    }

    /**
     * Hashes the given data using SHA-512
     * @param data the byte data to be hashed
     * @return hashed byte array containing the hash
     * */
    public static byte[] hashUsingSHA512(byte[] data){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            return digest.digest(data);
        }catch(NoSuchAlgorithmException e){
            throw new IllegalStateException("Unable to hash!");
        }
    }
}
