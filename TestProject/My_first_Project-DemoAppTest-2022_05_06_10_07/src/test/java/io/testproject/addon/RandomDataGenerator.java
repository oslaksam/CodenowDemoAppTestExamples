package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;

/**
 * Proxy for Random Data Generator Addon */
public class RandomDataGenerator {
  /**
   * Factory method for GenerateAge */
  public static GenerateAge getGenerateAge() {
    return new GenerateAge();
  }

  /**
   * Factory method for GenerateAltitude */
  public static GenerateAltitude getGenerateAltitude() {
    return new GenerateAltitude();
  }

  /**
   * Factory method for GenerateBirthday */
  public static GenerateBirthday getGenerateBirthday() {
    return new GenerateBirthday();
  }

  /**
   * Factory method for GenerateBoolean */
  public static GenerateBoolean getGenerateBoolean() {
    return new GenerateBoolean();
  }

  /**
   * Factory method for GenerateChar */
  public static GenerateChar getGenerateChar() {
    return new GenerateChar();
  }

  /**
   * Factory method for GenerateCity */
  public static GenerateCity getGenerateCity() {
    return new GenerateCity();
  }

  /**
   * Factory method for GenerateCountry */
  public static GenerateCountry getGenerateCountry() {
    return new GenerateCountry();
  }

  /**
   * Factory method for GenerateCredicardExpiry */
  public static GenerateCredicardExpiry getGenerateCredicardExpiry() {
    return new GenerateCredicardExpiry();
  }

  /**
   * Factory method for GenerateCredicardNumber */
  public static GenerateCredicardNumber getGenerateCredicardNumber() {
    return new GenerateCredicardNumber();
  }

  /**
   * Factory method for GenerateCredicardType */
  public static GenerateCredicardType getGenerateCredicardType() {
    return new GenerateCredicardType();
  }

  /**
   * Factory method for GenerateCredicardVV */
  public static GenerateCredicardVV getGenerateCredicardVV() {
    return new GenerateCredicardVV();
  }

  /**
   * Factory method for GenerateDecimal */
  public static GenerateDecimal getGenerateDecimal() {
    return new GenerateDecimal();
  }

  /**
   * Factory method for GenerateDepth */
  public static GenerateDepth getGenerateDepth() {
    return new GenerateDepth();
  }

  /**
   * Factory method for GenerateDouble */
  public static GenerateDouble getGenerateDouble() {
    return new GenerateDouble();
  }

  /**
   * Factory method for GenerateFirstName */
  public static GenerateFirstName getGenerateFirstName() {
    return new GenerateFirstName();
  }

  /**
   * Factory method for GenerateFloat */
  public static GenerateFloat getGenerateFloat() {
    return new GenerateFloat();
  }

  /**
   * Factory method for GenerateGender */
  public static GenerateGender getGenerateGender() {
    return new GenerateGender();
  }

  /**
   * Factory method for GenerateLastName */
  public static GenerateLastName getGenerateLastName() {
    return new GenerateLastName();
  }

  /**
   * Factory method for GenerateLatitude */
  public static GenerateLatitude getGenerateLatitude() {
    return new GenerateLatitude();
  }

  /**
   * Factory method for GenerateLongitude */
  public static GenerateLongitude getGenerateLongitude() {
    return new GenerateLongitude();
  }

  /**
   * Factory method for GenerateLoremIpsum */
  public static GenerateLoremIpsum getGenerateLoremIpsum() {
    return new GenerateLoremIpsum();
  }

  /**
   * Factory method for GenerateName */
  public static GenerateName getGenerateName() {
    return new GenerateName();
  }

  /**
   * Factory method for GenerateNatural */
  public static GenerateNatural getGenerateNatural() {
    return new GenerateNatural();
  }

  /**
   * Factory method for GenerateNumberInRange */
  public static GenerateNumberInRange getGenerateNumberInRange() {
    return new GenerateNumberInRange();
  }

  /**
   * Factory method for GenerateNumberInRange
   * @param min Minimal value (default: 0)
   * @param max Maximal value (default: 10,000) */
  public static GenerateNumberInRange generateNumberInRange(String min, String max) {
    return new GenerateNumberInRange(min,max);
  }

  /**
   * Factory method for GenerateParagraph */
  public static GenerateParagraph getGenerateParagraph() {
    return new GenerateParagraph();
  }

  /**
   * Factory method for GeneratePostcode */
  public static GeneratePostcode getGeneratePostcode() {
    return new GeneratePostcode();
  }

  /**
   * Factory method for GeneratePrefix */
  public static GeneratePrefix getGeneratePrefix() {
    return new GeneratePrefix();
  }

  /**
   * Factory method for GenerateSentence */
  public static GenerateSentence getGenerateSentence() {
    return new GenerateSentence();
  }

  /**
   * Factory method for GenerateStreet */
  public static GenerateStreet getGenerateStreet() {
    return new GenerateStreet();
  }

  /**
   * Factory method for GenerateString */
  public static GenerateString getGenerateString() {
    return new GenerateString();
  }

  /**
   * Factory method for GenerateSyllable */
  public static GenerateSyllable getGenerateSyllable() {
    return new GenerateSyllable();
  }

  /**
   * Factory method for GenerateWord */
  public static GenerateWord getGenerateWord() {
    return new GenerateWord();
  }

