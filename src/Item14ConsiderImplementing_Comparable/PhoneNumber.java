package Item14ConsiderImplementing_Comparable;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {

    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber other = (PhoneNumber) o;
        if (areaCode != other.areaCode) return false;
        if (lineNum != other.lineNum) return false;
        if (prefix != other.prefix) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + areaCode;
        result = prime * result + lineNum;
        result = prime * result + prefix;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%4d", areaCode, prefix, lineNum);
    }

    /**
     * Returns the string representation if this phone number. The string consist
     * if twelve characters whose format is "XXX-YYY-ZZZZ", where XXX is the area
     * code , YYY is the prefix, and ZZZZ is the line number. Each of the capital
     * letters represents a single decimal digit
     * <p>
     * If any of the three parts of this phone number is too small to fill up its
     * field, the field is padded with leading zeros. For example, if the value of
     * the line number is 123, the last four characters of the string representation
     * woll be "0123"
     */


    // multiple-field comparable with primitive fields
   /* @Override
    public int compareTo(PhoneNumber o) {
        int result = Short.compare(areaCode, o.areaCode);
        if (result == 0) {
            result = Short.compare(prefix, o.prefix);
            if (result == 0)
                result = Short.compare(lineNum, o.lineNum);
        }
        return result;
    }*/
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    public int compareTo(PhoneNumber pn){
        return COMPARATOR.compare(this,pn);
    }

    private static PhoneNumber randomPhoneNumber(){
        Random rnd = ThreadLocalRandom.current();
        return  new PhoneNumber((short) rnd.nextInt(1000),(short) rnd.nextInt(1000),(short) rnd.nextInt(1000));
    }


}
