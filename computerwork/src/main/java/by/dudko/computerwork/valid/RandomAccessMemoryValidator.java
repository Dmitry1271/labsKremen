package by.dudko.computerwork.valid;

/**
 * Created by cplus on 28.05.2017.
 */
public class RandomAccessMemoryValidator {
    public static boolean isValidRandomAccessMemory(int randomAccessMemory){
        return randomAccessMemory > 0 && randomAccessMemory < ValidConstants.MAX_RAM;
    }
}