  /**
   * Random age. Generates random age */
  public static class GenerateAge extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public int result;

    public GenerateAge() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateAge"));
    }
  }

  /**
   * Random altitude. Generates random altitude */
  public static class GenerateAltitude extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateAltitude() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateAltitude"));
    }
  }

  /**
   * Random birthday. Generates random birthday */
  public static class GenerateBirthday extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateBirthday() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateBirthday"));
    }
  }

  /**
   * Random boolean. Generates random boolean */
  public static class GenerateBoolean extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public boolean result;

    public GenerateBoolean() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateBoolean"));
    }
  }

  /**
   * Random char. Generates random char */
  public static class GenerateChar extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public Character result;

    public GenerateChar() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateChar"));
    }
  }

  /**
   * Random city. Generates random city */
  public static class GenerateCity extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateCity() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateCity"));
    }
  }

  /**
   * Random country. Generates random country */
  public static class GenerateCountry extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateCountry() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateCountry"));
    }
  }

  /**
   * Random credit-card expiry date. Generates random credit-card expiry date */
  public static class GenerateCredicardExpiry extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateCredicardExpiry() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateCredicardExpiry"));
    }
  }

  /**
   * Random credit-card number. Generates random credit-card number */
  public static class GenerateCredicardNumber extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateCredicardNumber() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateCredicardNumber"));
    }
  }

  /**
   * Random credit-card type. Generates random credit-card type */
  public static class GenerateCredicardType extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateCredicardType() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateCredicardType"));
    }
  }

  /**
   * Random credit-card verification value. Generates random credit-card verification value */
  public static class GenerateCredicardVV extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateCredicardVV() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateCredicardVV"));
    }
  }

  /**
   * Random decimal. Generates random decimal */
  public static class GenerateDecimal extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateDecimal() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateDecimal"));
    }
  }

  /**
   * Random depth. Generates random depth */
  public static class GenerateDepth extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateDepth() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateDepth"));
    }
  }

  /**
   * Random double. Generates random double */
  public static class GenerateDouble extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public Double result;

    public GenerateDouble() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateDouble"));
    }
  }

  /**
   * Random first name. Generates random first name */
  public static class GenerateFirstName extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateFirstName() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateFirstName"));
    }
  }

  /**
   * Random float. Generates random float */
  public static class GenerateFloat extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public Float result;

    public GenerateFloat() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateFloat"));
    }
  }

  /**
   * Random gender. Generates random gender */
  public static class GenerateGender extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateGender() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateGender"));
    }
  }

  /**
   * Random last name. Generates random last name */
  public static class GenerateLastName extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateLastName() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateLastName"));
    }
  }

  /**
   * Random latitude. Generates random latitude */
  public static class GenerateLatitude extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateLatitude() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateLatitude"));
    }
  }

  /**
   * Random longitude. Generates random longitude */
  public static class GenerateLongitude extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateLongitude() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateLongitude"));
    }
  }

  /**
   * Random lorem ipsum. Generates random lorem ipsum */
  public static class GenerateLoremIpsum extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateLoremIpsum() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateLoremIpsum"));
    }
  }

  /**
   * Random name. Generates random name */
  public static class GenerateName extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateName() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateName"));
    }
  }

  /**
   * Random natural. Generates random natural */
  public static class GenerateNatural extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public Integer result;

    public GenerateNatural() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateNatural"));
    }
  }

  /**
   * Random number in a range. Generates random number between a specified range */
  public static class GenerateNumberInRange extends ActionProxy {
    /**
     * Minimal value (default: 0) (INPUT) */
    public String min;

    /**
     * Maximal value (default: 10,000) (INPUT) */
    public String max;

    /**
     * Random result (OUTPUT) */
    public int result;

    public GenerateNumberInRange() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateNumberInRange"));
    }

    public GenerateNumberInRange(String min, String max) {
      this();
      this.min = min;
      this.max = max;
    }
  }

  /**
   * Random paragraph. Generates random paragraph */
  public static class GenerateParagraph extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateParagraph() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateParagraph"));
    }
  }

  /**
   * Random postcode. Generates random postcode */
  public static class GeneratePostcode extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GeneratePostcode() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GeneratePostcode"));
    }
  }

  /**
   * Random prefix. Generates random prefix */
  public static class GeneratePrefix extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GeneratePrefix() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GeneratePrefix"));
    }
  }

  /**
   * Random sentence. Generates random sentence */
  public static class GenerateSentence extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateSentence() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateSentence"));
    }
  }

  /**
   * Random street. Generates random street */
  public static class GenerateStreet extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateStreet() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateStreet"));
    }
  }

  /**
   * Random string. Generates random string */
  public static class GenerateString extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateString() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateString"));
    }
  }

  /**
   * Random syllable. Generates random syllable */
  public static class GenerateSyllable extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateSyllable() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateSyllable"));
    }
  }

  /**
   * Random word. Generates random word */
  public static class GenerateWord extends ActionProxy {
    /**
     * Random result (OUTPUT) */
    public String result;

    public GenerateWord() {
      this.setDescriptor(new ProxyDescriptor("-kT4Fi1xFk6PF8xkHU4vDg", "GenerateWord"));
    }
  }
}
