package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Random Login Credentials Addon */
public class RandomLoginCredentials {
  /**
   * Factory method for RandomEmail */
  public static RandomEmail getRandomEmail() {
    return new RandomEmail();
  }

  /**
   * Factory method for RandomEmail
   * @param localPart Type a custom local-part string (optional)
   * @param domain Type a custom domain (optional)
   * @param localPartLength Select the local-part length (between 5-15)
   * @param isLower Include lower-case characters? (true/false)
   * @param isUpper Include upper-case characters? (true/false)
   * @param isSpecial Include special characters? (true/false) */
  public static RandomEmail randomEmail(String localPart, String domain, int localPartLength,
      boolean isLower, boolean isUpper, boolean isSpecial) {
    return new RandomEmail(localPart,domain,localPartLength,isLower,isUpper,isSpecial);
  }

  /**
   * Factory method for RandomPassword */
  public static RandomPassword getRandomPassword() {
    return new RandomPassword();
  }

  /**
   * Factory method for RandomPassword
   * @param passwordLength Choose the password length (between 8-15)
   * @param specialCharacters Include special characters? (true/false)
   * @param digits Include digits? (true/false)
   * @param upperCase Include upper-case letters? (true/false)
   * @param lowerCase Include lower-case letters? (true/false) */
  public static RandomPassword randomPassword(int passwordLength, boolean specialCharacters,
      boolean digits, boolean upperCase, boolean lowerCase) {
    return new RandomPassword(passwordLength,specialCharacters,digits,upperCase,lowerCase);
  }

  /**
   * Factory method for RandomUsername */
  public static RandomUsername getRandomUsername() {
    return new RandomUsername();
  }

  /**
   * Factory method for RandomUsername
   * @param length Enter the username length (between 3-12). Default: 6 characters */
  public static RandomUsername randomUsername(int length) {
    return new RandomUsername(length);
  }

  /**
   * Random Email Address.  */
  public static class RandomEmail extends ActionProxy {
    /**
     * Type a custom local-part string (optional) (INPUT) */
    public String localPart;

    /**
     * Type a custom domain (optional) (INPUT) */
    public String domain;

    /**
     * Select the local-part length (between 5-15) (INPUT) */
    public int localPartLength;

    /**
     * Include lower-case characters? (true/false) (INPUT) */
    public boolean isLower;

    /**
     * Include upper-case characters? (true/false) (INPUT) */
    public boolean isUpper;

    /**
     * Include special characters? (true/false) (INPUT) */
    public boolean isSpecial;

    /**
     * The result email address (OUTPUT) */
    public String emailAddress;

    public RandomEmail() {
      this.setDescriptor(new ProxyDescriptor("uhFWuHjwpU-gl6uzWR5TXA", "main.Addons.RandomEmail"));
    }

    public RandomEmail(String localPart, String domain, int localPartLength, boolean isLower,
        boolean isUpper, boolean isSpecial) {
      this();
      this.localPart = localPart;
      this.domain = domain;
      this.localPartLength = localPartLength;
      this.isLower = isLower;
      this.isUpper = isUpper;
      this.isSpecial = isSpecial;
    }
  }

  /**
   * Random Password.  */
  public static class RandomPassword extends ActionProxy {
    /**
     * Choose the password length (between 8-15) (INPUT) */
    public int passwordLength;

    /**
     * Include special characters? (true/false) (INPUT) */
    public boolean specialCharacters;

    /**
     * Include digits? (true/false) (INPUT) */
    public boolean digits;

    /**
     * Include upper-case letters? (true/false) (INPUT) */
    public boolean upperCase;

    /**
     * Include lower-case letters? (true/false) (INPUT) */
    public boolean lowerCase;

    /**
     * Result password (OUTPUT) */
    public String generatedPassword;

    public RandomPassword() {
      this.setDescriptor(new ProxyDescriptor("uhFWuHjwpU-gl6uzWR5TXA", "main.Addons.RandomPassword"));
    }

    public RandomPassword(int passwordLength, boolean specialCharacters, boolean digits,
        boolean upperCase, boolean lowerCase) {
      this();
      this.passwordLength = passwordLength;
      this.specialCharacters = specialCharacters;
      this.digits = digits;
      this.upperCase = upperCase;
      this.lowerCase = lowerCase;
    }
  }

  /**
   * Random Username.  */
  public static class RandomUsername extends ActionProxy {
    /**
     * Enter the username length (between 3-12). Default: 6 characters (INPUT) */
    public int length;

    /**
     * The result parameter (OUTPUT) */
    public String result;

    public RandomUsername() {
      this.setDescriptor(new ProxyDescriptor("uhFWuHjwpU-gl6uzWR5TXA", "main.Addons.RandomUsername"));
    }

    public RandomUsername(int length) {
      this();
      this.length = length;
    }
  }
}
